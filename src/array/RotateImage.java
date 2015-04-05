package array;

//将一个n*n的矩阵
//顺时针旋转90度

public class RotateImage
{
	public static void rotate(int[][] a,int n){
		//沿着副对角线翻转
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n - i; j++){
				//将对角线对称的两元素互换,注意此处是n-i，在副对角线上方的元素
				//将元素a[i][j]和元素a[n-1-j][n-1-i]互换，两者关于x = y对称
				
				int temp = a[i][j];
				a[i][j] = a[n-1-j][n-1-i];
				a[n-1-j][n-1-i] = temp;
				
			}
		}
		
//		//沿着水平中线翻转(行之和为n-1，列保持不变)
		for(int i = 0 ; i < n/2;i++){
			for(int j = 0; j < n ; j++)
			{//java中最好不要写swap函数，直接将其内容写出来，因为java是浅复制
				int temp = a[i][j];
				a[i][j] = a[n -1 -i][j];
				a[n - 1 -i][j] = temp;
			}
		}
		
		
	}
	
	//方法二：
	//先沿着水平中线翻转一次，然后沿着正对角线翻转
	public static void rotate2(int[][] a, int n){
		//沿着水平中线翻转
		 for(int i =0 ; i < n/2;i++){
			 for(int j =0; j < n; j++){
			      //将元素a[i][j]和元素a[n-1-i][j]对调
				 int temp = a[i][j];
				 a[i][j] =  a[n-1-i][j];
				 a[n-1-i][j] = temp;
			 }
		 }
		 
		//沿着正对角线翻转
			for(int i = 0; i < n; i++){
				for(int j = i; j < n; j++){
					//在正对角线上方,将元素a[i][j]和元素a[j][i]互换
					int temp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = temp;
					
					
				}
			}
	}
	
	
	public static void main(String[] args)
	{
		int[][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		rotate(matrix,matrix.length);
		rotate2(matrix,matrix.length);
		for(int i = 0; i < matrix.length;i++)
		{
			for(int j = 0; j < matrix.length; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
