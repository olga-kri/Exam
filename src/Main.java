public class Main {
    public static int square (int a) {
        int result = a*a;
        return result;
    }
    public static void main(String[] args) {
        int x = 178;
        System.out.println("Квадрат числа " + x + " равен " + square(x));
    }
}