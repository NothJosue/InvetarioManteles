package com.inventario.manteles.persistencia;

import com.inventario.manteles.modelo.MesaACrochet;
import com.inventario.manteles.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class MesaACrochetJpaController implements Serializable {

    public MesaACrochetJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public MesaACrochetJpaController() {
        this.emf = Persistence.createEntityManagerFactory("Inventario_MantelesPU");
    }

    public void create(MesaACrochet mesaACrochet) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(mesaACrochet);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(MesaACrochet mesaACrochet) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            mesaACrochet = em.merge(mesaACrochet);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = mesaACrochet.getId();
                if (findMesaACrochet(id) == null) {
                    throw new NonexistentEntityException("The mesaACrochet with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            MesaACrochet mesaACrochet;
            try {
                mesaACrochet = em.getReference(MesaACrochet.class, id);
                mesaACrochet.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The mesaACrochet with id " + id + " no longer exists.", enfe);
            }
            em.remove(mesaACrochet);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<MesaACrochet> findMesaACrochetEntities() {
        return findMesaACrochetEntities(true, -1, -1);
    }

    public List<MesaACrochet> findMesaACrochetEntities(int maxResults, int firstResult) {
        return findMesaACrochetEntities(false, maxResults, firstResult);
    }

    private List<MesaACrochet> findMesaACrochetEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(MesaACrochet.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public MesaACrochet findMesaACrochet(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(MesaACrochet.class, id);
        } finally {
            em.close();
        }
    }

    public int getMesaACrochetCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<MesaACrochet> rt = cq.from(MesaACrochet.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
