package monpackage;


public abstract class Player {
    
    protected CardPack hand;

    public Player() {
        this.hand = new CardPack();
    }

    public CardPack getCartes() {
        return this.hand;
    }

    public Card piocherCarte() {
        return hand.removeRand();
    }

    // ** sert à quoi ? 
    public String getValeur(String hand) {
        return hand.substring(1);
    }

    public String getColor(String carte) {
        String symbole = carte.substring(0, 1);
        if (symbole.equals("♥") || symbole.equals("♦")) {
            return "rouge";
        } else {
            return "noir";
        }
    }
    // **

    public void pair() {
        
        //Retourne la première pair, si il y n'y en a pas, on retourne null (object retourné : ArrayList ) 
        
        for (int i = 0; i < this.hand.size(); i++) {
            String c1 = this.hand.get(i);
            
            for (int j = i + 1; j < this.hand.size(); j++) {
                String c2 = this.hand.get(j);

            if (getValeur(c1).equals(getValeur(c2)) && getColor(c1).equals(getColor(c2))) {
                this.hand.remove(c1);
                this.hand.remove(c2);
                System.out.println("Paire retirée : " + c1 + " et " + c2);
                return;
            }
        }
    }
   
    public abstract void update(); // Regarder le fichier text 
}