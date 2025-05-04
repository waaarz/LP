package monpackage;

public class Card {
    private String symbole; // ex: "A", "10", "R"
    private String couleur; // ex: "♥", "♠", "♦", "♣"

    public Card(String symbole, String couleur) {
        this.symbole = symbole;
        this.couleur = couleur;
    }

    // Getter pour le symbole
    public String getSymbole() {
        return symbole;
    }

    // Setter pour le symbole
    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    // Getter pour la couleur
    public String getCouleur() {
        return couleur;
    }

    // Setter pour la couleur
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return couleur + symbole; // Exemple : "♥A" ou "♠10"
    }
}