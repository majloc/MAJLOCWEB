package fr.eni.bean;

public class Agence {

	private int id;
	private String nomResponsable;
	private String prenomResponsable;
	private String agence;
	private String login;
	private String mdp;
	private String mail;
	private String tel;
	private Double chiffreAffaire;
	
	
	
	
	public Agence() {
		super();
	}
	
	public Agence(String nomResponsable, String prenomResponsable,
			String agence, String login, String mdp, String mail, String tel,
			Double chiffreAffaire) {
		super();
		this.nomResponsable = nomResponsable;
		this.prenomResponsable = prenomResponsable;
		this.agence = agence;
		this.login = login;
		this.mdp = mdp;
		this.mail = mail;
		this.tel = tel;
		this.chiffreAffaire = chiffreAffaire;
	}
	
	
	public Agence(int id, String nomResponsable, String prenomResponsable,
			String agence, String login, String mdp, String mail, String tel,
			Double chiffreAffaire) {
		super();
		this.id = id;
		this.nomResponsable = nomResponsable;
		this.prenomResponsable = prenomResponsable;
		this.agence = agence;
		this.login = login;
		this.mdp = mdp;
		this.mail = mail;
		this.tel = tel;
		this.chiffreAffaire = chiffreAffaire;
	}
	public String getNomResponsable() {
		return nomResponsable;
	}
	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}
	public String getPrenomResponsable() {
		return prenomResponsable;
	}
	public void setPrenomResponsable(String prenomResponsable) {
		this.prenomResponsable = prenomResponsable;
	}
	public String getAgence() {
		return agence;
	}
	public void setAgence(String agence) {
		this.agence = agence;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Double getChiffreAffaire() {
		return chiffreAffaire;
	}
	public void setChiffreAffaire(Double chiffreAffaire) {
		this.chiffreAffaire = chiffreAffaire;
	}
	public int getId() {
		return id;
	}
	
	
	
	
}
