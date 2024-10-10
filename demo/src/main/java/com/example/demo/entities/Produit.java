package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Produit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idProduit;
private String nomProduit;
private Double prixProduit;
private Date dateCreation;
@ManyToOne
private Categorie categorie;
/*@OneToOne
private Image image;*/

@OneToMany (mappedBy = "produit")
 private List<Image> images;
 private String imagePath;

public String getImagePath() {
    return imagePath;
}
public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
}
public List<Image> getImages() {
    return images;
}
public void setImages(List<Image> images) {
    this.images = images;
}
public Categorie getCategorie() {
    return categorie;
}
public void setCategorie(Categorie categorie) {
    this.categorie = categorie;
}
public Produit(String nomProduit, Double prixProduit, Date dateCreation) {
    super();
    this.nomProduit = nomProduit;
    this.prixProduit = prixProduit;
    this.dateCreation = dateCreation;
}
public Produit() {
    super();
}
public Long getIdProduit() {
    return idProduit;
}
public void setIdProduit(Long idProduit) {
    this.idProduit = idProduit;
}
public String getNomProduit() {
    return nomProduit;
}
public void setNomProduit(String nomProduit) {
    this.nomProduit = nomProduit;
}
public Double getPrixProduit() {
    return prixProduit;
}
public void setPrixProduit(Double prixProduit) {
    this.prixProduit = prixProduit;
}
public Date getDateCreation() {
    return dateCreation;
}
public void setDateCreation(Date dateCreation) {
    this.dateCreation = dateCreation;
}
@Override
public String toString() {
    return "Produit [idProduit=" + idProduit + ", nomProduit=" + nomProduit + ", prixProduit=" + prixProduit
            + ", dateCreation=" + dateCreation + "]";
}



}