import java.util.Arrays;

public class arrays {
    public static int min(int values[]){
        return java.util.Arrays.stream(values).min().getAsInt();
    }
    public static int max(int values[]){
        return java.util.Arrays.stream(values).max().getAsInt();
    }
    public static int occuranceScan(int values[], int userNum){
        int count = 0;
        for(int i = 0; i < values.length; i++){
            if (userNum == values[i]){
                count+=1;
            }
        }
        return count;
    }
    public static int sum(int values[]){
        int sum = 0;
        for(int i = 0; i < values.length; i++){
            sum+=i;
        }
        return sum;
    }
    public boolean contains(int values[], int target){
        return Arrays.asList(values).contains(target);
    }
}
