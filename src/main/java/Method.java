public class Method {


    public static void main(String[] args) {

        int resultAddition = add(20, 30);
        System.out.println(resultAddition);

        double resultDouble = add(10.5, 20.5);
        System.out.println(resultDouble);
        int resultSubtract = subtract( 50, 30);
        System.out.println(resultSubtract);


    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
public  static double add (double a, double b) {

        double  sum = a + b;
        return sum;
}

public static int subtract (int a, int b) {
        int results = a-b;
        return results;

}

}