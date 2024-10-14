import java.util.ArrayList;

// 5. Написать метод, который принимает в качестве параметров два ArrayList'а,
// объединяет их в один и выводит результат на консоль.
public class Ex5 {
    public static void main(String[] args) {
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(2);
        ArrayList<Integer> list5 = new ArrayList<>();
        list4.add(3);
        met1(list4, list5);


    }
    public static void met1 (ArrayList <Integer> list4, ArrayList <Integer> list5){

         list4.addAll(list5);
        System.out.println(list4);


    }
}

