package controle;
import dao.UsuarioDao;
import java.io.Serializable;
import java.util.Map;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import modelo.Usuario;

@ManagedBean(name="loginMB")
@SessionScoped
public class LoginMB implements Serializable {
    private Usuario usuario;    
    public LoginMB(){
        usuario = new Usuario();
    }    
    public String autenticar(){
        UsuarioDao usuarioDao = new UsuarioDao();
        Usuario temp;
        temp = usuarioDao.autenticar(getUsuario());
        if (temp == null){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário ou senha inválidos", null));
            return null;  // fica na página
        } // seta usuario na Sessao
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext ectx = context.getExternalContext();
        HttpSession session = (HttpSession) ectx.getSession(true);
        session.setAttribute("usuarioLogado", getUsuario());        
        return "principal"; // vai para o menu
    }
    public String actionLogout(){
        Map sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
        sessionMap.clear();
        return "index";
    }    
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
