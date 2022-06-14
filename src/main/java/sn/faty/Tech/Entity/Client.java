package sn.faty.Tech.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(Long id_client, String nom, String prenom) {
		super();
		this.id_client = id_client;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Id

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	private Long id_client;
	
	
	private String nom;
	
	private String prenom;
	
	
}
