public class Swap {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("Before Swapping value: " + x + " " + y);

        int temp = x;
        x = y;
        y = temp;
        //After Swap
        System.out.println("After Swapping value: " + x + " " + y);
    }
}
