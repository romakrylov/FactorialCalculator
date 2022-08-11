import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("¬ведите число от 1 до 12:");
        int value = new Scanner(System.in).nextInt();

        if (value >= 0 && value <= 12) {
            int result = 1;
            for (int i = 1; i <= value; i++)
                result *= i;
            System.out.println("‘акториал равен: " + result);
        } else {
            System.out.println("¬ведено неверное значение. ¬ведите число от 1 до 12: ");
        }
    }
}


