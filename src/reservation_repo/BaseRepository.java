package reservation_repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class BaseRepository<A>{

	private Class<A>typeParameter;
	
	public BaseRepository(Class<A> typeParameter) {
		this.typeParameter = typeParameter;	
	}
	
	public EntityManager getEntityManager(){
		EntityManagerFactory factory = Persistence.
				createEntityManagerFactory("User");
		EntityManager em = factory.createEntityManager();
		return em;		
	}
	
	public boolean insert(A entity) throws Exception{
		EntityManager em = getEntityManager();
		
		try{
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
			return true;
		}catch(Exception e){
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
			throw e;
		}finally{
			em.close();
		}
	}
	
	public A findEntity(int id) throws Exception{
		EntityManager em = getEntityManager();
		
		try{
			A entity = em.find(typeParameter, id);
			return entity;
		}catch(Exception e){
			System.out.println(e.getMessage());
			throw e;
		}finally {
			em.close();
		}		
	}
	
	public boolean update(A entity) throws Exception{
		EntityManager em = getEntityManager();
		
		try{
			em.getTransaction().begin();
			em.merge(entity);
			em.getTransaction().commit();
			return true;
		}catch(Exception e){
			em.getTransaction().rollback();
			System.out.println(e.getMessage());
			throw e;
		}finally {
			em.close();
		}
	}
}
