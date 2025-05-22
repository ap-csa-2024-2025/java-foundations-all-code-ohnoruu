import java.util.Scanner;
import javax.swing.JOptionPane;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your grade");
        int iGrade = sc.nextInt();
        System.out.println("Your grade next year is " + (iGrade+1));
        sc.close();

        String input = JOptionPane.showInputDialog("What is your age?");
        int age = Integer.parseInt(input); //extracts int from String
        System.out.println("In 10 years you will be " + (age+10));
    }
}
