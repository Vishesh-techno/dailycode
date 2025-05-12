public class twelvemay {

    public double[] convertTemperature(double celsius) {
        double answer[] = new double[2];
        double kelvin = celsius + 273.15;
        double fahrenheit = (celsius * 1.80) + 32.00;
        answer[0] = kelvin;
        answer[1] = fahrenheit;
        return answer;
    }

    public static void main(String[] args) {
        twelvemay obj = new twelvemay(); // create object
        double[] result = obj.convertTemperature(36.5);

        System.out.println("Kelvin: " + result[0]);
        System.out.println("Fahrenheit: " + result[1]);
    }
}
