public class twelvemay {
//     2469. Convert the Temperature
    public double[] convertTemperature(double celsius) {
        double answer[] = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.80) + 32.00;
        answer[0] = kelvin;
        answer[1] = fahrenheit;
        return answer;
    }
//    2427. Number of Common Factors
    public int commonFactors(int a, int b) {
        int count = 0;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }
//    2011. Final Value of Variable After Performing Operations
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String op : operations){
            if(op.contains("++")){
                x++;
            }else{
                x--;
            }
        }
        return x;
    }
//    2413. Smallest Even Multiple
    public int smallestEvenMultiple(int n) {
        if(n%2 == 0){
            return n;
        }else{
            return 2 * n;
        }
    }
//    1486. XOR Operation in an Array
//    n is a size of array
//    start is a starting index
    public int xorOperation(int n, int start) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= start + 2 * i;
        }
        return xor;
    }
    public static void main(String[] args) {
        twelvemay obj = new twelvemay(); // create object
        double[] result = obj.convertTemperature(36.5);
        int cf = obj.commonFactors(4,10);
        String[] operations = {"++X", "X++", "--X", "X++"};
        int fval = obj.finalValueAfterOperations(operations);
        int smallmult = obj.smallestEvenMultiple(55);
        int xorop = obj.xorOperation(2, 5);

        System.out.println("Kelvin: " + result[0]);
        System.out.println("Fahrenheit: " + result[1]);
        System.out.println("common factors: " + cf);
        System.out.println("Final value after operations: " + fval);
        System.out.println("smallest even multiple: " + smallmult);
        System.out.println("xor operation: " + xorop);
    }
}
