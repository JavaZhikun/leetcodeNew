package dynamicProgramming;

//找出三角形从顶到底的最短路径

//**设状态转移方程为f(i,j),表示从位置（i，j）出发，最小路径和
//则状态转移方程为f(i,j) =min{f(i+1,j),f(i+1,j+1)}+(i,j)
public class Triangle
{
	public static int minTotal(int[][] triangle){
		for(int i = triangle.length -2; i >=0; i--)
			for(int j = 0; j < i+1; j++)
				triangle[i][j] += min(triangle[i+1][j],triangle[i+1][j+1]);
		return triangle[0][0];
	}

	public static int min(int a, int b){
		return a<b?a:b;
	}
	
	public static void main(String[] args)
	{
		int[][] a = {{2},
				    {3,4},
				   {6,5,7},
				  {4,1,8,3}};
		
		System.out.println(minTotal(a));
	}
}
