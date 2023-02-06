public class Card {

    public enum Rank {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

        public int count(){
            return Math.min(ordinal()+1, 10);
        }
    }

    public enum Suit {
        SPADES, DIAMONDS, CLUBS, HEARTS;
    }

    Rank myRank;
    Suit mySuit;

    public Rank getRank(){
        return myRank;
    }

    public Suit getSuit(){
        return mySuit;
    }

    public int getCribCount(){
        return myRank.count();
    }

    @Override
    public String toString(){
        String rank = "", suit = "";
        switch (myRank){
            case ACE:   ;
            case TWO:   ;
            case THREE: ;
            case FOUR:  ;
            case FIVE:  ;
            case SIX:   ;
            case SEVEN: ;
            case EIGHT: ;
            case NINE:  ;
                rank = Integer.toString(myRank.count());
                break;
            case TEN:
                rank = "T";
            case JACK:
                rank = "J";
                break;
            case QUEEN:
                rank = "Q";
                break;
            case KING:
                rank = "K";
        }

        switch(mySuit){
            case CLUBS:
                suit = "\u2663";
                break;
            case DIAMONDS:
                suit = "\u2662";
                break;
            case HEARTS:
                suit = "\u2661";
                break;
            case SPADES:
                suit = "\u2660";
        }

        return rank+suit;
    }

    public static Card getCard(Rank r, Suit s){
        Card newCard = new Card(r, s);
        return newCard;
    }

    public static Card getCard(int i){
        return new Card(i);
    }

    private Card(Rank r, Suit s){
        myRank = r;
        mySuit = s;
    }

    private Card(int i){
        int rankNumber = i%13;
        int suitNumber = i/13;

        switch (suitNumber){
            case 0:
                this.mySuit = Suit.CLUBS;
                break;
            case 1:
                this.mySuit = Suit.DIAMONDS;
                break;
            case 2:
                this.mySuit = Suit.HEARTS;
                break;
            case 3:
                this.mySuit = Suit.SPADES;
        }

        switch (rankNumber){
            case 0:
                this.myRank = Rank.ACE;
                break;
            case 1:
                this.myRank = Rank.TWO;
                break;
            case 2:
                this.myRank = Rank.THREE;
                break;
            case 3:
                this.myRank = Rank.FOUR;
                break;
            case 4:
                this.myRank = Rank.FIVE;
                break;
            case 5:
                this.myRank = Rank.SIX;
                break;
            case 6:
                this.myRank = Rank.SEVEN;
                break;
            case 7:
                this.myRank = Rank.EIGHT;
                break;
            case 8:
                this.myRank = Rank.NINE;
                break;
            case 9:
                this.myRank = Rank.TEN;
                break;
            case 10:
                this.myRank = Rank.JACK;
                break;
            case 11:
                this.myRank = Rank.QUEEN;
                break;
            case 12:
                this.myRank = Rank.KING;
                break;
        }


    }
}