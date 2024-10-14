import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//1. Создать ArrayList с типом String, добавить в него имена, вывести длину этого ArrayList,
//удалить элемент с индексом 0, заменить элемент с индексом 1 на другой, получить элемент по индексу 2, отсортировать.

public class Main {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("vova");
        list.add("petya");
        list.add("lena");
        list.size();
        list.set(1, "vitay");


        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(2));


    }


}