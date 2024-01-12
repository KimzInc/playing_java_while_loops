import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    getGrades();
    }

    private static void getGrades() {
        int gradeCounter = 0;
        int sumOfAllGrades = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter grade or -1 to quit: ");
        int grade = scanner.nextInt();
        //scanner.next();

        while (grade >= 0 && grade <= 100) {


            sumOfAllGrades += grade;
            System.out.print("Enter grade or -1 to quit: ");
            grade = scanner.nextInt();
            gradeCounter++;
        }


        //calculate average
        if(gradeCounter!=0){
            double average = (double)sumOfAllGrades/gradeCounter;
            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    gradeCounter, sumOfAllGrades);
            System.out.printf("The average based on the grades is %.2f%n", average);
        }else{
            System.out.println("User has not entered the grades");
        }
    }

}