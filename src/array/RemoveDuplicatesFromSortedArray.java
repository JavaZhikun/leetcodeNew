package array;

import java.util.Arrays;

//时间复杂度为O（n），空间复杂度为O（1）

public class RemoveDuplicatesFromSortedArray
{
	public static int removeDuplicates(int[] a, int n){
		if(a == null||a.length==0)
			return 0;
		int index = 0;
		for(int i =1; i < n;i++)
		{//出现数组中后面的数和前面不相同的时候，将下标加1，将该数移到新的下标的地方
			if(a[index] != a[i])
				a[++index] = a[i];
		}
		return index + 1;
	}
	
	public static void main(String[] args)
	{
		int[] a = {1,2,2,2,3,3,4,4,5};
	    int newLength =removeDuplicates(a,a.length);
        System.out.println(newLength);
       
	}
	

}
