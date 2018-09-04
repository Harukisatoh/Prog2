package controle;
import dao.UsuarioDao;
import java.util.List;   
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import modelo.Usuario;
   
@ManagedBean(name="UsuarioMB")
@SessionScoped
public class UsuarioMB {
    
    private Usuario usuario;
    private Usuario aux;
    private List<Usuario> lista;
    private UsuarioDao dao;
    
    public UsuarioMB() {
        usuario = new Usuario();
        dao = new UsuarioDao();
        lista = dao.listarTodos();
    }
    
    public void preparaAlterar(Usuario usuario){
        setAux(usuario);
    } 
    
    public void alterar() {
	dao.alterar(usuario);
	FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Alteração","Usuário alterado com sucesso!"));
    }
    
    public void listarPorNomeParcial() {
        lista = dao.buscarPorNomeParcial(usuario.getNome());
        for(Usuario n: lista){
        System.out.println(n.getNome());}
    }
    
    public void excluir(Usuario usuario) {
	dao.excluir(usuario);
	FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Exclusão","Usuário excluído com sucesso!"));
        lista.remove(usuario);
        listar();
    } 
    
    public void incluir() {
	dao.inserir(usuario);
	FacesContext.getCurrentInstance().addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"Cadastro","Usuário cadastrado com sucesso!"));
        lista.add(usuario);
        limpar();
        listar();
    } 
    
    public void limpar() {
	usuario = new Usuario();
    } 
    
    public void listar() {
	lista = dao.listarTodos();
    } 
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    } 
    
    public List<Usuario> getLista() {
	return lista;
    }
    
    public void setLista(List<Usuario> lista) {
        this.lista = lista;
    }
    
    public Usuario getAux() {
        return aux;
    }
    
    public void setAux(Usuario aux) {
        this.aux = aux;
    } 
    
}