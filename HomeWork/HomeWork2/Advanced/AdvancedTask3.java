package HomeWork2.Advanced;

public class AdvancedTask3 {
    public static void main(String[] args) {
        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
        int[] array = {1, 2, 5, 7,10};
        int[] array2 = {2, 3, 2, 17, 15};
        //чтобы можно было использовать разной длины массивы
        int[] arrayMultiplication = new int[((array.length + array2.length) / 2)];
        for (int i = 0; i < arrayMultiplication.length; i++) {
            arrayMultiplication[i] = array[i] * array2[i];
        }

        int[] result = new int[array.length + array2.length + arrayMultiplication.length];

        System.arraycopy(array, 0, result, 0, array.length);
        System.arraycopy(array2, 0, result, array.length, array2.length);
        System.arraycopy(arrayMultiplication, 0, result, array.length + array2.length, arrayMultiplication.length);
        for (int i : result) {
            System.out.println(i);
        }

    }
}
