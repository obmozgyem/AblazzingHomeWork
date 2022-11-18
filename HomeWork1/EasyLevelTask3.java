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
