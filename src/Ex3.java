import java.util.ArrayList;
//3. Создать ArrayList с типом String, добавить в него имена. Написать метод,
//который примет на вход ArrayList и строку, проверит, есть ли такая строка в ArrayList,
//и вернет ответ "да" или "нет" ((метод contains())).

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Masha");
        list2.add("Dasha");
        String string = "Masha";
        met (list2, string);
        System.out.println(met(list2,string));


    }
    public static String met (ArrayList <String> arrayList,  String str){
        if (arrayList.contains(str) ){
         return "ДА";
        }      else {
            return "НЕТ";
        }
    }

}
