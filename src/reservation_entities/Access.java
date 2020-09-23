package reservation_entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "access")

public class Access {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", precision = 0)
	private int id;

	//private List<UserBean> user;

	//private List<Bussiness> bussiness;

//	public List<UserBean> getUser() {
//		return user;
//	}

//	public void setUser(List<UserBean> user) {
//		this.user = user;
//	}
//
//	public List<Bussiness> getBussiness() {
//		return bussiness;
//	}
//
//	public void setBussiness(List<Bussiness> bussiness) {
//		this.bussiness = bussiness;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}


