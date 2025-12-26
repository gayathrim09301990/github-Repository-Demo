import java.util.Scanner;

public class Lab_Triangle_classifier {

    //Write a program that classifies a triangle based on its side lengths.
    // Given three input values representing the lengths of the sides,
    // determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
    // or scalene (no sides are equal). Use an if-else statement to classify the triangle.
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();

        if(a==b && a==c)
        {
            System.out.println("This is equilateral Triangle");
        } else if (a==b || a==c )
        {
            System.out.println("this is isosceles Triangle");
        }
        else
        {
            System.out.println("this is Scalene Triangle");
        }

    }
}
