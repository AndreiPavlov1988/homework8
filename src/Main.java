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
    }
}