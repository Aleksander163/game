import java.util.ArrayList;

/**
 * Created by aleksandr on 22.01.17.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {

        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();



        DotCom theDotCom = new DotCom();
        int randomNum = (int) (Math.random() * 5);

        ArrayList<String> myList = new ArrayList<String>();
        String a = new String("3");
        myList.add(a);
        String b = new String("5");
        myList.add(b);
        String c = new String("7");
        myList.add(c);

        theDotCom.setLocationCells(myList);

        boolean isAlive =true;

        while (isAlive == true) {
            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось" + numOfGuesses + "попыток(и)");
            }
        }
    }
}
