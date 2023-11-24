package oop.composition.CompositionDate;

public class Date {
	private int  jour;  //un nombre de 1-31
	private int mois;  // un nombre de 1-12
	private int annee; // une ann�e valable	
	
	
	// ------------------- Jour ------------------
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		this.jour = jour;
	}
	
	// ------------------- Mois -------------------
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	
	// ------------------- Annee ------------------
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	
	public int  testMois(int Unmois)
	{
		        if (Unmois>0 && Unmois<=12)
		            return Unmois;
		        else
		        {
		         System.out.println("Le mois n'est pas valable");
		         Unmois=-1;
		         return -1;
		        }  // fin else
    } 
	
	public int testJour(int unJour)
		    {
		        if (mois ==-1) return -1; // la date est d�j� invalide, rien ne sert de poursuivre
		        int [] NbJoursParMois={0,31,28,31,30,31,30,31,31,30,31,30,31};
		        if(unJour>0 && unJour<=NbJoursParMois[mois])
		            return unJour;
		        if (mois==2 && unJour==29 && ( annee%400 ==0 || ( annee %4==0 && annee %100 !=0)))
		             return unJour;
		        System.out.println("Le jour avec le mois entr� pr�c�demment n'est pas valide");
		         return -1;
		
		    }// fin de testJour

	@Override public String toString()
		    {
		     return String.format( "%d/%d/%d", jour,mois,annee);
		    } // fin de toString()

	
	public Date(int jour, int mois, int annee)
	   {
		    this.annee= annee;
		    this.mois = testMois(mois);
		    this.jour = testJour(jour);
		
		 
		   // System.out.printf(" La date %s vient d'�tre construite \n", this);
	  } 



}
