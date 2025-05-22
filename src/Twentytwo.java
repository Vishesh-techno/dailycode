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
    }
}
