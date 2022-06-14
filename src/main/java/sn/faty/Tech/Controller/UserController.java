package sn.faty.Tech.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import sn.faty.Tech.Entity.User;

import sn.faty.Tech.Service.UserService;

@RestController
public class UserController {

	
  private UserService service ;
  
 //  @Autowired 
	
//	private UserRepository userRepo;
	
	@GetMapping(value="/recherche/{username}")
	
	public User getUserByUsername(@PathVariable String username )
	
	{
		return service.getUsername(username);
		
	}
	
	
	
}
