package dynamicProgramming;

//最大连续子数组，经典问题

/**对于一个数组中的整数，有两种选择：
 * 1.加入之前的subArray（如果之前的subArray总体和大于0，我们认为对后续结果是有贡献的，选择加入）
 * 2.自己另起一个subArray（之前的subArray总体和小于等于0，对后续结果没有贡献，从这个数开始另起一个数组）
 * 
 * @author Administrator
 *
 */

public class MaximumSubArray
{
	static int maxSubArray(int[] a,int n){
		int result = Integer.MIN_VALUE;
		int f = 0; //每一次前i个数的最大连续子序列的和
		
		for(int i = 0; i< n; i++){
			f = max(f+a[i],a[i]);  //求出每一次包含a[i]的最大子序列之和
			result = max(result,f);//求出包含任意一个a[i]的最大子序列的最大值，即整个数组的最大子序列
		}
		return result;
	}
	
	
	public static int maxSubArray2(int[] a, int n){
		int result = Integer.MIN_VALUE;
		int f = 0;
		for(int i = 0; i < n; i++){
			f = max(f+a[i], f);
			result = max(result,f);
		}
		return result;
	}
	
	static int  max(int a, int b){
		return a>b?a:b;
	}
	
	public static void main(String[] args)
	{
//		int[] a = {2,-4,7,5,9,0,7,-5,-6,8,9};
		int[] a = {-4,-4,-7,-3,-9,-30,-8,-5,-6,-8,-5};
		System.out.println(maxSubArray(a,a.length));
	}

}
