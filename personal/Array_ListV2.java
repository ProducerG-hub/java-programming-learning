package personal;

import java.util.ArrayList;

public class Array_ListV2 {
    ArrayList <Integer> marks = new ArrayList<>();

    public void averageMarks(){
        double total = 0;
        double average;
        marks.add(80);
        marks.add(90);
        marks.add(75);
        marks.add(60);
        marks.add(95);

        if(marks.isEmpty()){
            System.out.println("No data stored");
            return;
        }
        for(int mark: marks){
            total+=mark;
        }
        average = total/marks.size();

        System.out.println("Total Marks: " + total);
        System.out.println("Average mark: " + average);
    }

    public static void main(String[] args) {
        Array_ListV2 list = new Array_ListV2();
        list.averageMarks();
    }
}
