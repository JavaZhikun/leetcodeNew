package 排序;

//OK
//最好情况：O(n^2)
//最坏情况：O(n^2)
//平均情况：O(n^2)
//稳定性：稳定

public class SelectSort
{
	static void selectSort(int[] a,int n){
		//选出每一趟的最小值
		for(int i = 0; i < n; i++){
			int min = i;  //将每一趟的第一个数设为最小值的位置
			for(int j = i+1; j < n; j++){
				if(a[min] > a[j])
					min = j;//记录最小的数的位置
			}
				//将每次的最小值与a[i]对调，确保a[i]为最小值
				if(min != i){
					int temp = a[min];
					a[min] = a[i];
					a[i] = temp;
				}
		}
	}
	
	static void display(int[] a ){
		for(int i = 0; i< a.length;i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] array ={1,2,5,55,3,6,2,5,7,8,4,8,3,7,4,6,9};
		selectSort(array,array.length);
		display(array);
	}

}
