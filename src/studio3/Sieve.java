package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// User insert number n
		Scanner in = new Scanner(System.in);
		
		System.out.print("Find all prime numbers up to: ");
		int n = in.nextInt();
		
		// Create the array of items to be sieved
		int[] sieve = new int[n-1];
		for (int i = 0; i < n-1; i++)
		{
			sieve[i] = i+2;
		}
		
		// Start the sieve
		boolean[] notPrime = new boolean[n-1];
		for (int j = 0; j < n-1; j++)
		{
			for (int k = j+1; k < n-1; k++)
			{
				if (sieve[k] % sieve[j] == 0 && notPrime[k] != true)
				{
					notPrime[k] = true;
				}
			}
		}
		
		// Print out only the prime values
		for (int l = 0; l < n-1; l++)
		{
			if (notPrime[l] == false)
			{
				System.out.print(sieve[l] + " ");
			}
		}
		
	}

}
