/**
 * Created by aleksandr on 23.01.17.
 */
import java.util.*;
public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        DotCom on = new DotCom();
        one.setName ("Pets.com");
        DotCom two = new DotCom();
        one.setName("eToys.com");
        DotCom three = naw DotCom();
        three.setName ("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Ваша цель - потопить три "сайта".");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить из за минимальное количество ходов");

        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }

    }
    private void startPlaying() {
        while (!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finichGame();
    }
    private void checkUserGuess(String usersGuess) {
        numOfGuesses++;
        String result = "Мимо";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(usersGuess);
            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }
    private void finichGame() {
        System.out.println("Все "сайты" ушли ко дну! Ваши акции теперь неичего не стоят.");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вса всего" + numOfGuesses + "попыток.");
            System.out.println("Вы успели выбраться до того, как ваши акции утонули.");
        } else {
            System.out.println("Это заняло у вас довольно мало времяни. "+ numOfGuesses + "попыток");
            System.out.println("Рыбы водят хороводы вокруг ваших вложений.");
        }
    }
    public static void main (String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}