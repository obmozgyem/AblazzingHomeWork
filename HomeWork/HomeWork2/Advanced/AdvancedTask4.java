package HomeWork2.Advanced;

public class AdvancedTask4 {
    public static void main(String[] args) {
        //Задача №4
        //В слове "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов
        String word = "Hello world!";
        String result = word.replace('l', 'r');
        word = result.toUpperCase();
        result = word.substring(0, 8);
        System.out.println(result);
    }
}
