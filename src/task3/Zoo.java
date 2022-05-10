package task3;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(0,"зебра");
        list.add(0,"тушканчик");
        list.add(0,"лось");
        list.add(0,"лев");
        list.add(0,"тигр");
        list.add(0,"носоріг");
        list.add(0,"пінгвін");
        list.add(0,"жираф");

             list.remove(3);
        list.remove(5);
//        list.remove(7); // не можна видалити сьомий елемент, тому що його нема

        System.out.println(list);
        System.out.println(list.size());
    }

}