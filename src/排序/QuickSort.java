package 排序;

//快速排序优化算法，终结版

//最坏情况：O（N^2）      
//最好情况：O（NlogN）      
//平均情况：O（NlogN）
//稳定性：不稳定
//辅助空间： O(lonN)~O(N)

//经过优化的快速排序是最好的排序算法，特别是针对数据量比较大的时候，实际性能优于堆排序。

public class QuickSort
{
	static int partition(int[] a,int low,int high){
		int key = a[low]; //中枢值
		while(low < high){//两个地方都写=key，可以加快速度
			while(low < high && a[high]>=key)//此处必须要>=，不能只写>,加快速度
				high--;
			a[low] = a[high];//将从右到左第一个小于key的值替换到low位置上
			while(low < high && a[low]<=key)//此处必须要<=，不能只写>,加快速度
				low++;
			a[high]=a[low];//将从左到右第一个大于key的值替换到high位置上
		}//经过这个while循环，low和high必相等，且左边小于key，右边大于key
		
		a[low] = key;
		return low;
	}
	
	static void qSort(int[] a,int low,int high){
		 
		//尾递归的特点：递归发生在函数体所有运算的最后。因为在一些编译器下，会被优化为循环，因此不会造成栈溢出。
		//(如果没被优化为循环，依然会造成栈溢出)
		
		//直到把右半边数组划分成最多只有一个元素为止，就排完了！不能用if哦，用if的话，右半边数组就只被划分一次。  
		while(low < high){//数据量大的时候用while加尾递归更好
			int pivot = partition(a,low,high);
			qSort(a,low,pivot-1);
	    	low = pivot + 1;
		}
		
//		if(low < high){//数据量小的时候用if比较好
//			int pivot = partition(a,low,high);
//			qSort(a,low,pivot-1);
//			qSort(a,pivot+1,high);
//		}
		
		
	}
	
	public static void show(int[] a){
		for(int i =0; i < a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		int[] a ={16,7,13,10,9,8,15,3,1,2,5,8,12,1,11,4,6,14,25,36,58,26,24,29,27,31,3,
				34,38,39,35,37,31,36,32,16,7,13,};
	    long start = System.currentTimeMillis();
		qSort(a,0,a.length-1);
		show(a);
		System.out.println();
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
