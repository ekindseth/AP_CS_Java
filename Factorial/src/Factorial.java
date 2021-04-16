import java.util.Scanner;
// input 5 output 120
// input 10 output 3628800
// input 20 output -2102132736
// the problem is the number is to long to fit in the int data type.
// input 5 output 120
// input 10 output 3628800
// input 20 output 2432902008176640000
// the number is now able to fit in the data type.
// twenty is the largest number. input 21 output -4249290049419214848
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number greater than 0: ");
        int number = reader.nextInt();
        long product = 1;
        int count = 1;
        while (count <= number)
        {
            product = product * count;
            System.out.println(product);
            count++;
        }
        System.out.println("The factorial of " + number + " is " + product);
    }
}
