/* �������� ���������, ������� ����� ������� ��������� ����������� � ������� �����.
��������� ������ ����� � ��� ������������ ����� ������ ����� �� ��� ����� ������������� ����� ������ ����.
������������ ��������������� ������. ��� ������� �������� ���������� ��� ��������� �����:
        3! = 1 ? 2 ? 3 = 6
        5! = 1 ? 2 ? 3 ? 4 ? 5 = 120
*/


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("������� ����� �� 1 �� 12:");
        int value = new Scanner(System.in).nextInt();

        if (value >= 0 && value <= 12) {
            int result = 1;
            for (int i = 1; i <= value; i++)
                result *= i;
            System.out.println("��������� �����: " + result);
        } else {
            System.out.println("������� �������� ��������. ������� ����� �� 1 �� 12: ");
        }
    }
}


