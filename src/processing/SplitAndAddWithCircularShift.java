package processing;
public class SplitAndAddWithCircularShift {
	public static int[][] splitAndAdd(){
		int[][]arr=PermutationTable1.pc1();
		int[][]c1=new int [arr.length/2][arr[0].length];
		int[][]c2=new int [arr.length/2][arr[0].length];
		//Initialization of c0 and c1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<arr[0].length;j++) {
				c1[i][j]=arr[i][j];
				c2[i][j]=arr[i+4][j];
			}
		}
		left_shift(c1);
		left_shift(c2);
		
		//Adding both split matrix
		
		int [][]pc2=new int[2*c1.length][c1[0].length];
		for(int i=0;i<c1.length;i++) {
			for(int j=0;j<c1[0].length;j++) {
				pc2[i][j]=c1[i][j];
				pc2[i+4][j]=c2[i][j];
			}
		}
		return pc2;
	}
	
	public static  void left_shift(int nums[][]) {
		int temp1,temp2=nums[0][0];
		for(int i=nums.length-1;i>=0;i--) {
			for(int j=nums[i].length-1;j>=0;j--) {
				temp1=nums[i][j];
				nums[i][j]=temp2;
				temp2=temp1;
			}
		}
	}
	
}
