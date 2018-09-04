package controle; 
import dao.MedicoDao;
import java.util.List;   
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import modelo.Medico;
   
@ManagedBean(name="MedicoMB")
@SessionScoped
public class MedicoMB {
    
    private Medico medico;
    private Medico aux;
    private List<Medico> lista;
    private MedicoDao dao;
    
    public MedicoMB() {
        medico = new Medico();
        dao = new MedicoDao();
        lista = dao.listarTodos();
    } 
    public void preparaAlterar(Medico medico){
        setAux(medico);
    }    
    public void alterar() {
	dao.alterar(medico);
	FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Alteração","Médico alterado com sucesso!"));
    }
    public void listarPorNomeParcial() {
        lista = dao.buscarPorNomeParcial(medico.getNome());
        for(Medico n: lista){
        System.out.println(n.getNome());}
    }
    public void excluir(Medico medico) {
	dao.excluir(medico);
	FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Exclusão","Médico excluído com sucesso!"));
        lista.remove(medico);
        listar();
    }
    public void incluir() {
	dao.inserir(medico);
	FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Cadastro","Médico cadastrado com sucesso!"));
        lista.add(medico);
        limpar();
        listar();
    }
    public void limpar() {
	medico = new Medico();
    } 
    public void listar() {
        lista = dao.listarTodos();
    } 
    public Medico getMedico() {
        return medico;
    }    
    public void setMedico(Medico medico) {
        this.medico = medico;
    }    
    public List<Medico> getLista() {
	return lista;
    } 
    public void setLista(List<Medico> lista) {
        this.lista = lista;
    }
    public Medico getAux() {
        return aux;
    }
    public void setAux(Medico aux) {
        this.aux = aux;
    }
}