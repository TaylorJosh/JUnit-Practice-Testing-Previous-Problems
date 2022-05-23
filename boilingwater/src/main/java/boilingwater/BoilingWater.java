package boilingwater;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number greater than 212:");
        int num = input.nextInt();

        checkTemp(num);
    }
    
    static String isBoiling;
    public static String checkTemp(int num){
        if(num > 212){
            isBoiling = "Water is boiling!";
            
        }
        return isBoiling;
    }
}
