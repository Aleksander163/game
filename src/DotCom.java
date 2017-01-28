/**
 * Created by aleksandr on 28.01.17.
 */
import java.util.*

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }
    public void setName(String n) {
        name = n;
    }
    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Попопил";
                System.out.println("Ой! Вы потопили" + name + "  :( ");
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}
