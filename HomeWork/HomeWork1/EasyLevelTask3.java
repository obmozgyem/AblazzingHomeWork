package HomeWork1;

public class EasyLevelTask3 {
    public static void main(String[] args) {
        //Курица
        boolean chicken = true;
        //Овощи
        boolean vegetables = true;
        //Соус
        boolean sour = true;
        //Хлеб
        boolean toast = true;
        //Колбаса
        boolean sausage = false;
        //Яйца
        boolean eggs = true;

        if (chicken  && vegetables  && sour  && toast) {
            System.out.println("Цезарь");
        } else if (vegetables && eggs && (sausage || chicken)) {
            System.out.println("Оливье");
        } else if (vegetables ) {
            System.out.println("Овощной салат");
        } else {
            System.out.println("Не хватает ингредиентов");

        }

    }
}
