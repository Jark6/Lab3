import java.util.Arrays;
//����� ��� ����������� ������ Arrays, ��� ���������� ��������� ������� �� �����������

public class lab3_08_07 {
    public static void main(String[] args) {
    	int Size = 10;
        char chars[] = new char[Size]; // �������� ������� � �������� 10
        char i = 'A';
        char ExChars [] = {'A', 'E', 'I', 'O', 'U', 'Y'};
       for (int x = 0; x < Size; i++) {
        	for (int y = 0; y <= ExChars.length; y++) {
    	   if (i != ExChars[y]) {
        	chars[x] = i; // ���������� x-���� �������� ������� �������� i
            System.out.println("������� ������� ["+x+"] = " + chars[x]); // ��������� ������������ 
                    	}
        	}
        	x++;
       }
        System.out.println("����� �������\n"); // ��������� ������������ 
        Arrays.sort(chars); // ���������� ������� �� ����������� ��� ���������
        System.out.println("����������� ���������� �������"); // ��������� ������������ "��� ������� � ���������"
        for (int x = 0 ; x < chars.length ; x++ ){
            System.out.println("������� ������� ["+x+"] ����� ���������� = " + chars[x]); //��������� ������������ ��� ������� � ���������
        }
        System.out.println("����� �������"); // ��������� ������������ 
                }
      
     }