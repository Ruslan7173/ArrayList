
//2. Создать ArrayList с типом Integer, добавить в него числа,
// просуммировать эти числа в цикле, ответ вывести в консоль.

import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList <Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(10);
        list1.add(15);
        System.out.println(list1);
        int  sum =0;
        for (int i = 0; i<list1.size();i++){
             sum = sum+ list1.get(i);
            System.out.println(sum);


        }
        System.out.println(sum);


    }
}
