package fr.eni.bean;

import java.util.Date;
import java.util.List;

public class Location {
	
	
	private int id;
	private Date dateDebut;
	private Date dateFin;
	private List<String> photosDebut;
	private List<String> photosFin;
	private boolean restitution;
	private Voiture voiture;
	private Client client;
	private double prix;
	
	
	
	
	
	public Location() {
		super();
	}


	public Location(Date dateDebut, Date dateFin, List<String> photosDebut,
			List<String> photosFin, boolean restitution, Voiture voiture,
			Client client, double prix) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.photosDebut = photosDebut;
		this.photosFin = photosFin;
		this.restitution = restitution;
		this.voiture = voiture;
		this.client = client;
		this.prix = prix;
	}


	public Location(int id, Date dateDebut, Date dateFin,
			List<String> photosDebut, List<String> photosFin,
			boolean restitution, Voiture voiture, Client client, double prix) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.photosDebut = photosDebut;
		this.photosFin = photosFin;
		this.restitution = restitution;
		this.voiture = voiture;
		this.client = client;
		this.prix = prix;
	}
	
	
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public List<String> getPhotosDebut() {
		return photosDebut;
	}
	public void setPhotosDebut(List<String> photosDebut) {
		this.photosDebut = photosDebut;
	}
	public List<String> getPhotosFin() {
		return photosFin;
	}
	public void setPhotosFin(List<String> photosFin) {
		this.photosFin = photosFin;
	}
	public boolean isRestitution() {
		return restitution;
	}
	public void setRestitution(boolean restitution) {
		this.restitution = restitution;
	}
	public Voiture getVoiture() {
		return voiture;
	}
	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getId() {
		return id;
	}

	
	
	
}
