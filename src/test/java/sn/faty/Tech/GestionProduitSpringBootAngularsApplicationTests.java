package sn.faty.Tech;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sn.faty.Tech.Entity.User;
import sn.faty.Tech.Repository.UserRepository;

@SpringBootTest
class GestionProduitSpringBootAngularsApplicationTests {

	
	@Autowired
	
	private UserRepository userrepo;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	
	void getUser()
	{
		
		User user= userrepo.findByUsername("Seydina");
		
		 System.out.println(user);
		
		
	}

}
