public class EasyLevelTask1 {
    //Базовая домашка
    //Задача №1
    //Создать переменные с ростом (!в метрах), весом.
    //Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
    //Пример результата вывода на экран:
    //21.00202130120
    public static void main(String[] args) {
      double  growth = 1.85;
      double weight =95.0;

      double index=weight/(growth*growth);
        System.out.println(index);
    }
}
