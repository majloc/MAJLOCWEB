package fr.eni.bean;

import java.util.List;

public class Voiture {

	private int id;
	private double prixParJour;
	private String plaque;
	private String marque;
	private String modele;
	private int nbPlace;
	private List<String> photos;
	private Type type;
	private Energie energie;
	
	
	
	
	
	public Voiture() {
		super();
	}
	
	public Voiture(double prixParJour, String plaque, String marque,
			String modele, int nbPlace, List<String> photos, Type type,
			Energie energie) {
		super();
		this.prixParJour = prixParJour;
		this.plaque = plaque;
		this.marque = marque;
		this.modele = modele;
		this.nbPlace = nbPlace;
		this.photos = photos;
		this.type = type;
		this.energie = energie;
	}
	
	public Voiture(int id, double prixParJour, String plaque, String marque,
			String modele, int nbPlace, List<String> photos, Type type,
			Energie energie) {
		super();
		this.id = id;
		this.prixParJour = prixParJour;
		this.plaque = plaque;
		this.marque = marque;
		this.modele = modele;
		this.nbPlace = nbPlace;
		this.photos = photos;
		this.type = type;
		this.energie = energie;
	}
	public double getPrixParJour() {
		return prixParJour;
	}
	public void setPrixParJour(double prixParJour) {
		this.prixParJour = prixParJour;
	}
	public String getPlaque() {
		return plaque;
	}
	public void setPlaque(String plaque) {
		this.plaque = plaque;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getNbPlace() {
		return nbPlace;
	}
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}
	public List<String> getPhotos() {
		return photos;
	}
	public void setPhotos(List<String> photos) {
		this.photos = photos;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Energie getEnergie() {
		return energie;
	}
	public void setEnergie(Energie energie) {
		this.energie = energie;
	}
	public int getId() {
		return id;
	}
	
	
	
	
}
