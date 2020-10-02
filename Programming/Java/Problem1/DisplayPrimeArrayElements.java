import java.util.Scanner;
public class DisplayPrimeArrayElements
{
    public static void main(String[] args)
    {
        int size=20;
        int array[]=new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 numbers to be checked for being prime numbers");
        for (int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.print("\nThe prime numbers are: ");
        for (int i=0;i<size;i++)
        {
            boolean flag = false;
            for(int j = 2; j <= array[i]/2;j++)
            {
                if(array[i] % j == 0)
                {
                    flag = true;
                    break;
                }
            }
        if (!flag)
            System.out.print(array[i] +",");
        }  
    }
}
