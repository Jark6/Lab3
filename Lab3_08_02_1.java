import java.util.Scanner;
// пакет для подключения класса Scanner, для считывания с консоли значения

public class Lab3_08_02_1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in); // Создание объекта класса Scanner для считывания числа введённого к консоль
        System.out.println("Введите день недели(кириллица, нижний регистр)"); // Сообщение пользователю "для красоты и понимания"
        String day = id.nextLine(); // Запись в переменную day
        int dayN = 0;

            if (day == "понедельник") {
                dayN = 1;
                if (day == "вторник") {
                    dayN = 2;
                    if (day == "среда") {
                        dayN = 3;
                        if (day == "четверг") {
                            dayN = 4;
                            if (day == "пятница") {
                                dayN = 5;
                                if (day == "суббота") {
                                    dayN = 6;
                                    if (day == "воскресенье") {
                                        dayN = 7;
                                    }
                                    else {
                                        System.out.println(day + " некорректное значение дня недели");
                                    }

                                }
                            }
                        }
                    }
                }
            }
            System.out.printf("%s это %i-й день недели" ,day ,dayN);

                       }
    }
