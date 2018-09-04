package dao;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaQuery;
import modelo.Medico;
import util.JpaUtil;

public class MedicoDao implements Serializable {
    EntityManager manager;    
    public boolean alterar(Medico medico){
        manager = JpaUtil.getEntityManager();
        manager.getTransaction().begin();
        manager.merge(medico);
        manager.getTransaction().commit();
        manager.close();
        return true;
    }    
    public Medico buscarPorId(int id){
        manager = JpaUtil.getEntityManager();
        Medico medico = manager.find(Medico.class, id);
        manager.close();
        return medico;
    } 
    public Medico buscarPorNome(String nome){
        Medico temp;
        manager = JpaUtil.getEntityManager();
        String consulta = "SELECT c FROM Medico c WHERE c.nome = :nome";
        TypedQuery<Medico> query = manager.createQuery(consulta, Medico.class);
        query.setParameter("nome", nome);
        temp = query.getSingleResult();
        manager.close();
        return temp;
    }
    public List<Medico> buscarPorNomeParcial(String nome) {
        List<Medico> list;
        manager = JpaUtil.getEntityManager();
        String consulta = "SELECT c FROM Medico c WHERE c.nome LIKE CONCAT('%',:nome,'%')";
        TypedQuery<Medico> query = manager.createQuery(consulta, Medico.class);
        query.setParameter("nome", nome);
        list = query.getResultList();
        manager.close();
        return list;
    }    
    public boolean excluir(Medico medico){
        manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction(); 
        tx.begin();
        Medico temp = manager.find(Medico.class, medico.getId());
        manager.remove(temp);
        tx.commit();
        manager.close();
        return true;
    }    
    public boolean inserir(Medico medico){
        manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(medico);
        tx.commit();
        manager.close();
        return true;
    }    
    public List<Medico> listarTodos(){
        manager = JpaUtil.getEntityManager();
        CriteriaQuery<Medico> query = manager.getCriteriaBuilder().createQuery(Medico.class);
        query.select(query.from(Medico.class));
        List<Medico> lista = manager.createQuery(query).getResultList();
        manager.close();
        return lista;
    }
}