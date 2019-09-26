package entrees_sorties;
import java.util.Scanner;
public class exercice2 {

	public static void main(String[] args) {
     // TODO Auto-generated method stub

	// Déclarer les variables représentant les francs et les euros
	// ainsi que le taux de conversion
	double CHF=0.0, E=0.0;
	double Taux =1.0397;
	// Afficher et Saisir le nombre de euros 
	System.out.print("saisisssez votre nombre en euros :");
	Scanner lectureclavier = new Scanner(System.in);
	E = lectureclavier.nextDouble();
	// Calculer le nombre en CHF 
	
	CHF = (double)Math.round(E * Taux*100) /100;
	
	
	// Afficher le résultat suivant l’exemple donné ci-dessous
	System.out.println("Conversion Taux euros en Francs suisses " + Taux);
	System.out.println("Nombre en Francs suisses CHF  " + CHF);
}

}
