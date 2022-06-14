package sn.faty.Tech.Entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Types {
	
	@Id

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long idType;
	
	 @Column(unique=true)
	 
     private String name;
	 
	//@JsonIgnore

	
	  @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	  
	  private List<Produit> produit ;
	  
	 
	public Types(Long idType, String name,List<Produit> produit ) {
		 super();
		this.idType = idType;
		this.name = name;
	    this.produit = produit;
	}

	public Types() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdType() {
		return idType;
	}

	public void setIdType(Long idType) {
		this.idType = idType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	  public List<Produit> getProduit() { return produit; }
	  
	  public void setProduit(List<Produit> produit) { this.produit = produit; }
	  
	  
	 

}
