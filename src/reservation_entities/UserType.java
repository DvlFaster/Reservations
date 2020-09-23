package reservation_entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "user_type")
public class UserType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name", unique = true, length = 50, nullable = false)
	private String name;
	
	@Column(name = "access_label")
	private String access_label;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private UserBean user;
	
	public UserType(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id){
		this.id = id;
	}
	
	public UserBean getUser() {
		return user;
	}
	
	public void setUser(UserBean owner) {
		this.user = owner;
	}
	
	public UserType(String name, String access_label){
		super();
		this.name = name;
		this.access_label = access_label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccess_label() {
		return access_label;
	}

	public void setAccess_label(String access_label) {
		this.access_label = access_label;
	}
}
