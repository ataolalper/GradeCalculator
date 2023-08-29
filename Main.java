import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Physics grade: ");
        int physics = input.nextInt();

        System.out.print("Enter your Math grade: ");
        int math = input.nextInt();

        System.out.print("Enter your Turkish grade: ");
        int turkish = input.nextInt();

        System.out.print("Enter your Chemistry grade: ");
        int chemistry = input.nextInt();

        System.out.print("Enter your Music grade: ");
        int music = input.nextInt();

        System.out.print("Enter your History grade: ");
        int history = input.nextInt();

        double average = (physics + math + turkish + chemistry + music + history) / 6;
        double passGrade = 60;

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Your Physics grade is " + physics);
        System.out.println("Your Math grade is " + math);
        System.out.println("Your Turkish grade is " + turkish);
        System.out.println("Your Physics grade is " + chemistry);
        System.out.println("Your Physics grade is " + music);
        System.out.println("Your History grade is " + history);
        System.out.println("Your Average grade is " + average);

        System.out.println(" ");
        System.out.println(" ");

        if (average < passGrade){
            System.out.println("You failed the class.");
        }
        else {
            System.out.println("You pass the class.");
        }
    }
}