package dao;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaQuery;
import modelo.Atendimento;
import util.JpaUtil;

public class AtendimentoDao implements Serializable {
    EntityManager manager;    
    public boolean alterar(Atendimento atndmto){
        manager = JpaUtil.getEntityManager();
        manager.getTransaction().begin();
        manager.merge(atndmto);
        manager.getTransaction().commit();
        manager.close();
        return true;
    }    
    public Atendimento buscarPorId(int id){
        manager = JpaUtil.getEntityManager();
        Atendimento func = manager.find(Atendimento.class, id);
        manager.close();
        return func;
    }       
    public boolean excluir(Atendimento atndmto){
        manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction(); 
        tx.begin();
        Atendimento temp = manager.find(Atendimento.class, atndmto.getId());
        manager.remove(temp);
        tx.commit();
        manager.close();
        return true;
    }    
    public boolean inserir(Atendimento atndmto){
        manager = JpaUtil.getEntityManager();
        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        manager.persist(atndmto);
        tx.commit();
        manager.close();
        return true;
    }    
    public List<Atendimento> listarTodos(){
        manager = JpaUtil.getEntityManager();
        CriteriaQuery<Atendimento> query = manager.getCriteriaBuilder().createQuery(Atendimento.class);
        query.select(query.from(Atendimento.class));
        List<Atendimento> lista = manager.createQuery(query).getResultList();
        manager.close();
        return lista;
    }    
}