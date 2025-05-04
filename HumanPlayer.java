public class HumanPlayer extends Player {

    Scanner scanner = new Scanner(System.in);

    public HumanPlayer() {
        super();
    }

    @Override
    public void update(Player joueurGauche) {

        Scanner input = nextline();
        hand.print();

        Card piocher = joueurGauche.piocherCarte();
        
        // À implémenter selon l’interface ou les interactions prévues
        System.out.println("C'est à votre tour. Entrez une commande pour piocher une carte...");
        // Par exemple : lire input utilisateur, ajouter la carte, vérifier les paires, etc.
    }
}