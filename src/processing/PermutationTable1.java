package processing;
import generation.*;
public class PermutationTable1 extends Key_Generation{
	
	public static int[][] initialTable() {
		final String key=getKey();
		System.out.println("Generated key: "+key);
		String[] binar_arr=new String[8];
		for(int i=0;i<8;i++)
			binar_arr[i]=Integer.toBinaryString(key.charAt(i));
		
		//Initial Table filling
		int[][]initial_2d=new int[8][8];
		for(int i=0;i<8;i++) {
			String temp=binar_arr[i];
			int j=temp.length()-1;
			int k=7;
			while(j>=0) {
				int num=Character.getNumericValue(temp.charAt(j--));;
				initial_2d[i][k--]=num;
			}
		}
		return initial_2d;
	}
	
	public static int[][] pc1(){
		int[][]nums=initialTable();
		//PC1 Table Created
		int[][]pc1=new int[8][7];
		int end_row=nums.length-1;
		int start_col=0;
		int i;
		
		//Filling first half of pc1 table
		for(i=0;i<4;i++) {
			for(int j=0;j<7;j++) {
				if(end_row==-1) {
					end_row=nums.length-1;
					start_col++;
				}
				pc1[i][j]=nums[end_row--][start_col];
			}
		}
		//Filling Second half of pc1 table except last row
		end_row=nums.length-1;
		start_col=nums.length-2;
		for(int j=i;j<7;j++) {
			for(int k=0;k<7;k++) {
				if(end_row==-1) {
					end_row=nums.length-1;
					start_col--;
				}
				pc1[j][k]=nums[end_row--][start_col];
			}
		}
		//For filling last row
		for(int k=0;k<7;k++) {
			if(end_row==-1) {
				end_row=3;
				start_col--;
			}
			pc1[7][k]=nums[end_row--][start_col];
		}
		//return pc1 table
		return pc1;
	}
}
