package sn.faty.Tech.Entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Produit {

	@Id

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	
	private String date_creation;
	
	 public String getDate_creation() {
		 
		return date_creation;
	}


	public void setDate_creation(String date_creation) {
		this.date_creation = date_creation;
	}

	@Column(unique=true)
	 
     private String name;
	 
	
	private int id_type ;
	
	/*
	 * @ManyToOne(fetch=FetchType.LAZY)
	 * 
	 * @JoinColumn(name="type")
	 * 
	 * private Types type ;
	 */

	public Produit(Long id, String name, int id_type,Types type) {
		
		this.id = id;
		this.name = name;
		this.id_type = id_type;
		//this.type = type;
	    this.date_creation=new Date().toString();
	   
	}


	public int getId_type() {
		return id_type;
	}


	public void setId_type(int id_type) {
		this.id_type = id_type;
	}


	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	/*
	 * public Types getType() { return type; }
	 * 
	 * 
	 * public void setType(Types type) { this.type = type; }
	 */
}
