package sn.faty.Tech.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.faty.Tech.Entity.Types;
import sn.faty.Tech.Service.TypeService;

@RestController
@RequestMapping("/api/modelSis")
@CrossOrigin("*")

public class TypeController {
	
	@Autowired
	
private	TypeService typeService;


@PostMapping("/productType")
	
	public ResponseEntity<Types> addTypes(@RequestBody Types type)
	
 {
		return	typeService.addTypes(type);
		
}


@GetMapping("/producType")

public List<Types> getAllTypes()

{
	return typeService.getAllTypes();
	
}

}
