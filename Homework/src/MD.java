import java.util.Random;
import java.util.Scanner;

public class MD 
{
	public static void main (String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете брой на числата: ");
        int N = scanner.nextInt();

        System.out.print("Въведете K: ");
        int K = scanner.nextInt();
        
        System.out.print("Въведете T: ");
        int T = scanner.nextInt();


        int[] numbers = new int[N];
        Random random = new Random();

        for (int i = 0; i < N; i++) 
        {
            numbers[i] = random.nextInt(T-K) + K;
        }

        //средната стойност
        double sum = 0;
        for (int i = 0; i < N; i++) 
        {
            sum += numbers[i];
        }
        double mean = sum / N;

        int maxDiffNumber = 0;
        double maxDifference = Math.abs(maxDiffNumber - mean);

        for (int i = 0; i < N; i++) 
        {
            double difference = Math.abs(numbers[i] - mean);
            if (difference > maxDifference) 
            {
                maxDifference = difference;
                maxDiffNumber = numbers[i];
            }
        }

        // Извеждане на резултатите
        System.out.println("\nСредна стойност: " + mean);
        System.out.println("Числото с максимална разлика от средната стойност: " + maxDiffNumber);
        System.out.println("Максималната разлика: " + maxDifference);

        scanner.close();
    }
}
