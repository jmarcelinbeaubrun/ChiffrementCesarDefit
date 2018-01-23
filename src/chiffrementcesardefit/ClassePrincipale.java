/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chiffrementcesardefit;
 import java.util.Scanner;

/**
 *
 * @author bjean
 */
public class ClassePrincipale {
    
    //L'objet Scanner permet de faire la saisie au clavier grace au parametre System.in
    static Scanner sc=new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
                                System.out.println("Entrer l'entier servant au décalage");
                                int decalage=sc.nextInt();
                                System.out.println("Veuiller entrer le message à chiffrer");
                                //On vide la ligne avant d'en lire une autre
                                sc.nextLine();
                                String msgAChiffrer=sc.nextLine();
                                /*Ici on instancie un objet de la classe Exercice2 pour faire appel à la methode
                                crypter() se trouvant dans la classe Exercice2 */
                                ChiffrementCesarDefit exo2=new  ChiffrementCesarDefit();
                                System.out.println("Le message chiffré correspondant à "+msgAChiffrer+" est: "+exo2.crypterAvecMethCesar(decalage , msgAChiffrer));
                                System.out.println("\n");
                               
    }
    
    
}
