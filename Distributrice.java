/*
 * Copyright 2011 Eric Tremblay.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class Distributrice {

    public static void main (String[] params) {
        int deuxDollard = 10;
        int dollard = 10;
        int vingtCinqSous = 10;
        int dixSous = 10;
        int cinqSous = 10;
        int unSous = 10;

        int prix;
        int aPayer;
        int piece;
        int montantPaye = 0;

        int compteurDollard;
        int compteurVingtCinqSous;
        int compteurDixSous;
        int compteurCinqSous;
        int compteurSous;

        String monnaie = "";

        do{

            do{
                System.out.println("Entrez le prix de l'article: ");
                prix = Clavier.lireIntLn();
            }while (prix < 0);
            aPayer = prix;
            if (prix != 0){

                while (aPayer > 0){

                    System.out.println("Vous devez payer: " + aPayer + " centimes");

                    do{
                        System.out.println("Inserez de la monnaie pour payer l'article");
                        piece = Clavier.lireIntLn();
                        if(piece == 200){
                            deuxDollard++;
                        }else if (piece == 100){
                            dollard++;
                        }else if(piece == 25){
                            vingtCinqSous++;
                        }else if (piece == 10){
                            dixSous++;
                        }else if (piece == 5){
                            cinqSous++;
                        }else if (piece ==1){
                            unSous++;
                        }

                    }while (piece != 200 && piece != 100 && piece != 25 && piece != 10 && piece != 5 && piece != 1 && piece != 0);
                    aPayer = aPayer - piece;
                    montantPaye = montantPaye + piece;
                }

                if(aPayer == 0){

                    System.out.println("Prenez votre produit.");

                }else{
                    compteurDollard = 0;
                    compteurVingtCinqSous = 0;
                    compteurDixSous = 0;
                    compteurCinqSous = 0;
                    compteurSous = 0;
                    aPayer =  Math.abs(aPayer);
                    do{

                        if (aPayer >= 100){

                            aPayer = aPayer - 100;
                            compteurDollard++;
                            dollard--;

                        }else if (aPayer < 100 && aPayer >= 25){

                            aPayer = aPayer - 25;
                            compteurVingtCinqSous++;
                            vingtCinqSous--;
                        }else if(aPayer < 25 && aPayer >= 10){
                            aPayer = aPayer - 10;
                            compteurDixSous++;
                            dixSous--;
                        }else if(aPayer < 10 && aPayer >= 5){
                            aPayer = aPayer - 5;
                            compteurCinqSous++;
                            cinqSous--;
                        }else{
                            aPayer = aPayer -1;
                            compteurSous++;
                            unSous--;
                        }
                    }while (aPayer > 0);
                    System.out.println("Prenez votre produit.");
                    monnaie = "";

                    if (compteurDollard != 0){
                        monnaie = monnaie + ( compteurDollard + " piece(s) de un dollard,");
                        compteurDollard = 0;
                        //System.out.println(monnaie);
                    }

                    if (compteurVingtCinqSous != 0){
                        monnaie = monnaie + (" " + compteurVingtCinqSous + " piece(s) de vingt-cinq sous,");
                        compteurVingtCinqSous = 0;
                        //System.out.println(monnaie);
                    }

                    if (compteurDixSous != 0){
                        monnaie = monnaie + (" " + compteurDixSous + " piece(s) de dix sous,");
                        compteurDixSous = 0;
                        //System.out.println(monnaie);
                    }

                    if (compteurCinqSous != 0){
                        monnaie = monnaie + (" " + compteurCinqSous + " piece(s) de cinq sous,");
                        compteurCinqSous = 0;
                        //System.out.println(monnaie);
                    }

                    if (compteurSous != 0){
                        monnaie = monnaie + (" " + compteurSous + " piece(s) de un sous,");
                        compteurSous = 0;
                        //System.out.println(monnaie);
                    }

                    System.out.println("Voici votre monnaie: " + monnaie);
                }

            }else{

                System.out.println("Il reste : ");
                System.out.println(deuxDollard + " Pieces de deux dollards ");
                System.out.println(dollard + " Pieces de un dollards ");
                System.out.println(vingtCinqSous + " Pieces de vingt-cinq sous");
                System.out.println(dixSous + " Pieces de dix sous");
                System.out.println(cinqSous + " Pieces de cinq sous");
                System.out.println(unSous + " Pieces de un sous");
            }// main

        }while ((deuxDollard > 5 && dollard > 5 && vingtCinqSous > 5 && dixSous > 5 && cinqSous > 5 && unSous > 5) && prix != 0);

        System.out.println("Hors-Service");
    }
} 
