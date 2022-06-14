package sn.faty.Tech.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sn.faty.Tech.Entity.User;
import sn.faty.Tech.Repository.UserRepository;

@Service 
public class UserService {
	
	@Autowired 
	
	private UserRepository userRepo;
	
	public User getUsername(String username)
	{
		
	  return userRepo.findByUsername(username);
		
	}

}
