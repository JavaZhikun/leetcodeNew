package 排序;


//OK
//最好情况：O(n)    <-->    已排序
//最坏情况：O(n^2)  <-->    刚好全逆序排列
//平均情况：O(n^2)
//稳定性：稳定

public class InsertSort
{
	
	//思想：将每趟的关键字和它前面的所有数比较，并将其插入到第一个比他小的元素的后面
	
	static void insertSort(int[] a, int n){
		
		//将每趟的关键字和它前面的所有数比较，并将其插入到第一个比他小的元素的后面
		for(int i =1; i <n; i++){
			int key = a[i];//先缓存，防止数据被覆盖丢失
			
			//将每次比关键字大的元素右移一个位置
			int j = i-1;
			while(j>=0&&a[j]>key){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] =key;//将key放在第一个比他小的元素的后面
		}
	}
	
	static void display(int[] a ){
		for(int i = 0; i< a.length;i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] array ={1,2,5,55,3,6,89,978,2,5,7,8,4,8,3,7,4,6,9};
		insertSort(array,array.length);
		display(array);
	}
}
