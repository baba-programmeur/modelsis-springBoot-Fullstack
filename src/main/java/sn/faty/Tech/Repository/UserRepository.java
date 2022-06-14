package sn.faty.Tech.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import sn.faty.Tech.Entity.User;

public interface UserRepository extends JpaRepository <User,Long> {
	
	public User findByUsername(String username);

}
