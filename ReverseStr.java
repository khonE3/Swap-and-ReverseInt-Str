public class ReverseStr {
    public static String reverse(String str) {

        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String Str_reverse = "Bak KhonE3 Wave";
        System.out.println("Before Reverse: " + Str_reverse);
        System.out.println("After Reverse: " + reverse(Str_reverse));

        String dogs = "199999";

        System.out.println(Str_reverse + " Eats dogs over " + reverse(dogs) + " dogs");


    }
}
