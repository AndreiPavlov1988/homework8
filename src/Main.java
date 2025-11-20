import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] inputArray1 = {15000, 22000, 18000, 25000, 19000};
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int i = 0; i < inputArray1.length; i++) {
            sum += inputArray1[i];
            if (inputArray1[i] > max) max = inputArray1[i];
            if (inputArray1[i] < min) min = inputArray1[i];
        }
        double average = (double) sum / inputArray1.length;
        double[] outputArray1 = {sum, max, min, average};
        System.out.println("inputArray1: " + java.util.Arrays.toString(inputArray1));
        System.out.println("outputArray1: " + java.util.Arrays.toString(outputArray1));
    //task 2
        int[] inputArray2 = {50000, 75000, 60000, 80000, 65000};
        double[] outputArray2 = new double[inputArray2.length];
        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * 0.13;}
        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2: " + Arrays.toString(outputArray2));
    }
}
