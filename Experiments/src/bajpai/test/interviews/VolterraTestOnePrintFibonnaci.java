package bajpai.test.interviews;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class VolterraTestOnePrintFibonnaci
{
  public static void main (String[] args) throws java.lang.Exception
  {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String input = br.readLine();
	    Integer myInt = Integer.parseInt(input);
	    System.out.println(myInt);

  }
  
  
static void printMyFibonacci(Integer myInt) {
   Integer x = 1,y=0, n;
    while(x<myInt){
      System.out.print(y);
      n = x;
      x= y;
      y=x+y;
    }

}
  static void printFibonacciNumbers(int n) 
  { 
      int f1 = 0, f2 = 1, i; 
    
      if (n < 1) 
          return; 
    
      for (i = 1; i <= n; i++) 
      { 
          System.out.print(f2+" "); 
          int next = f1 + f2; 
          f1 = f2; 
          f2 = next; 
      } 
  } 
}


