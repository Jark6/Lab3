import java.util.Scanner;

public class lab3_08_06 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // �������� ������� ������ Scanner ��� ���������� ����� ��������� � �������
        System.out.println("������� ������ �������"); // ��������� ������������ 
        if (id.hasNextInt()) { //�������� ������ �����, ���������� �������������
        int Size = id.nextInt(); // ������ � ���������� Size (������ ��� ���� ����� ������ ������ �������)
        if (Size > 0) { //���������������������� �����, ���������� �������������
    	System.out.println("������ ������� ����� "+ Size); // ��������� ������������ 
        int[] nums = new int[Size]; // �������� ������� � �������� �������� �� �������
        int x = 0;
        int i = 0;
        while (x<Size) {
        	i++;
        	if (i%5 == 2) {
        	nums[x] = i; // ���������� x-���� �������� ������� �������� i
            System.out.println("������� ������� ["+x+"] = " + nums[x]); // ��������� ������������ 
            x++;
        	}
        	}
        System.out.println("����� �������"); // ��������� ������������ 
        }
        else {
        System.out.println("������������ ���������"); // ��������� ������������, ��� �������� ������� �������
        id.next();
        }
        }
        else {
        System.out.println("������������ ���������"); // ��������� ������������, ��� �������� ������� �������
        id.next();
        }
     }
}