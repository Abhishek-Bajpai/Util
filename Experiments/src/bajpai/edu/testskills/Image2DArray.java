package bajpai.edu.testskills;

import java.util.ArrayList;

public class Image2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[][] imageArray = {
				 				{2,17,29,1}, 
				 				{1,4,2,3}, 
				 				{8,5,3,5},
				 				{4,57,94,2}
				 			};
		 int numRows = imageArray.length;
		 int numCols = imageArray[0].length;
		 int[][] result = new int[numRows][numCols];
		 

		 for(int i=0;i<numRows/2;i++) {
			 for(int j=0;j<numCols/2;j++) {
				 result[i][j] = imageArray[i][numCols-j-1];
				 result[i][numCols-j-1] = imageArray[numRows-i-1][j];
				// result[numRows-i-1][numCols-j-1] = imageArray[numRows-i-1][j];
				// result[numRows-i-1][j] = imageArray[i][j];
			 }
		 }
		 System.out.println(result.toString());
		
		
		
		

		
	}

}
