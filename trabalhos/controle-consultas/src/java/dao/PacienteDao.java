package dao;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import modelo.Paciente;
import util.JpaUtil;

public class PacienteDao implements Serializable {
    EntityManager manager;
    public boolean alterar(Paciente paciente){
        manager = JpaUtil.getEntityManager();
        manager.getTransaction().begin();
        manager.merge(paciente);
        manager.getTransaction().commit();
        manager.close();
        return true;
    }    
    public Paciente buscarPorId(int id){
        manager = JpaUtil.getEntityManager();
        Paciente paciente = manager.find(Paciente.class, id);
        manager.close();
        return paciente;
    }        
    public Paciente buscarPorNome(String nome){
        Paciente temp;
        manager = JpaUtil.getEntityManager();
        String consulta = "SELECT c FROM Paciente c WHERE c.nome = :nome";
        TypedQuery<Paciente> query = manager.createQuery(consulta, Paciente.class);
        query.setParameter("nome", nome);
        temp = query.getSingleResult();
        manager.close();
        return temp;
    }
    public List<Paciente> buscarPorNomeParcial(String nome) {
        List<Paciente> list;
        manager = JpaUtil.getEntityManager();
        String consulta = "SELECT c FROM Paciente c WHERE c.nome LIKE CONCAT('%',:nome,'%')";
        TypedQuery<Paciente> query = manager.createQuery(consulta, Paciente.class);
        query.setParameter("nome", nome);
        list = query.getResultList();
        manager.close();
        return list;
    }    
    public boolean excluir(Paciente paciente){
        manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction(); 
        tx.begin();
        Paciente temp = manager.find(Paciente.class, paciente.getId());
        manager.remove(temp);
        tx.commit();
        manager.close();
        return true;
    }    
    public boolean inserir(Paciente paciente){
        manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(paciente);
        tx.commit();
        manager.close();
        return true;
    }    
    public List<Paciente> listarTodos(){
        manager = JpaUtil.getEntityManager();
        CriteriaQuery<Paciente> query = manager.getCriteriaBuilder().createQuery(Paciente.class);
        query.select(query.from(Paciente.class));
        List<Paciente> lista = manager.createQuery(query).getResultList();
        manager.close();
        return lista;
    }
}