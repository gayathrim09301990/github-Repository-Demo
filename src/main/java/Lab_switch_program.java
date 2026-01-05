
import java.util.Scanner;

public class Lab_switch_program {
    public static void main(String[] args) {

        System.out.print("enter the number from 1 to 7:" );
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("Please enter the valid day num from 1 to 7!!");
                break;

        }
    }
}
