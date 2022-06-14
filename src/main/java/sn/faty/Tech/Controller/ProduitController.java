package sn.faty.Tech.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sn.faty.Tech.Entity.Produit;
import sn.faty.Tech.Service.ProduitService;


@RestController

@RequestMapping("/api/modelSis")

@CrossOrigin("*")

public class ProduitController {

@Autowired
	
private	ProduitService service;



@PostMapping("/product")
	
	public ResponseEntity<Produit> addProduct(@RequestBody Produit produit)
	
{
		return	service.saveProduct(produit);
	}


	/*
	 * public Date getDate_ajout_produit() { DateFormat format = new
	 * SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
	 * 
	 * //obtenir la date courante
	 * 
	 * Date date = new Date(0);
	 * 
	 * System.out.println(format.format(date));
	 * 
	 * return date;
	 * 
	 * }
	 */

  @GetMapping("/products")
  
  public List<Object> getAllProductType()
  
{   
	  
///	return service.getAllProducts(); 
	
   return service.getProduitType();
	
	
}
  
  @GetMapping("/product/{id}")
  
	public ResponseEntity<Produit> getProduct(@PathVariable Long id)
{
       return service.getProductById(id);

       
	}
  
@PutMapping("/product")

public ResponseEntity<Produit> updateProduct(@RequestBody Produit product)
	
{
	return service.updateProduct(product);	
	
}

}
