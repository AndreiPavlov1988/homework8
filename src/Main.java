import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] inputArray1 = {15000, 22000, 18000, 25000, 19000};
        double[] outputArray1 = new double[4];
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int num : inputArray1) {
            sum += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }
        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = sum / 5.0;
        System.out.print("inputArray1: ");
        for (int num : inputArray1) {
            System.out.print(num + " ");
        }
        System.out.print("\noutputArray1: ");
        for (double num : outputArray1) {
            System.out.print(num + " ");
        }
        System.out.println();
        // task 2
        int[] inputArray2 = {50000, 75000, 60000, 80000, 65000};
        double[] outputArray2 = new double[5];
        int i = 0;
        for (int num : inputArray2) {
            outputArray2[i++] = num * 0.13;
        }
        System.out.print("inputArray2: ");
        for (int num : inputArray2) {
            System.out.print(num + " ");
        }
        System.out.print("\noutputArray2: ");
        for (double num : outputArray2) {
            System.out.print(num + " ");
        }
        System.out.println();
        // task 3
        int[] inputArray3 = {3000, 7000, 4500, 8000, 6000};
        boolean[] outputArray3 = new boolean[5];
        i = 0;
        for (int num : inputArray3) {
            outputArray3[i++] = num > 5000;
        }
        System.out.print("inputArray3: ");
        for (int num : inputArray3) {
            System.out.print(num + " ");
        }
        System.out.print("\noutputArray3: ");
        for (boolean flag : outputArray3) {
            System.out.print(flag + " ");
        }
        System.out.println();
        // task 4
        int[] inputArray4 = {5000, 3000, -1000, 2000, 4000};
        boolean[] outputArray4 = {true};
        for (int num : inputArray4) {
            if (num < 0) {
                outputArray4[0] = false;
                break;
            }
        }
        System.out.print("inputArray4: ");
        for (int num : inputArray4) {
            System.out.print(num + " ");
        }
        System.out.print("\noutputArray4: " + outputArray4[0]);
        System.out.println();
        // task 5
        int[] inputArray5 = {50000, -20000, 30000, -10000, 40000};
        int[] outputArray5 = {0};
        for (int num : inputArray5) {
            if (num > 0) {
                outputArray5[0]++;
            }
        }
        System.out.print("inputArray5: ");
        for (int num : inputArray5) {
            System.out.print(num + " ");
        }
        System.out.print("\noutputArray5: " + outputArray5[0]);
    }
}
