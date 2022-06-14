package sn.faty.Tech.Service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import sn.faty.Tech.Entity.Types;

import sn.faty.Tech.Repository.TypeRepository;

@Service

public class TypeService {
	
	@Autowired
	
private  TypeRepository typeRepository;
	

static Logger logger =LoggerFactory.getLogger(TypeService.class);

public ResponseEntity<Types> addTypes(Types type) {

	Types typeAjoute= typeRepository.save(type);
	
	 if( typeAjoute!= null)
		 
	{
		
        logger.info("Le type a été bien ajouté");
		 
		return  new ResponseEntity<>(HttpStatus.OK);
		
	}
	 return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
}

public List<Types> getAllTypes() {

	return typeRepository.findAll();
	
}

	

}
