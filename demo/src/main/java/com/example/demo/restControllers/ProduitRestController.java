package com.example.demo.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Produit;
import com.example.demo.services.ProduitService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRestController {
    @Autowired
    ProduitService produitService;

    @RequestMapping(path="all",method = RequestMethod.GET)
    public List<Produit> getAllProduits(){
        return produitService.getAllProduits();
    }

    @RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
    public Produit getProduitById(@PathVariable("id") Long id){
        return produitService.getProduit(id);
    }

    @RequestMapping(path="/addprod",method = RequestMethod.POST)
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public Produit createProduit(@RequestBody Produit produit){
        return produitService.saveProduit(produit);
    }

    @RequestMapping(path="/updateprod",method = RequestMethod.PUT)
    public Produit updateProduit(@RequestBody Produit produit ){
        return produitService.updateProduit(produit);
    }
    @RequestMapping(value="/delprod/{id}",method=RequestMethod.DELETE)
    public void deleteProduit(@PathVariable("id") Long id){
        produitService.deleteProduitById(id);
    }
    @RequestMapping(value="prodscat/{idCat}",method=RequestMethod.GET)
    public List<Produit> getProduitByCatId(@PathVariable("idCat") Long idCat){
        return produitService.findByCategorieIdCat(idCat);
    }
    @RequestMapping(value="/prodsByName/{nom}",method = RequestMethod.GET)
    public List<Produit> findByNomProduitContains(@PathVariable("nom") String nom) {
    return produitService.findByNomProduitContains(nom);
    }
}
