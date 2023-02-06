import java.util.Scanner;

public class TestCard {


    public static void main(String[] args) {

        boolean moreInput = true;
        Scanner sc = new Scanner(System.in);
        String outputString;
        int runningCount = 0;
        //String inputCollection = "";

        while (moreInput) {
            System.out.println("Please enter a number of cards in the format like: 5S TC AH JD");

            while (sc.hasNext()) {
                int cardNumber = 0;

                String tempString = sc.next();
                System.out.print(tempString + " ");

                cardNumber += determineCardRank(tempString.charAt(0));
                switch (tempString.charAt(1)) {
                    case 'C':
                        break;
                    case 'D':
                        cardNumber += 13;
                        break;
                    case 'H':
                        cardNumber += 26;
                        break;
                    case 'S':
                        cardNumber += 39;
                        break;
                }

                Card newCard = Card.getCard(cardNumber);
                runningCount += newCard.getCribCount();

            }
            System.out.println(": total count " + runningCount + ".");
        }
    }

    public static int determineCardRank(char i) {
        switch (i) {
            case 'A':
                return 0;
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return (int) Character.getNumericValue(i)-1;
            default:
                return 10;
        }
    }
}
