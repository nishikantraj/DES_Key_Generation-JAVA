import java.util.Arrays;

public class circular_rotation {
	public static  int[][] left_shift(int nums[][]) {
		int temp1,temp2=nums[0][0];
		for(int i=nums.length-1;i>=0;i--) {
			for(int j=nums[i].length-1;j>=0;j--) {
				temp1=nums[i][j];
				nums[i][j]=temp2;
				temp2=temp1;
			}
		}
		return nums;
	}

	public static void main(String[] args) {
		pc1_table r=new pc1_table();
		@SuppressWarnings({ "unused", "static-access" })
		int[][]arr=r.main(args);
		//Dividing key into two parts c0 and c1
		int[][]c0=new int [arr.length/2][arr[0].length];
		int[][]c1=new int [arr.length/2][arr[0].length];
		//Initialization of c0 and c1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<arr[0].length;j++) {
				c0[i][j]=arr[i][j];
				c1[i][j]=arr[i+4][j];
			}
		}
		display(left_shift(c0));
		System.out.println("-----------------------");
		display(left_shift(c1));
		System.out.println("-----------------------");
		int[][]pc_table2=pc2_table.getPc2(pc2_table.pc2_initial(c0,c1));
		display(pc_table2);
		System.out.println("-----------------------\n");
		System.out.println("Final Key after 3 rounds of different processes: "+getSecretKey(pc_table2));
	}
	
	public static void display(int[][]nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.println(Arrays.toString(nums[i]));
		}
	}
	public static String getSecretKey(int[][]arr) {
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
