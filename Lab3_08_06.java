import java.util.Scanner;

public class Lab3_08_06 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите размер массива"); // Сообщение пользователю "для красоты и понимания"
        int Size = id.nextInt(); // Запись в переменную Size (нужная для того чтобы задать размер массива)
        //значения введенного в консоль
        System.out.println("Размер массива равен "+ Size); // Сообщение пользователю "для красоты и понимания"
        int[] nums = new int[Size]; // Создание массива с размером введённым из консоли

            for (int i = 0 ; i < nums.length ; i++ )
            {
            nums[i] = ; // Присвоение i-тому элементу массива случайного значения
            System.out.println("Элемент массива ["+i+"] = " + nums[i]); // Сообщение пользователю "для красоты и понимания"
        }
                }
    }

