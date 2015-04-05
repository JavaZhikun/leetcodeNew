package array;

import java.util.Scanner;

public class SearchInRotatedSortedArray
{

	public static int search(int[] a, int n ,int target){
		
		int first = 0, last = n;
		while(first != last){
			 int mid = (first+last)/2;
			if(a[mid] == target){
				return mid;
			}
			if(a[first]<a[mid]){//ǰ���������
				if(a[first]<=target && target<= a[mid])
				{//target������
					mid = last;
				}else
				{//target��������
					first = mid + 1;
				}
			}else{//����ǰ���
				if(a[mid]<target && target<=a[last-1]){
					first = mid+1;
				}else{
					last = mid;
					
				}
			}
		}
		return -1;//δ�ҵ�
	}
	
	public static void main(String[] args)
	{
		int[] array ={5,6,7,8,0,1,2,3,4};
//		System.out.println("������0-8֮���һ������");
//		Scanner sc = new Scanner(System.in);
//		int input = sc.nextInt();
//		sc.close();
		System.out.println(search(array,array.length,1));
	}
}
