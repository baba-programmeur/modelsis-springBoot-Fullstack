package sn.faty.Tech.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import sn.faty.Tech.Entity.Produit;






@Repository

public interface ProduitRepository extends JpaRepository <Produit,Long> {

public Optional<Produit> findById(Long id);



  //@Query(value="SELECT * FROM `types` WHERE 1",nativeQuery =true)

  @Query(value="SELECT p.id, p.name produit_name ,t.name type_name FROM  produit p ,types t WHERE p.id_type =t.id_type",nativeQuery =true)
  
  
  List<Object> getProduitAndType();

}
