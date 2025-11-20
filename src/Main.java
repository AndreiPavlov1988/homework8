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
            outputArray2[i] = inputArray2[i] * 0.13;
        }
        System.out.println("inputArray2: " + Arrays.toString(inputArray2));
        System.out.println("outputArray2: " + Arrays.toString(outputArray2));
        //task 3
        int[] inputArray3 = {3000, 7000, 4500, 8000, 6000};
        boolean[] outputArray3 = new boolean[5];
        for (int i = 0; i < 5; i++) {
            if (inputArray3[i] > 5000) {
                outputArray3[i] = true;
            } else {
                outputArray3[i] = false;
            }
        }
        System.out.print("inputArray3: ");
        for (int num : inputArray3) {
            System.out.print(num + " ");
        }
        System.out.print("\noutputArray3: ");
        for (boolean flag : outputArray3) {
            System.out.print(flag + " ");
        }
    //task 4
        int[] inputArray4 = {5000, 3000, -1000, 2000, 4000};
        boolean outputArray4 = true;

        for (int i = 0; i < 5; i++) {
            if (inputArray4[i] < 0) {
                outputArray4 = false;
                break;
            }
        }
        System.out.print("inputArray4: ");
        for (int num : inputArray4) {
            System.out.print(num + " ");
        }
        System.out.print("\noutputArray4: " + outputArray4);
        //task 5
        int[] inputArray5 = {50000, -20000, 30000, -10000, 40000};
        int outputArray5 = 0;
        for (int i = 0; i < 5; i++) {
            if (inputArray5[i] > 0) {
                outputArray5++;
            }
        }
        System.out.print("inputArray5: ");
        for (int num : inputArray5) {
            System.out.print(num + " ");
        }
        System.out.print("\noutputArray5: " + outputArray5);
    }
}
