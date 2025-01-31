public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        int[] numbers2 = new int[10];
        for (int i = 0; i < numbers2.length; i++) {
            numbers2[i] = i + 11;
        }


        System.out.print("Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + "");
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        System.out.print("Array2:");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i] + "");
        }
        System.out.println();



    }
}