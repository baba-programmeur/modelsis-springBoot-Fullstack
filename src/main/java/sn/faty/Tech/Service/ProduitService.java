package sn.faty.Tech.Service;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import sn.faty.Tech.Entity.Produit;

import sn.faty.Tech.Repository.ProduitRepository;



@Service

public class ProduitService {
	
@Autowired
	
private  ProduitRepository productrepo;

static Logger logger =LoggerFactory.getLogger(ProduitService.class);

public ResponseEntity<Produit> saveProduct(Produit product)
{
	
		Produit productAjoute= productrepo.save(product);
		
		 if(productAjoute != null)
			 
		{
			
			 logger.info("Produit bien ajoute");
			 
			return  new ResponseEntity<>(HttpStatus.OK);
		}
		
  return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		  
	}
   public List<Produit> getAllProducts() {

	return productrepo.findAll();

	//return products;
}

public ResponseEntity<Produit> updateProduct(Produit product) {
	   
	   Optional<Produit> produit=productrepo.findById(product.getId());//.orElse(null);

	  if(produit.isPresent())
	  {
		   Produit existingProduct=produit.get();

		  existingProduct.setName(product.getName());
		  
		//  existingProduct.setType(product.getType());

		  logger.info("Produit bien mise à jour");
		  
		  return new ResponseEntity<>(productrepo.save(existingProduct),HttpStatus.OK) ;
	  }
	  
	  else

	return new  ResponseEntity<>(HttpStatus.NOT_FOUND);

}	 


public  List<Object> getProduitType(){

   return productrepo.getProduitAndType();   

}

public ResponseEntity<Produit> getProductById(Long id)
{
	Produit product= productrepo.findById(id).orElseThrow();

	return ResponseEntity.ok().body(product);
}


 
 
}
