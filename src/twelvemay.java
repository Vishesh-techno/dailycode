public class twelvemay {

    public double[] convertTemperature(double celsius) {
        double answer[] = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.80) + 32.00;
        answer[0] = kelvin;
        answer[1] = fahrenheit;
        return answer;
    }
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
    public int smallestEvenMultiple(int n) {
        if(n%2 == 0){
            return n;
        }else{
            return 2 * n;
        }
    }
    public static void main(String[] args) {
        twelvemay obj = new twelvemay(); // create object
        double[] result = obj.convertTemperature(36.5);
        int cf = obj.commonFactors(4,10);
        String[] operations = {"++X", "X++", "--X", "X++"};
        int fval = obj.finalValueAfterOperations(operations);
        int smallmult = obj.smallestEvenMultiple(55);

        System.out.println("Kelvin: " + result[0]);
        System.out.println("Fahrenheit: " + result[1]);
        System.out.println("common factors: " + cf);
        System.out.println("Final value after operations: " + fval);
        System.out.println("smallest even multiple: " + smallmult);
    }
}
