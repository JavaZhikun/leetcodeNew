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
			if(a[first]<a[mid]){//前半段已排序
				if(a[first]<=target && target<= a[mid])
				{//target在其中
					mid = last;
				}else
				{//target不在其中
					first = mid + 1;
				}
			}else{//不在前半段
				if(a[mid]<target && target<=a[last-1]){
					first = mid+1;
				}else{
					last = mid;
					
				}
			}
		}
		return -1;//未找到
	}
	
	public static void main(String[] args)
	{
		int[] array ={5,6,7,8,0,1,2,3,4};
//		System.out.println("请输入0-8之间的一个数字");
//		Scanner sc = new Scanner(System.in);
//		int input = sc.nextInt();
//		sc.close();
		System.out.println(search(array,array.length,1));
	}
}
