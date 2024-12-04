import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int similarityScore = 0;
        int numQuantity = 0;
        try {
            File file = new File("input.txt");
            Scanner fileReader = new Scanner(file);
            ArrayList<Integer> leftList = new ArrayList<>();
            ArrayList<Integer> rightList = new ArrayList<>();
            while (fileReader.hasNextLine()) {
                leftList.add(fileReader.nextInt());
                rightList.add(fileReader.nextInt());
            }
            Collections.sort(leftList);
            Collections.sort(rightList);
            for (int i = 0; i < leftList.size(); i++) {
                numQuantity = 0;
               for (int j = 0; j < rightList.size(); j++) {
                   if (Objects.equals(leftList.get(i), rightList.get(j))) {
                       numQuantity++;
                   }
               }
               if (numQuantity != 0)
                similarityScore += leftList.get(i) * numQuantity;
            }
            System.out.println(similarityScore);
        } catch (FileNotFoundException e) {

        }
    }
}
