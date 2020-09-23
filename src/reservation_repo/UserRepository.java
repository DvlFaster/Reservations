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
import reservation_entities.UserBean;

public class UserRepository extends BaseRepository<UserBean> {

	public UserRepository() {
		super(UserBean.class);
	}

	public EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("User");
		EntityManager em = factory.createEntityManager();

		return em;
	}

	public UserBean findUser(String email, String pass) throws Exception {

		EntityManager em = getEntityManager();
		try {
			String query = "SELECT u FROM UserBean u WHERE u.email " + "= :email AND u.pass  = :pass";

			TypedQuery<UserBean> q = em.createQuery(query, UserBean.class);
			q.setParameter("email", email);
			q.setParameter("pass", pass);

			List<UserBean> result = q.getResultList();

			if (result.size() == 1)
				return result.get(0);
		} catch (Exception e) {
			throw e;
		} finally {
			em.close();
		}

		return null;
	}

	public List<UserBean> listUsers(String desiredUser) {
		EntityManager em = getEntityManager();
		try {

			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<UserBean> query = cb.createQuery(UserBean.class);

			Root<UserBean> personRoot = query.from(UserBean.class);

			query.where(cb.like(personRoot.<String> get("email"), cb.parameter(String.class, "containsCondition")));

			TypedQuery<UserBean> tq = em.createQuery(query);
			tq.setParameter("containsCondition", "%" + desiredUser + "%");
			List<UserBean> users = tq.getResultList();

			return users;

		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			em.close();
		}

		return null;
	}
	
}