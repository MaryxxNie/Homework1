import java.util.Arrays;
import java.util.Scanner;

public class Assign_1 {
    public static void main(String [] agrs){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int n = 0;
        System.out.println("Please print five integers you want to save" +
                "(separate by comma):");
        String input = scanner.next();
        String[] array = input.split(",");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        System.out.println("This is your array: "+ Arrays.toString(arr));



    }
}
