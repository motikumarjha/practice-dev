import java.util.*;

// Java code to name the student and marks score,
// find the avg of marks scored.
// Print the name and avg in format Name-Avg.
public class FindAverage {
    public static void main(String[] args){
        int[] marks = {300,200};
        FindAverage.getAvgMarks("Moti",marks);
    }
    public static int getAvgMarks(String name, int[] marks){
        int len = marks.length;
        int avg = 0;
        int a = 0;
        for(int i =0; i<len; i++){
            a = a + marks[i];
        }
        avg = a/len;
        System.out.println(name + "-" + avg);
        return avg;
    }
}
