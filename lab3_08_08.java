public class lab3_08_08 {
    public static void main(String[] args) {
    	int Size = 10;
        char chars[] = new char[Size]; // —оздание массива с размером 10
        char i = 'A'; 
        char ExChars [] = {'A', 'E', 'I', 'O', 'U', 'Y'}; //создание массива гласных
        for (int x = 0; x < chars.length; i++) //заполнение массива
        {
        	for (int y = 0; y < ExChars.length; y++) //проверка на соответсвие массива гласных
        	{
        	if (i == ExChars[y]) {
        	i++;
        	}
    		        	}
  		chars[x] = i; // ѕрисвоение x-тому элементу массива значени€ i
   		System.out.println("Ёлемент массива ["+x+"] = " + chars[x]); // —ообщение пользователю
   		x++;
       }
        System.out.println("конец массива\n"); // —ообщение пользователю 
                        }
    }
