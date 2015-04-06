package 排序;

//将两个已经排好序的数组合并成为一个数组

public class MergeSortedArray
{
	public static void merge(int[] A,int m, int[] B,int n,int[]  C){
		//从后往前进行合并
		int ia = m-1,ib = n-1, icur = m + n -1;
		while(ia >= 0 &&ib >=0)
		{//每一次将A,B中交大的数赋给A，然后ia或者ib向前移动一位
			A[icur--] = (A[ia]>B[ib] ? A[ia--]:B[ib--]); 
		}
		while(ib >= 0){//如果B中还有剩余的，则将其赋值给A
			A[icur--] = B[ib--];
		}
	}
	
	
}
