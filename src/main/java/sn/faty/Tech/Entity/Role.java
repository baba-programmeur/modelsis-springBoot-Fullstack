package sn.faty.Tech.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private Long role_id;

	private String role;

	public String getRole() {

		  return role;
	}


	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getRole_id() {
		return role_id;
	}


	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}


	public void setRole(String role) {
		this.role = role;
	}

	public Role(Long role_id, String role) {
		super();
		this.role_id = role_id;
		this.role = role;
	}

	
	
}
