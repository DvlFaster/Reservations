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
@Table(name = "restaurant_area")

public class RestaurantArea {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "pieces")
	private String pieces;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bussiness_id")
	private Bussiness bussiness;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "table")
	private TableType table;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPieces() {
		return pieces;
	}

	public void setPieces(String pieces) {
		this.pieces = pieces;
	}

	public Bussiness getBussiness() {
		return bussiness;
	}

	public void setBussiness(Bussiness bussiness) {
		this.bussiness = bussiness;
	}

	public TableType getTable() {
		return table;
	}

	public void setTable(TableType table) {
		this.table = table;
	}
	
	

}
