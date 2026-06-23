package personal;

// Collections in Java refers to the data structures that's tends to change dynamically

import java.util.ArrayList; // used for array data with a non-fixed size and it allows duplicates

public class Array_List {
    ArrayList <String> students = new ArrayList<>();


    public void studentsData(){
        // adding students in the list
        students.add("Producer G");
        students.add("Stephen");
        students.add("David");

        // size of list
        System.out.println("List have "+ students.size() + " students stored");

        // displaying using for-each loop
        for (String student: students){
            System.out.println(student);
        }
        System.out.println("===================================");


        // removing data from the list
        students.remove("David");
        for (String student: students){
            System.out.println(student);
        }
        System.out.println("List have "+ students.size() + " students after removal");
    }

    public static void main(String[] args) {
        Array_List list = new Array_List();
        list.studentsData();
    }

}
