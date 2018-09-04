package controle;
import dao.PacienteDao;
import java.util.List;   
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import modelo.Paciente;
   
@ManagedBean(name="PacienteMB")
@SessionScoped
public class PacienteMB {
    
    private Paciente paciente;
    private Paciente aux;
    private List<Paciente> lista;
    private PacienteDao dao;
    
    public PacienteMB() {
        paciente = new Paciente();
        dao = new PacienteDao();
        lista = dao.listarTodos();
    }
    public void preparaAlterar(Paciente paciente){
        setAux(paciente);
    } 
    public void alterar() {
        dao.alterar(paciente);
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO, "Alteração","Paciente alterado com sucesso!"));
    }
    public void listarPorNomeParcial() {
        lista = dao.buscarPorNomeParcial(paciente.getNome());
        for(Paciente n: lista){
        System.out.println(n.getNome());}
    }
    public void excluir(Paciente paciente) {
        dao.excluir(paciente);
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Exclusão","Paciente excluído com sucesso!"));
        lista.remove(paciente);
        listar();
    }
    public void incluir() {
        dao.inserir(paciente);
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Cadastro","Paciente cadastrado com sucesso!"));
        lista.add(paciente);
        limpar();
        listar();
    } 
    public void limpar() {
        paciente = new Paciente();
    } 
    public void listar() {
        lista = dao.listarTodos();
    }
    public Paciente getPaciente() {
        return paciente;
    } 
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    } 
    public List<Paciente> getLista() {
        return lista;
    }
    public void setLista(List<Paciente> lista) {
        this.lista = lista;
    }
    public Paciente getAux() {
        return aux;
    }
    public void setAux(Paciente aux) {
        this.aux = aux;
    }
}