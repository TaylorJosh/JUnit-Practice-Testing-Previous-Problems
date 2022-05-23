package fifthitem;

import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) throws Exception {
        ArrayList<String> favFoods = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your top 10 favorite foods");

        while (true){
            String food = scanner.nextLine();
            favFoods.add(food);
            if(favFoods.size() == 10){
                System.out.println("Please press enter for your fifth favorite food.");
                scanner.nextLine();
                break;
            }
        }
        System.out.println("Your fifth favorite food is: " + favFoods.get(4));
    }

    public static String getFifthItem(ArrayList<String> foodlist){
        
        return "Your fifth favorite food is: " + foodlist.get(4);


    }
}
