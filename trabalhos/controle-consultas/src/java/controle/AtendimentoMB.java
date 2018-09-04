package controle;
import dao.PacienteDao;
import dao.AtendimentoDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import modelo.Paciente;
import modelo.Atendimento;

@ManagedBean(name="AtendimentoMB")
@SessionScoped
public class AtendimentoMB {
    
    private Atendimento atendimento;
    private Atendimento aux;
    private List<Atendimento> lista;
    private AtendimentoDao dao;
    private PacienteDao pacienteDao;
    private Paciente pacienteSelecionado;
    private List<Paciente> pacientes;
    
    public AtendimentoMB() {
        atendimento = new Atendimento();
        dao = new AtendimentoDao();
        pacienteDao = new PacienteDao();
        lista = dao.listarTodos();
        pacientes = pacienteDao.listarTodos();
        pacienteSelecionado = new Paciente();
    } 
    public void preparaAlterar(Atendimento atendimento){
        setAux(atendimento);
    } 
    public void alterar() {
	dao.alterar(atendimento);
	FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Alteração","Atendimento alterado com sucesso!"));
    }
    public void consultar() {
	long idAtendimento = atendimento.getId();
	atendimento = dao.buscarPorId((int) idAtendimento);
	if (atendimento == null || atendimento.getId()== 0) {
            FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Consulta","Atendimento não encontrado, código: "+idAtendimento));
	} listar();
    }
    public void excluir(Atendimento atendimento) {
	dao.excluir(atendimento);
	FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Exclusão","Atendimento excluído com sucesso!"));
        lista.remove(atendimento);
        listar();
    }
    public void incluir() {
        atendimento.setPaciente(getPacienteSelecionado());
	dao.inserir(atendimento);
	FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Cadastro","Atendimento cadastrado com sucesso!"));
        lista.add(atendimento);
        limpar();
        listar();
    }
    public void limpar() {
	atendimento = new Atendimento();
    }
    public void listar() {
        lista = dao.listarTodos();
    }
    public Atendimento getAtendimento() {
        return atendimento;
    }
    public List<Atendimento> getLista() {
	return lista;
    }
    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }
    public void setLista(List<Atendimento> lista) {
        this.lista = lista;
    }    
    public Paciente getPacienteSelecionado() {
        return pacienteSelecionado;
    }
    public void setPacienteSelecionado(Paciente pacienteSelecionado) {
        this.pacienteSelecionado = pacienteSelecionado;
    }
    public List<Paciente> getPacientes() {
        return pacientes;
    }
    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    public Atendimento getAux() {
        return aux;
    }
    public void setAux(Atendimento aux) {
        this.aux = aux;
    }   
}