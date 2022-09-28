public class Main {
    public static void main(String[] args) {
        System.out.println("Здорова, ребзя");
        //task1 С помощью цикла for выведите в консоль все числа от 1 до 10
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        //task2 С помощью цикла for выведите в онсоль все числа от 10 до 1
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        //task3 Выведите в консоль все четные числа от 1 до 17
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //task4 Выведите в консоль все числа от 10 до -10 от большего числа к меньшему
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.print(i + " ");
        }
        System.out.println();
        //task5 Выведите в консоль все високосные года, начиная с 1904 по 2096 год
        System.out.println("Список високосных годов за промежуток с 1904 по 2096 год: ");
        for (int i = 1904; i <= 2096; i = i + 4) {
            if (i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        //task6 Напишите программу, которая выводит в консоль последовательность цифр:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        //task7 Напишите программу, которая выводит в консоль последовательность цифр:
        //1 2 4 8 16 32 64 128 256 512

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        //task8 Посчитайте с помощью цикла for сумму годовых накоплений
        int wage = 29000;
        int totalSalary = 0;
        float totalWage = 0;
        for (int i = 1; i <= 12; i++) {
            totalSalary = totalSalary + wage;
            System.out.println("Месяц " + i + ". Сумма в банке - " + totalSalary + " руб.");
            totalWage = (float) (totalSalary + totalSalary * 0.12);
            System.out.println("Сумма с процентами - " + totalWage + " руб.");
        }
        System.out.println();
        //task9 Добавьте к задаче выше 12% годовых.
    }
}