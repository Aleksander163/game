import java.util.ArrayList;

/**
 * Created by aleksandr on 28.01.17.
 */
public class SimpleDotComTestDrive {
    public static void main (String[] args) {
        SimpleDotCom d = new SimpleDotCom();
        ArrayList<String> myList = new ArrayList<String>();
        String a = new String("2");
        myList.add(a);
        String b = new String("3");
        myList.add(b);
        String c = new String("4");
        myList.add(c);

        d.setLocationCells(myList);
        String userGuess = "2";
        String result = d.checkYourself(userGuess);
    }
}
