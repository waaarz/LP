public class BotPlayer extends Player {
// a
    public BotPlayer() {
        super();
    }

    public void update(){

    }

    @Override
    public void update(Player joueurGauche) {
       Card newCard = piocherCarte.joueurGauche();

       if (newCard != null){
            hand.add(newCard);
            System.out.println("Bot à pioché : " + newCard );
            this.pair();
       }
       else{
            System.out.println("Le joueur à gauche n a plus de carte")
       }
    }

}