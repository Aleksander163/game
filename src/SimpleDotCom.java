/**
 * Created by aleksandr on 22.01.17.
 */
import java.util.ArrayList;
public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(ArrayList<String> loc) {
        locationCells = locs;
    }

        public String checkYourself(String userInput) {

        String result = "Мимо";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {

            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "Потопил";
            } else {
                result = "Попал";
            }

        }

           return result;
    }
}
