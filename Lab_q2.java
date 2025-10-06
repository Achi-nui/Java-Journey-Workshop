import java.util.Scanner;
public class Lab_q2 { 
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your score: ");
    int score = sc.nextInt();
    
    if (score >= 80) {
        System.out.print("Your grade is: A");
    }
    else if (score >= 70) {
        System.out.print("Your grade is: B");
    }
    else if (score >= 60) {
        System.out.print("Your grade is: C");
    }
    else if (score >= 50) {
        System.out.print("Your grade is: D");
    }
    else {
        System.out.print("Your grade is: F");
    }
    } 
 }