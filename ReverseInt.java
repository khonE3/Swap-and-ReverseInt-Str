public class ReverseInt {
    public static int reverse(int number) {
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int num = 1234567;
        System.out.println("Before Reverse: " + num);
        System.out.println("After Reverse: " + reverse(num));

    }
}
