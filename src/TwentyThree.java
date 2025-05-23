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
        for (int i = 1; i < numbers.length; i++) {
            if(largest < numbers[i]){
                largest = numbers[i];
            }else if (smallest > numbers[i]){
                smallest = numbers[i];
                System.out.println("the smallest number is " + smallest);
            }
        }
        return largest;
    }
    public static int BinarySearch(int[] numbers, int key) {
        int start = 0;
        int end = numbers.length;
        int mid;
        while (start <= end){
            mid = (start+end)/2;
            if (numbers[mid] ==key){
                return mid;
            }else if (numbers[mid] < key){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {2, 4, 6, 8, 0, 20, 10, 5};
        int choice;
        do {
            System.out.print("Enter the number to be searched: ");
            int key = sc.nextInt();
            System.out.println(LinearSearch(numbers, key));
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
            choice = sc.nextInt();
        }while (choice == 1) ;
        System.out.println("The largest number in the array is " + largestaray(numbers));
        int choice2;
        do {
            System.out.print("Enter the number to be searched: ");
            int key1 = sc.nextInt();
            System.out.println("the key found at index: " + BinarySearch(numbers, key1));
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
            choice2 = sc.nextInt();
        }while (choice2 == 1) ;
        System.out.println("Program ended.");
    }
}
