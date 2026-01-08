package Lab_excercise_Loop;

import java.util.Scanner;

public class Lab_excercise_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no:");
        int num= sc.nextInt();

        for (int i=0; i<num; i++)
        {
            if(i!=5)
            {
                System.out.println(i);
                continue;
            }
        }
    }
}
