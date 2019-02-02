/**
 * 
 */
package bajpai.edu.testskills;

import java.util.Arrays;

/**
 * @author bajab01
 *
 * Mean of an array = (sum of all elements) / (number of elements)
 * 
 * Median of a sorted array of size n is defined 
 * as below : 
 * 
 * Median is middle element when n is odd and 
 * Median is average of middle two elements when n is even.
 * 
 * Since the array is not sorted here, we sort 
 * the array first, then apply above formula.
 
 */
public class MeanMedianCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 4, 2, 7, 5, 8, 6 }; 
        int n = a.length; 
        System.out.println("Mean = " + findMean(a, n));  
        System.out.println("Median = " + findMedian(a, n)); 
	}

	 // Function for calculating mean 
    public static double findMean(int a[], int n) 
    { 
        int sum = 0; 
        for (int i = 0; i < n; i++)  
            sum += a[i]; 
      
        return (double)sum / (double)n; 
    } 
  
    // Function for calculating median 
    public static double findMedian(int a[], int n) 
    { 
        // First we sort the array 
        Arrays.sort(a); 
  
        // check for even case 
        if (n % 2 != 0) 
        return (double)a[n / 2]; 
      
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0; 
    } 
}
