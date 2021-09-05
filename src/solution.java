import java.util.Scanner;
import java.util.Arrays;

public class solution {
    public static int maximumSum(int arr[], int B, int size) {
        //initialize variables
        int currentPoints = 0;
        int maximumPoints = 0;
        //iterate over first B elements of array and update the value for currentPoints
        for(int i = 0; i < B; i++) {
            currentPoints += arr[i];
        }
        //update value for maximumPoints
        maximumPoints = currentPoints;
        //k points to the end of the array
        int k = size - 1;
        for (int i = B - 1; i >= 0; i--) {
            currentPoints = currentPoints + arr[k] - arr[i];
            maximumPoints = Math.max(currentPoints, maximumPoints);
            k--;
        }
        //return the final result
        return maximumPoints;
    }

    //Main
    public static void main(String args[]) {
        int []arr = {5,-2,3,1,2};
        int B = 3;
        int n = arr.length;
        System.out.print(maximumSum(arr, B, n));
    }
}
