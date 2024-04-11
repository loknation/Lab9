import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class main{

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        Random Random = new Random();
        int location = -1;
        int sum = 0;
        double avg;
        int userNum;
        int count = 0;
        int[] datapoints = new int[100];
        for (int i = 0; i < datapoints.length; i++){
            datapoints[i] = Random.nextInt(99) + 1;
            System.out.printf(datapoints[i] + " | "); //print
            sum += datapoints[i]; //find sum
        }
        avg = sum/100.0;
        System.out.println();
        System.out.println("sum " + sum);
        System.out.println("avg " + avg );

        //linear scan
        userNum = SafeInput.getRangedInt(Scanner, "give int between 0-100 to scan array", 0, 100);
        for(int i = 0; i < datapoints.length; i++){
            if (userNum == datapoints[i]){
                count+=1;
            }
        }
        System.out.println("your number is in the array " + count + " times");
        userNum = SafeInput.getRangedInt(Scanner, "give int between 0-100 to scan array", 0, 100);
        for(int i = 0; i < datapoints.length; i++){
            if (userNum == datapoints[i]){
                location = i;
                break;
            }
        }
        if (location == -1){
            System.out.println("not in array");
        }else{
            System.out.println("it is the " + location + " element");
        }
        int min = Arrays.stream(datapoints).min().getAsInt();
        int max = Arrays.stream(datapoints).max().getAsInt();
        System.out.println("min " + min);
        System.out.println("max " + max);
    }


}

