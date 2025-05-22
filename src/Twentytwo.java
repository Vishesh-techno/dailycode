public class Twentytwo {
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
    }
}
