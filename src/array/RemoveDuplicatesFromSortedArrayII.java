package array;

public class RemoveDuplicatesFromSortedArrayII
{
	public static int removeDuplicates(int[] a, int n){
		if(n <=2)
			return n;
		int index = 2;
		
		//每次将a[i]和标志位前面的两个数比较，如果相等，i继续前进
		//如果不等，就将该数赋值给标志位所在的的数，然后标志位前进1
		for(int i = 2; i < n; i++){
			if(a[i] !=a[index - 2])
				a[index++] = a[i];
		}
		
		return index;
	}
	
	public static void main(String[] args)
	{
		int[]  a ={1,1,1,2,2,2,3};
		System.out.println(removeDuplicates(a,a.length));
		float aa = 1234567.8910f;
		System.out.println(aa);
	}
}
