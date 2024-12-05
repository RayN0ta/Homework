import java.util.Random;
import java.util.Scanner;

public class UniqueElements 
{
	public static void main(String[] args)
	{

        Scanner input = new Scanner(System.in);

        // Въвеждане на размер на първия масив
        System.out.print("Въведете N: ");
        int N = input.nextInt();

        // Създаване на първия масив
        int[] firstArray = new int[N];
        
        // Въвеждане на елементите на първия масив
        System.out.println("Въведете " + N + " елемента за първия масив:");
        for (int i = 0; i < N; i++) 
        {
            firstArray[i] = input.nextInt();
        }

        // MIN and MAX
        int min = firstArray[0];
        int max = firstArray[0];
        for (int i = 1; i < N; i++) 
        {
            if ( min > firstArray[i] ) min  = firstArray[i];
            if ( max < firstArray[i] ) max  = firstArray[i];
        }

        int[] secondArray = new int[2*N];
        Random random = new Random();

        // Генериране на произволни числа в интервала [min, max]
        System.out.print("Втория масив:  " );
        for (int i = 0; i < 2*N; i++) 
        {
            secondArray[i] = random.nextInt(max - min + 1) + min;
            System.out.print( secondArray[i] + " " );
        }

        System.out.println("\nРезулат:");

        for ( int i = 0; i < N; i++) 
        { //първия масив

            boolean found = false;

            for ( int j = 0; j < 2*N; j++ ) 
            { // втория масив
                if ( firstArray[i] == secondArray[j] ) found = true;
            }

            if ( !found )
            {
                System.out.print( firstArray[i] + " " );
            }

        }

        input.close();
    }
}