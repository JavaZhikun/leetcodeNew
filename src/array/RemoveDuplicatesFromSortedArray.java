package array;

import java.util.Arrays;

//ʱ�临�Ӷ�ΪO��n�����ռ临�Ӷ�ΪO��1��

public class RemoveDuplicatesFromSortedArray
{
	public static int removeDuplicates(int[] a, int n){
		if(a == null||a.length==0)
			return 0;
		int index = 0;
		for(int i =1; i < n;i++)
		{//���������к��������ǰ�治��ͬ��ʱ�򣬽��±��1���������Ƶ��µ��±�ĵط�
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
