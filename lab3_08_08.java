public class lab3_08_08 {
    public static void main(String[] args) {
    	int Size = 10;
        char chars[] = new char[Size]; // �������� ������� � �������� 10
        char i = 'A'; 
        char ExChars [] = {'A', 'E', 'I', 'O', 'U', 'Y'}; //�������� ������� �������
        for (int x = 0; x < chars.length; i++) //���������� �������
        {
        	for (int y = 0; y < ExChars.length; y++) //�������� �� ����������� ������� �������
        	{
        	if (i == ExChars[y]) {
        	i++;
        	}
    		        	}
  		chars[x] = i; // ���������� x-���� �������� ������� �������� i
   		System.out.println("������� ������� ["+x+"] = " + chars[x]); // ��������� ������������
   		x++;
       }
        System.out.println("����� �������\n"); // ��������� ������������ 
                        }
    }
