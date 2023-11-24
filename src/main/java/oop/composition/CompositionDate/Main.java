package oop.composition.CompositionDate;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		String medicament, compagnie;
		int jourFab, moisFab, anneeFab, jourExp, moisExp, anneeExp;
		
		System.out.println("Entrez le nom du medicament ==>");
		medicament = sc.nextLine();		
		System.out.println("");

		
		System.out.println("Entrez la compagnie qui fabrique le medicament ==>");
		compagnie = sc.nextLine();
		System.out.println("");
		
		

		
		System.out.println("Entrez la date de fabrication du medicament (jour mois annees) ==>");
		jourFab = sc.nextInt();
		moisFab = sc.nextInt();		
		anneeFab = sc.nextInt();		
		System.out.println("");
				
		Date DateFab = new Date(jourFab,moisFab,anneeFab);
		System.out.println("");

		
		if (DateFab.getJour()==-1)
		{
			System.out.println("Entrez la date de fabrication du medicament (jour mois annees) ==>");
			jourFab = sc.nextInt();
			moisFab = sc.nextInt();		
			anneeFab = sc.nextInt();		
			System.out.println("");
			
			Date newDateFab = new Date(jourFab,moisFab,anneeFab);
			System.out.println(" voici la date de fabrication : "+newDateFab.toString());
		}


		do{
		System.out.println("Entrez la date de peremption du medicament (jour mois annees) ==>");
		jourExp = sc.nextInt();
		moisExp = sc.nextInt();		
		anneeExp = sc.nextInt();		
		System.out.println("");
		if (jourExp <= jourFab && moisExp<=moisFab && anneeExp<=anneeFab)
			System.out.println("date de peremption invalide");
		}while (jourExp <= jourFab && moisExp<=moisFab && anneeExp<=anneeFab);
		
		Date DateExp = new Date(jourExp,moisExp,anneeExp);
		System.out.println(" voici la date d'expiration : "+DateExp.toString());

		Medicament produit = new Medicament (medicament, compagnie, jourFab, moisFab, anneeFab, jourExp, moisExp, anneeExp);
		
		System.out.println("********************** MEDICAMENT **********************");
		System.out.println("");
		System.out.println("Nom du medicament : "+produit.getNomMedic());
		System.out.println("");
		System.out.println("Nom de la compagnie : "+produit.getNomCo());
		System.out.println("");
		System.out.println("La date de fabrication : "+produit.getFabrication());
		System.out.println("");
		System.out.println("La date de peremption : "+produit.getExpiration());
				
		sc.close();
	}

}
