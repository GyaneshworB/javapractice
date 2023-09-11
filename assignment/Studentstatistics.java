
/**
 * Write a description of class Studentstatistics here.
 *
 * @author (Gyaneshwor)
 * @version (a version number or a date)
 */
import java.util.*;

public class Studentstatistics {
    public static void main(String[] args){
        
        //F1:  allows the user to input the assignment name
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the assignment name: ");
    String assessmentName = input.nextLine();
    
    //F2 
    double[] marks = new double[30];
    int i;
    for(i=0 ; i< marks.length; i++){
        double mark;
        do{
            System.out.print("Enter the mark: ");
            mark = input.nextDouble();
            // F4
            if (mark <0 || mark>30){
                System.out.println("Error: The marks should only be between 0 and 30 ");
            
            }

            
            
            
        }while(mark <0 || mark >30);
        
        marks[i] = mark;
        }
        //f4 do the formating also on your own at home
        System.out.println("Assessment Name: "+ assessmentName);
        for(i=0 ; i< marks.length; i++){
        System.out.print(marks[i]);
    }
    
    //f5: printing the highest and lowest marks
    double highMark = marks[0];
    double lowMark = marks[0];
    
    for(int j =1; j<marks.length;j++){
        if(marks[j] > highMark)
            highMark = marks[j];
            
        if(marks[j] < lowMark)
            lowMark = marks[j];
    }
    
    System.out.println("Highest Mark: " + highMark);
    System.out.println("Lowest Mark: " + lowMark);
    
    
    
    
    
    
    }
    
    //
    
}
    

