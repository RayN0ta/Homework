import java.util.Scanner;

public class PrimeDivisorsOfSum 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете N: ");
        int N = scanner.nextInt();

        int[] numbers = new int[N];
        int sum = 0;

        // Въвеждане на
        System.out.println("Въведете числата:");
        for (int i = 0; i < N; i++) 
        {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }


        System.out.println("Сумата на въведените числа е: " + sum);

        // Намиране на простите делители на сумата
        System.out.println("Простите делители на сумата са: ");


        for (int i = 2; i <= sum; i++) 
        {
            if (sum % i == 0 && isPrime(i))
            {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }



    public static boolean isPrime(int number) 
    {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0) return false;
        }
        return true;
    }
    
   // Scanner input = new Scanner(System.in);
	//int n = input.nextInt();
	//int k = input.nextInt();
	//for (int i = n; i< k ; i ++)
	//{	
	//	boolean isPrime = false;
	//	for (int j = 2; j <= Math.sqrt(i); j++)
	//	{
	//		System.out.println(i + " " + j);
	//		if ( i % j != 0) 
	//		{
	//			isPrime = true;
	//		}
    //
    //	else 
	//		{
	//			isPrime = false;
	//			break;
	//		}

}
