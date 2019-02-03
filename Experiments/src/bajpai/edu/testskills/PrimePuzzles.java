package bajpai.edu.testskills;

import java.util.ArrayList;
import java.util.List;

/**
 * Some interesting fact about Prime numbers
 * ------------------------------------------------------------------------------------------------------
 * Two is the only even Prime number. Every prime number can represented in form
 * of 6n+1 or 6n-1 except 2 and 3, where n is natural number. Two and Three are
 * only two consecutive natural numbers which are prime too. Goldbach
 * Conjecture: Every even integer greater than 2 can be expressed as the sum of
 * two primes.
 * 
 * GCD of all other natural numbers with a prime is always one.
 * 
 * Wilson Theorem : Wilson’s theorem states that a natural number p > 1 is a
 * prime number if and only if (p - 1) ! ≡ -1 mod p OR (p - 1) ! ≡ (p-1) mod p
 * 
 * Fermat’s Little Theorem: If n is a prime number, then for every a, 1 <= a <
 * n, an-1 ≡ 1 (mod n) OR an-1 % n = 1
 * 
 * Prime Number Theorem : The probability that a given, randomly chosen number n
 * is prime is inversely proportional to its number of digits, or to the
 * logarithm of n.
 * 
 * Lemoine’s Conjecture : Any odd integer greater than 5 can be expressed as a
 * sum of an odd prime (all primes other than 2 are odd) and an even semiprime.
 * A semiprime number is a product of two prime numbers. This is called
 * Lemoine’s conjecture.
 * 
 * 
 *
 */
public class PrimePuzzles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 14;
		int limit = 50000;
		printOddNums(100);
		printEvenNums(100);
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		long startT = System.currentTimeMillis();
		printPrimeNums(limit);
		long endT = System.currentTimeMillis();
		System.out.println("Took " + (endT - startT) + " ms to geenrate primes upto " + limit);
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Is " + x + " a prime num = " + isPrime(x));
	}

	static void printPrimeNums(int n) {
		List<Integer> primeList = new ArrayList<Integer>();
		primeList.add(2);

		for (int i = 2; i <= n; i++) {
			if (i % 2 == 1 && isPrime(i)) {
				primeList.add(i);
			}
		}
		System.out.println("There are " + primeList.size() + " prime numbers till " + n);

		for (int i = 0; i < primeList.size(); i++)
			System.out.println(primeList.get(i));

	}

	static boolean isPrime(int n) {
		// Corner case
		if (n <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;

	}

	static void printOddNums(int n) {
		List<Integer> oddList = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				oddList.add(i);
			}
		}

		System.out.println(oddList.toString());

	}

	static void printEvenNums(int n) {
		List<Integer> evenList = new ArrayList<Integer>();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				evenList.add(i);
			}
		}

		System.out.println("  " + evenList.toString());

	}

}
