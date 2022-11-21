package HomeWork2.Advanced;

public class AdvancedTask1 {
    public static void main(String[] args) {
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 15;
        double result = 0;

        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.

        calculation(increment, result);
    }

    private static void calculation(double increment, double result) {
        if (increment < 0) {
            System.out.println("Your number is negative");
        }
        long count = 0;
        while (true) {
          count++;
          result += increment;
          if (result > 1000000){
              System.out.println(count);
              break;
          }
        }
    }
}
