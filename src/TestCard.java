import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class TestCard {

    public static void main(String[] args) {

        boolean moreInput = true;
        Scanner sc = new Scanner(System.in);
        String outputString;

        while (moreInput) {
            int cardNumber = 0;
            int runningCount = 0;

            System.out.println("Please enter a number of cards in the format like: 5S TC AH JD");
            String tempString = sc.nextLine();
            System.out.print(tempString);

            ArrayList<String> givenCards = new ArrayList<String>(Arrays.asList(tempString.split(" ")));

            for(int i = 0; i < givenCards.size(); i++){
                cardNumber = 0;
                cardNumber += determineCardRank(givenCards.get(i).charAt(0));
                switch (givenCards.get(i).charAt(1)) {
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
            System.out.println("do you want to try again? If no, type 'N', otherwise hit enter.");
            String check = sc.nextLine();
            if(check.equals("n") || check.equals("N")){
                moreInput = false;
                System.out.println("Thank you, goodbye.");

            }
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
