package dao;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import modelo.Usuario;
import util.JpaUtil;

public class UsuarioDao implements Serializable {
    EntityManager manager;
    public boolean alterar(Usuario usuario){
        manager = JpaUtil.getEntityManager();
        manager.getTransaction().begin();
        manager.merge(usuario);
        manager.getTransaction().commit();
        manager.close();
        return true;
    }
    public Usuario buscarPorId(int id){
        manager = JpaUtil.getEntityManager();
        Usuario usuario = manager.find(Usuario.class, id);
        manager.close();
        return usuario;
    }
    public Usuario buscarPorNome(String nome){
        Usuario temp;
        manager = JpaUtil.getEntityManager();
        String consulta = "SELECT c FROM Usuario c WHERE c.nome = :nome";
        TypedQuery<Usuario> query = manager.createQuery(consulta, Usuario.class);
        query.setParameter("nome", nome);
        temp = query.getSingleResult();
        manager.close();
        return temp;
    }
    public List<Usuario> buscarPorNomeParcial(String nome) {
        List<Usuario> list;
        manager = JpaUtil.getEntityManager();
        String consulta = "SELECT c FROM Usuario c WHERE c.nome LIKE CONCAT('%',:nome,'%')";
        TypedQuery<Usuario> query = manager.createQuery(consulta, Usuario.class);
        query.setParameter("nome", nome);
        list = query.getResultList();
        manager.close();
        return list;
    }
    public boolean excluir(Usuario usuario){
        manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction(); 
        tx.begin();
        Usuario temp = manager.find(Usuario.class, usuario.getId());
        manager.remove(temp);
        tx.commit();
        manager.close();
        return true;
    }
    public boolean inserir(Usuario usuario){
        manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(usuario);
        tx.commit();
        manager.close();
        return true;
    }
    public List<Usuario> listarTodos(){
        manager = JpaUtil.getEntityManager();
        CriteriaQuery<Usuario> query = manager.getCriteriaBuilder().createQuery(Usuario.class);
        query.select(query.from(Usuario.class));
        List<Usuario> lista = manager.createQuery(query).getResultList();
        manager.close();
        return lista;
    }
    public Usuario autenticar(Usuario usuario) {
        Usuario temp = null;
        manager = JpaUtil.getEntityManager();
        TypedQuery<Usuario> query = manager.createQuery("SELECT f FROM Usuario f WHERE f.login = :login AND f.senha = :senha", Usuario.class);   
        query.setParameter("login", usuario.getLogin());
        query.setParameter("senha", usuario.getSenha());
        try {temp = query.getSingleResult();} 
        catch(Exception e){ }    
        finally {manager.close();}        
        return temp;
    }    
       
           
     
        
        
        
}
