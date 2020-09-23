package reservation_repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import reservation_entities.Bussiness;

public class BussinessRepository extends BaseRepository<Bussiness> {

	public BussinessRepository() {
		super(Bussiness.class);
	}

	public EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Bussiness");
		EntityManager em = factory.createEntityManager();

		return em;
	}

	public Bussiness findUser(String email, String pass) throws Exception {

		EntityManager em = getEntityManager();
		try {
			String query = "SELECT u FROM UserBean u WHERE u.email " + "= :email AND u.pass  = :pass";

			TypedQuery<Bussiness> q = em.createQuery(query, Bussiness.class);
			q.setParameter("email", email);
			q.setParameter("pass", pass);

			List<Bussiness> result = q.getResultList();

			if (result.size() == 1)
				return result.get(0);
		} catch (Exception e) {
			throw e;
		} finally {
			em.close();
		}

		return null;
	}

	public List<Bussiness> listUsers(String desiredUser) {
		EntityManager em = getEntityManager();
		try {

			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<Bussiness> query = cb.createQuery(Bussiness.class);

			Root<Bussiness> personRoot = query.from(Bussiness.class);

			query.where(cb.like(personRoot.<String> get("email"), cb.parameter(String.class, "containsCondition")));

			TypedQuery<Bussiness> tq = em.createQuery(query);
			tq.setParameter("containsCondition", "%" + desiredUser + "%");
			List<Bussiness> users = tq.getResultList();

			return users;

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
		}

		return null;
	}


}
