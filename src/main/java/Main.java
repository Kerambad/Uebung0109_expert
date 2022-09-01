
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //1. Return String backwards:
        String test = "That's a String!!!!";
        System.out.println("String backwards: " + backwards(test));

        //2.Sort Array
        int[] array = {6, 2, 8, 3, 9, 6};
        System.out.println("Sort Array: " + Arrays.toString(sort(array)));

        //3. return String as Array
        String s = "Hello to everyone!!!";
        System.out.println("String as Array: " + Arrays.toString(toarray(s)));
        //4. calculate digit sum
        int i = 3465874;
        System.out.println("Digit sum: " + quersumme(i));

    }

    public static String backwards(String test) {
        return new StringBuilder(test).reverse().toString();
    }

    public static int[] sort(int[] tosort) {
        return Arrays.stream(tosort).sorted().toArray();
    }

    public static char[] toarray(String input) {
        return input.toCharArray();

    }

    public static int quersumme(int number) {
        String temp = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < temp.length(); i++) {
            sum += Character.getNumericValue(temp.charAt(i));
        }
        return sum;

    }

}

