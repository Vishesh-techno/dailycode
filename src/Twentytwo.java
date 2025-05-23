import java.util.Scanner;

public class Twentytwo {
    //    Write a Java method to compute the average of three numbers
    public static int avgnum(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    //    Write a method named isEven that accepts an int argument. The method
//    should return true if the argument is even, or false otherwise. Also write a program to test your method.
    public static boolean isEven(int a1) {
        return (a1 % 2 == 0);
    }
//Write a Java program to check if a number is a palindrome in Java?

    public static void main(String[] args) {
//        Sum of first n natural numbers
        int n = 100;
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
//     print square pattern
        for (int j = 1; j <= 5; j++) {
            for (int k = 1; k <= 5; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
//     print reverse of a number
        int n1 = 10899;
        while (n1 > 0) {
            int rem = n1 % 10;
            System.out.print(rem);
            n1 /= 10;
        }
        System.out.println();
//        reverse a number
        int rev = 0;
        int n2 = 12509;
        while (n2 > 0) {
            int ld = n2 % 10;
            rev = rev * 10 + ld;
            n2 = n2 / 10;
        }
        System.out.println("rev is: " + rev);

        for (int i3 = 0; i3 < 5; i3++) {
            System.out.println("Hello");
            i3 += 2;
        }
        System.out.println();
//Write a program that reads a set of integers, and then prints the sum of the
//even and odd integers.
        int a = 5565421;
        int evensum = 0;
        int oddsum = 0;
        while (a > 0) {
            int lsd = a % 10;
            if (lsd % 2 == 0) {
                evensum += lsd;
            } else {
                oddsum += lsd;
            }
            a /= 10;
        }
        System.out.println("Sum of even digits: " + evensum);
        System.out.println("Sum of odd digits: " + oddsum);

//        Write a program to find the factorial of any number entered by the user
        Scanner sc = new Scanner(System.in);
        do {
            int fact1 = 1;
            System.out.print("Enter an integer: ");
            int n4 = sc.nextInt();
            for (int i5 = 1; i5 <= n4; i5++) {
                fact1 = i5 * fact1;
            }
            System.out.println("Fact is: " + fact1);
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
        }while (sc.nextInt() == 1);

//        Write a program to print the multiplication table of a number N, entered by the user.
        System.out.println("enter a number for a table: ");
        int n5 = sc.nextInt();
        for (int i5 = 1; i5 <= 10; i5++) {
            int table = n5 * i5;
            System.out.println(n5 + "X" + i5 + " = " + table);
        }
        System.out.println();

//        for(int i6 = 0; i6 <= 5; i6++ ) {
//            System.out.println("i = " + i6 );
//        }System.out.println("i after the loop = " + i );
//      Write a Java method to compute the average of three numbers
        System.out.println("enter the number of a , b, and c");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("the avg is: " + avgnum(x, y, z));

        //    Write a method named isEven that accepts an int argument. The method
//    should return true if the argument is even, or false otherwise. Also write a program to test your method.
        System.out.println("enter the number: ");
        int x1 = sc.nextInt();
        System.out.println("even: " + isEven(x1));
    }
}
