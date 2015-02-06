package ecommerce;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TestDAO {

	// Injected database connection:
	@PersistenceContext
	private EntityManager em;

	public TestDAO(){}
	public TestDAO(String name) {
		// TODO Auto-generated constructor stub
	}

	// Stores a new guest:
	@Transactional
	public void persist(TestDB guest) {
		em.persist(guest);
	}

	// Retrieves all the guests:
	public List<TestDB> getAllGuests() {
		/*TypedQuery<TestDB> query = em.createQuery(
				"SELECT g FROM Guest g ORDER BY g.id", TestDB.class);
		
		//return query.getResultList();*/
		List addList = new ArrayList<TestDB>();
		TestDB db = new TestDB("Godwin");
		
		addList.add(db);
		return addList;
	}
}
