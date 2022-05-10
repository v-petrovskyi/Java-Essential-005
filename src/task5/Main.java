package task5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachersList = new ArrayList<>();
        teachersList.add("Smith");
        teachersList.add("Jones");
        teachersList.add("Taylor");
        teachersList.add("Williams");
        teachersList.add("Brown");
        teachersList.add("White");
        teachersList.add("Harris");

        System.out.println("index of the best teacher is " +teachersList.indexOf("Taylor"));
        System.out.println("index of the worst teacher is " +teachersList.indexOf("White"));

        System.out.println(teachersList);
    }
}
