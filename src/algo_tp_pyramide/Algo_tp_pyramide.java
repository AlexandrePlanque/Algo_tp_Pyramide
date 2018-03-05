/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.Scanner;

/**
 *
 * @author alexandreplanque
 */
public class Algo_tp_pyramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("veuillez entrer unne hauteur s'il vous plait");

        if (sc.hasNextInt()) {
            //on mémorise la hauteur entrée par l'utilisateur
            int h = sc.nextInt();
            System.out.println("La hauteur entrée est " + h);
            int decalage = h - 1; //initialisation de la var et de sa valeur
            //on va s'appuyer sur la hauteur pour écrire chaque ligne
            for (int i = 0; i < h; i++) {
                String ligne = "";
                int nbCar = i * 2 + 1; // nbcar c'est le nombre de caracteres sur la ligne actuelle
                
                //ici on va ajouter les caracteres à nos lignes
                for (int j = 0; j < nbCar; j++) {
                    ligne = ligne + "*";
                }

                //ajout de l'espace pour creer le decalage
                for (int k = 0; k < decalage; k++) {
                    ligne = " " + ligne;

                }

                decalage--;//décrement le décalage pour l'ajuster au fil des lignes
                System.out.println(ligne);//affichage des lignes

            }
        }
    }

}
