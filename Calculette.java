/*
#	Faire des choix
#	Fichier  : Calculette.java
#	Class    : Calculette
*/

import java.util.*;
import  java.io.*;
public class Calculette	{
 public static void main( String [] argument)	 {
  int a, b;
  char operateur;
  double calcul = 0;
  boolean OK = true;
  String str;
  Scanner lectureClavier = new Scanner(System.in);
  System.out.print("Entrer la premiere valeur : ");
  a = lectureClavier.nextInt();
  System.out.print("Entrer la seconde valeur : ");
  b = lectureClavier.nextInt();
  System.out.print("Type de l'operation : (+, -, *, /) : ");
  Scanner sc = new Scanner(System.in);
  str = sc.nextLine();
  operateur = str.charAt(0);
  System.out.println("Vous avez saisi le caractere : " + operateur);
  switch (operateur )  {
   case '+' : calcul = a + b;
              break;
   case '-' : calcul = a - b;
              break;
   case '/' : if ( b != 0) calcul = a / b;
  	      else OK = false;
              break;
   case '*' : calcul = a * b ;  
              break;
   default : OK = false ;
    }
   if (OK) {
     System.out.print("Cette operation a pour resultat : ");
     System.out.println(a + " " +operateur+ " "+ b + " =  " + calcul);
   }
   else  System.out.println("Operation non conforme !");
 }
}

/* calculette : exercice4 */