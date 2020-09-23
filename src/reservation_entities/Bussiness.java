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
@Table(name = "bussiness")

public class Bussiness {
	
	public Bussiness() {

	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name", unique = true, length = 50, nullable = false)
	private String name;
	
	@Column(name = "address", unique = true, length = 50, nullable = false)
	private String address;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "kitchen")
	private String kitchen;
	
	@Column(name = "work_time")
	private String work_time;
	
	@Column(name = "method_of_payment")
	private String method_of_payment;
	
	@Column(name = "has")
	private String has;
	
	@Column(name = "more_option")
	private String more_option;
	
	@Column(name = "email", unique = true, length = 50, nullable = false)
	private String email;
	
	@Column(name = "pass", unique = true, length = 50, nullable = false)
	private String pass;
	
	@Column(name = "telefon_number", precision = 0)
	private int telefon_number;
	
	//private List<BussinessType>bussiness_type;
	
//	public List<BussinessType> getComments() {
//		return bussiness_type;
//	}
//	
//	public void setComments(List<BussinessType> bussiness_type) {
//		this.bussiness_type = bussiness_type;
//	}
	
	public Bussiness(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKitchen() {
		return kitchen;
	}

	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}

	public String getWork_time() {
		return work_time;
	}

	public void setWork_time(String work_time) {
		this.work_time = work_time;
	}

	public String getMethod_of_payment() {
		return method_of_payment;
	}

	public void setMethod_of_payment(String method_of_payment) {
		this.method_of_payment = method_of_payment;
	}

	public String getHas() {
		return has;
	}

	public void setHas(String has) {
		this.has = has;
	}

	public String getMore_option() {
		return more_option;
	}

	public void setMore_option(String more_option) {
		this.more_option = more_option;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getTelefon_number() {
		return telefon_number;
	}

	public void setTelefon_number(int telefon_number) {
		this.telefon_number = telefon_number;
	}

//	public List<BussinessType> getBussiness_type() {
//		return bussiness_type;
//	}
//
//	public void setBussiness_type(List<BussinessType> bussiness_type) {
//		this.bussiness_type = bussiness_type;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
