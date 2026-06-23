package personal;

import java.util.HashMap; // it  stores key and value

public class Hash_Map {
    HashMap <Integer, String> students = new HashMap<>();

    public void studentsData(){
        students.put(100,"Producer G");
        students.put(101,"David");
        students.put(102,"Stephen");


            for(Integer id: students.keySet()){
                System.out.println(id + " --> " + students.get(id));
            }

    }

    public static void main(String[] args) {
        Hash_Map list = new Hash_Map();
        list.studentsData();
    }
}
