import java.util.Random;
import java.util.Scanner;

public class Random_generator 
{
	public static void main(String[] args)
 {

        Scanner scanner = new Scanner(System.in);

        // Въвеждане на стойностите от потребителя
        System.out.print("Въведете K:");
        int K = scanner.nextInt();

        System.out.print("Въведете N:");
        int N = scanner.nextInt();

        System.out.print("Въведете T:");
        int T = scanner.nextInt();

        Random random = new Random();
        long[] numbers = new long[N];

        // Поставяне на първата стойност K
        numbers[0] = K;

        // Генериране на останалите N-1 стойности
        for (int i = 0; i < N-1; i++) 
        {
            numbers[i+1] = random.nextLong( (numbers[i]* numbers[i]) - numbers[i] ) + numbers[i];
        }

        System.out.print("|");
        for (int i = 0; i < N; i++) 
        {
                System.out.print(numbers[i] + "| ");
        }
        System.out.print("\n");
        
        System.out.println("Делят се на " + T + ":");
        for (int i = 0; i < N; i++) 
        {
            if (numbers[i] % T == 0) 
            {
                System.out.println(numbers[i]);
            }
        }

        scanner.close();
        // !!! Ако масивът е твърде голям, функцията нараства твърде бързо и прехвърля размера на long.
    }
}
