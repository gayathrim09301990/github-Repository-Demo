package Lab_excercise_Loop;

import java.util.Scanner;

public class Loop_Excercise_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        for(int i=0; i<num; i++)
        {
            if(i==5){
                System.out.println(i);
               break;

            }
        }
    }
}
