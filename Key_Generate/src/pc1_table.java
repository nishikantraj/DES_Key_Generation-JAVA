public class pc1_table {
	public static int[][] pc(int[][]nums){
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
	
	//Display Array
//	public static void display(int[][]nums) {
//		for(int i=0;i<nums.length;i++) {
//			System.out.println(Arrays.toString(nums[i]));
//		}
//	}

	public static int[][] main(String[] args) {
		// TODO Auto-generated method stub
		final String key=generateKey.menu_driven();
		System.out.println("Key: "+key);
		//Convert to Binary
		String[] binar_arr=new String[8];
		for(int i=0;i<8;i++)
			binar_arr[i]=Integer.toBinaryString(key.charAt(i));
//		System.out.println(Arrays.toString(binar_arr));
		
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
		//Store Pc1 by calling function pc
		int[][]pc1=pc(initial_2d);
		return pc1;
		//Display both 2d Array initial and pc1
//		display(initial_2d);
//		System.out.println("-----------------------\n");
//		display(pc1);
	}
}
