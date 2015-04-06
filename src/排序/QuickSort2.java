package 排序;


//此方法不再使用，容易出错，而且时间比QuickSort长
public class QuickSort2
{
	static int partition(int[] a,int left,int right){
		int key = a[right];//中枢值
		int store = left;//中枢值的存放位置
		for(int i = left; i < right -1;i++){
			if(a[i] <key){
				int temp = a[i];
				a[i] = a[store];
				a[store] = temp;
			}
			store++;
		}
		
		//交换a[store]和key
		int temp = a[store];
		a[store] = key;
		key = temp;
		
		return store;
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
