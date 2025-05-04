package monpackage;


import java.util.ArrayList;



public class CardPack {
    
    //Variable pour stoker toutes les cartes du packet 
    
    
    //Methode d'initialisation du paquet de cartes : mélangé ou pas / combien de carte ? 
    public CardPack(){

    }

    //Methode split qui split les cartes du paquet entres plusieurs joueurs
    public void split(ArrayList Players){

    }

    //Methode add qui ajoute une carte 
    public void add(Card card){

    }

    //Methode remove qui retire la ieme carte du paquet 
    public Card remove(int idCard){

    }

    // Retourne la ieme carte
    public Card get(int idCard){

    }

    //Methode removeRand qui retire une carte du paquet au hasard et retourne l'object 
    public Card removeRand(){

    }

    //Methode qui renvoie la taille du packet 
    public int size(){

    }

    //Methode qui range les carte dans l'ordre (nombre et couleurs)
    public void sort(){
    
    }

    @Override
    public String toString() {
        // Exemple : "paquet : ♥A, ♠10"
    }
}