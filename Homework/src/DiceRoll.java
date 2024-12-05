import java.util.Random;
import java.util.Scanner;

public class DiceRoll 
{
	public static void main (String[] args)
	{

		Scanner input = new Scanner(System.in);
		System.out.print("Въведете N:");
        
		int numberOfRolls = input.nextInt();
        //int numberOfRolls = 1000;
        int[] sumsCount = new int[13];

        Random random = new Random();

        //Хвърляне на заровете
        for (int i = 0; i < numberOfRolls; i++) 
        {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;
            int sum = dice1 + dice2;
            sumsCount[sum]++; // Преброяваме
        }

        System.out.println("Резултати от хвърлянията на два зара:");
        for (int sum = 2; sum <= 12; sum++) 
        {
            double percentage = (double) sumsCount[sum] / numberOfRolls * 100;
            System.out.printf("%d се е паднало %.2f%% от %d хвърляния\n", sum, percentage, numberOfRolls);
        }
        
        input.close();
    }
}


