package oop.composition.CompositionDate;

public class Medicament {
	private String nomMedic;
	private String nomCo;
	private Date fabrication;
	private Date expiration;
	
	// ----------------------- Nom du medicament ---------------------------
	public String getNomMedic() {
		return nomMedic;
	}
	public void setNomMedic(String nomMedic) {
		this.nomMedic = nomMedic;
	}
	
	// ------------------------ Nom de la compagnie ------------------------
	public String getNomCo() {
		return nomCo;
	}
	public void setNomCo(String nomCo) {
		this.nomCo = nomCo;
	}
	
	// ------------------------ Date de fabrication ------------------------
	public Date getFabrication() {
		return fabrication;
	}
	public void setFabrication(Date fabrication) {
		this.fabrication = fabrication;
	}
	
	// -------------------------- Date d'expiration -------------------------
	public Date getExpiration() {
		return expiration;
	}
	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	
	public Medicament (){
		this.nomMedic = "aucun";
		this.nomCo = "aucun";
	}
	
	public Medicament (String pNomMedic, String pNomCo, int pJour1, int pMois1, int pAnnee1, int pJour2, int pMois2, int pAnnee2)
	{
		this.nomMedic = pNomMedic;
		this.nomCo = pNomCo;
		fabrication = new Date (pJour1, pMois1, pAnnee1);
		expiration = new Date (pJour2, pMois2, pAnnee2);
		
	}

}
