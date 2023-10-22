package processing;

public class PermutationTable2 {
	public static int[][] getPc2() {
		int[][]nums=SplitAndAddWithCircularShift.splitAndAdd();
		int pc_2[][]=new int [6][8];
		pc_2[0][0]=nums[1][6];pc_2[0][1]=nums[2][2];pc_2[0][2]=nums[1][3];pc_2[0][3]=nums[3][2];pc_2[0][4]=nums[0][0];pc_2[0][5]=nums[0][4];pc_2[0][6]=nums[0][2];pc_2[0][7]=nums[3][6];
		pc_2[1][0]=nums[2][0];pc_2[1][1]=nums[0][5];pc_2[1][2]=nums[2][6];pc_2[1][3]=nums[1][2];pc_2[1][4]=nums[3][1];pc_2[1][5]=nums[2][4];pc_2[1][6]=nums[1][4];pc_2[1][7]=nums[0][3];
		pc_2[2][0]=nums[3][4];pc_2[2][1]=nums[1][0];pc_2[2][2]=nums[2][1];pc_2[2][3]=nums[0][6];pc_2[2][4]=nums[3][5];pc_2[2][5]=nums[2][5];pc_2[2][6]=nums[1][5];pc_2[2][7]=nums[0][1];
		pc_2[3][0]=nums[5][5];pc_2[3][1]=nums[7][2];pc_2[3][2]=nums[4][2];pc_2[3][3]=nums[5][1];pc_2[3][4]=nums[6][4];pc_2[3][5]=nums[7][5];pc_2[3][6]=nums[4][1];pc_2[3][7]=nums[5][4];
		pc_2[4][0]=nums[7][1];pc_2[4][1]=nums[6][2];pc_2[4][2]=nums[4][4];pc_2[4][3]=nums[6][5];pc_2[4][4]=nums[6][1];pc_2[4][5]=nums[6][6];pc_2[4][6]=nums[5][3];pc_2[4][7]=nums[7][6];
		pc_2[5][0]=nums[4][5];pc_2[5][1]=nums[7][3];pc_2[5][2]=nums[6][3];pc_2[5][3]=nums[5][6];pc_2[5][4]=nums[7][0];pc_2[5][5]=nums[5][0];pc_2[5][6]=nums[4][0];pc_2[5][7]=nums[4][3];
		return pc_2;
	}
	public static String getSecretKey() {
		int[][]arr=getPc2();
		StringBuilder st=new StringBuilder();
		for(int[]temp:arr) {
			StringBuilder tempSt=new StringBuilder();			
			for(int a:temp) {
				tempSt.append(a);
			}
			int decimal=Integer.parseInt(tempSt.toString(),2);
			st.append((char)decimal);
		}
		return st.toString();
	}
}
