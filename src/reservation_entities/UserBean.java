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
@Table(name = "user")
public class UserBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", precision = 0)
	private int id;
	
	@Column(name = "first_name", unique = true, length = 50, nullable = false)
	private String first_name;
	
	@Column(name = "last_name", unique = true, length = 50, nullable = false)
	private String last_name;
	
	@Column(name = "email", unique = true, length = 50, nullable = false)
	private String email;
	
	@Column(name = "pass", unique = true, length = 64, nullable = false)
	private String pass;
	
	@Column(name = "city", unique = true, length = 50, nullable = false)
	private String city;
	
	@Column(name = "telefon_number", precision = 0)
	private int telefon_number;

	//private List<UserType> user_type;
	
	
	//public List<UserType> getComments() {
	//	return user_type;
	//}
	
	//public void setComments(List<UserType> user_type) {
	//	this.user_type = user_type;
	//}
	
	public UserBean() {
		super();
	}

	
	public UserBean(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}

	public String getFirst_name(){
		return first_name;
	}
	
	public void setFirst_name(String first_name){
		this.first_name = first_name;
	}
	
	public String getLast_name(){
		return last_name;
	}
	
	public void setLast_name(String last_name){
		this.last_name = last_name;
	}
	
	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getPass(){
		return pass;
	}
	
	public void setPass(String pass){
		this.pass = pass;
	}
	
	public String getCity(){
		return city;
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public int getTelefon_number(){
		return telefon_number;
	}
	
	public void setTelefon_number(int telefon_number){
		this.telefon_number = telefon_number;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
