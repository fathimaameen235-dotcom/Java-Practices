public class NestedIf {
    public static void main(String[] args) {
        int n = 5;

        if (n > 0) {
            if (n % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
    }
}