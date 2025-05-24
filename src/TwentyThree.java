import java.util.Scanner;

public class TwentyThree {
    public static int LinearSearch(int[] numbers, int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                System.out.print("Element found in the array at index: ");
                return i;
            }
        }
        System.out.print("Element not found ");
        return -1;
    }

    public static int largestaray(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("the smallest number is " + smallest);
        return largest;
    }

    public static int BinarySearch(int[] numbers, int key) {
        int start = 0;
        int end = numbers.length;
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (numbers[mid] == key) {
                return mid;
            } else if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void ReverseArray(int[] numbers) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;

        }
    }

    public static void PairsArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + ", " + numbers[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void PairsubArray(int[] numbers) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i + 1; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k < end; k++) {
                    System.out.print("(" + numbers[k] + ")");
                    ts++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The pairs array contains " + ts + " elements");
    }

    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
                System.out.println();
            }
        }
    }

    public static void maxSumArray(int[] numbers) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i; j < numbers.length; j++) {
                currsum = 0;
                for (int k = i; k < j; k++) {
                    currsum = currsum + numbers[k];
                }
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum is " + maxsum);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {2, 4, 6, 8, 10, 20, 40, 50};
        int choice;
        do {
            System.out.print("Enter the number to be searched: ");
            int key = sc.nextInt();
            System.out.println(LinearSearch(numbers, key));
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("The largest number in the array is " + largestaray(numbers));
        int choice2;
        do {
            System.out.print("Enter the number to be searched: ");
            int key1 = sc.nextInt();
            System.out.println("the key found at index: " + BinarySearch(numbers, key1));
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
            choice2 = sc.nextInt();
        } while (choice2 == 1);
        ReverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        PairsArray(numbers);
        PairsubArray(numbers);
        bubbleSort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        int[] numbers2 = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSort(numbers2);
        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }
        System.out.println();
        maxSumArray(numbers);
        System.out.println();
        System.out.println("Program ended.");


    }
}
