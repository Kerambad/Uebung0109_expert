import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //1. Return String backwards:
        String test = "That's a String!!!!";
        System.out.println("String backwards: "+ backwards(test));

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
        String back = new StringBuilder(test).reverse().toString();
        return back;
    }

    public static int[] sort(int[] tosort) {
        int[] solut = Arrays.stream(tosort).sorted().toArray();
        return solut;
    }

    public static char[] toarray (String input) {
        char[] solut = input.toCharArray();
        return solut;
    }

    public static int quersumme(int number) {
        String temp = Integer.toString(number);
        int sum = 0;
        for (int i = 0; i < temp.length(); i++) {
            sum += temp.charAt(i) - 49;
            //TODO: other solution?
        }
        return sum;
    }


}
