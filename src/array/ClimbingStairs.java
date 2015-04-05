package array;

//爬n层楼梯，花费n步到达顶端
//每一步可以跨越1步或者两步，有多少方法可以到达顶端

public class ClimbingStairs
{
	//设到达n层的方法述为f（n），
	//1.从n-1层怕一步，2.从n-2层爬两部
	//则他的方法数等于f(n-1)+f(n-2)
	
	//使用迭代法求f(n)
	public static int floor(int n){
		if(n==0 || n ==1)
			return 1;
		
		int floorNMinusTwo = 1;
		int floorNMinusOne = 1;
		int floorN = 0;
		
		for(int i = 2; i <= n; i++){
		    floorN = floorNMinusOne + floorNMinusTwo;
			floorNMinusTwo = floorNMinusOne;
			floorNMinusOne = floorN;
		}
		
		return floorN;
	}
	
	public static void main(String[] args)
	{
		for(int i =0; i< 5;i++){
		System.out.println(floor(i)+" ");
		}
	}

}
