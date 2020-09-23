package reservation_entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table")

public class TableType {

	public TableType() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", precision = 0)
	private int id;
	
	@Column(name = "table_space")
	private String table_space;
	
	@Column(name = "name", unique = true, length = 50, nullable = false)
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTable_space() {
		return table_space;
	}

	public void setTable_space(String table_space) {
		this.table_space = table_space;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public TableType(String name, String table_space){
		super();
		this.name = name;
		this.table_space = table_space;
	}
	
}
