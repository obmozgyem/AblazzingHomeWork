package HomeWork2.Easy;

public class EasyLevelTask1 {
    public static void main(String[] args) {
        //Задача №1
        //Дано (их менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже), убрать лишние пробелы,
        //затроить (Можно вызвать тольку одну команду System.out.print())
        //
        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!

        for (int i = 0; i <3 ; i++) {
            System.out.print(hi.trim()+world.toLowerCase()+newLine);
        }

    }
}
