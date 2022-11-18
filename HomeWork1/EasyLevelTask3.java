public class EasyLevelTask3 {
    public static void main(String[] args) {
        //Курица
        boolean chicken = false;
        //Овощи
        boolean vegetables = false;
        //Соус
        boolean sour = false;
        //Хлеб
        boolean toast = true;
        //Колбаса
        boolean sausage = false;
        //Яйца
        boolean eggs = true;
        // Задача: Повара попросили сделать салат.
        // Если у повара есть все ингредиенты для "Цезаря" (курица, овощи, соус и гренки), то лучше сделать "Цезарь".
        // Если для "Цезаря" ингредиентов не нашлось, то сделать Оливье (овощи, колбаса или курица, яйца).
        // Если и для Оливье не нашлось ингредиентов, то сделать Овощной салат (нужны только овощи).
        // Если ингредиентов нет, то повар объявляет: У меня ничего нет
        // Написать набор условий, приготовления салатов, по приоритету (от Цезаря к овощному).
        // Либо объявить о невозможности сделать салат.
        // Ожидаемый результат: вывод на экран сделанного салата или объявление о том, что ничего нет.
        // Проверьте работоспособность условий, через изменение значения переменных.
        if (chicken == true && vegetables == true && sour == true && toast) {
            System.out.println("Цезарь");
        } else if (vegetables == true && eggs == true && (sausage == true || chicken == true)) {
            System.out.println("Оливье");
        } else if (vegetables == true) {
            System.out.println("Овощной салат");
        } else {
            System.out.println("Не хватает ингредиентов");
        }
    }
}
