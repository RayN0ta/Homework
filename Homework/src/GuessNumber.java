import java.util.Random;
import java.util.Scanner;

public class GuessNumber 
{
	public static void main(String[] args)
	{
        // Генериране на произволно число от 1 до 100
		Scanner scanner = new Scanner(System.in);
       
		Random random = new Random();
        int secretN = random.nextInt(100) + 1;

        
        int t = 5;

        System.out.println("Намислих си число между 1 и 100. Пробвай с " + t + " опита.");

        while (t > 0) 
        {
            System.out.print("Какво си намислих?:");
            int guess = scanner.nextInt();

            if (guess == secretN) 
            {
                System.out.println("Браво! Познахте!");
                break;
            } 
            else if ( guess < secretN) 
            {
                System.out.println("Малко нагоре.");
            } 
            else 
            {
                System.out.println("Малко надолу");
            }

            t--;
            System.out.println("Остават " + t + " опита.");
        }
        if (t==0) System.out.println("Опитите Ви свършиха и Вие не успяхте да познаете. Загубихте :(... Числото беше " + secretN);

        scanner.close();
    }
}
