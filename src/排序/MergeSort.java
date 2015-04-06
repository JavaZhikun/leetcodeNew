package 排序;

import java.util.Arrays;

//思想： 归并排序就是利用归并的思想实现的排序方法。
//他的原理是假设初始序列含有n个记录，则可以看成是n个有序的子序列，每个子序列的长度为1。
//然后两两归并，得到[n/2]([X]位不小于x的最小整数)个长度为2或者1的有序子序列，再两两归并
//……，如此重复，直至得到一个长度为n的有序序列为止，这种排序方法成为2路归并排序。

//对于非常在乎排序稳定性的应用来说，归并排序是个好算法

//最坏情况：O（NlogN）    
//最好情况：O（NlogN）            
//平均情况：O（NlogN）
//辅助空间：O（N）
//稳定性：稳定
public class MergeSort
{
	static void merge(int[] data, int left , int center, int right){
		//将SR中的记录归并进TR
		int[] tmpArr = new int[data.length];
		int mid =center+1,third=left,tmp = left;
		while(left<=center && mid<= right){
			//从两个数组中取出最小的放入中间数组
			tmpArr[third++] = data[left]<data[mid]?data[left++]:data[mid++];	
		}
		// 处理data[left,center]中剩余的元素放入中间数组
		while(left<=center){
			tmpArr[third++]=data[left++];
		}
		
		//处理data[mid，right]中剩余的元素放入中间数组
		while(mid<=right){
			tmpArr[third++]=data[mid++];
		}
		
		
		//将中间数组的内容复制回原数组
		while(tmp <= right){
			data[tmp] = tmpArr[tmp++];
		}
		
		//打桩语句
		System.out.println(Arrays.toString(data));
	}
	
	//将SR[s,t]归并序列为TR1[s,t]
	static void sort(int[] data,int left, int right){
		
		if(left<right){//此处必须为小于号，只有至少有两个元素的时候才存在合并（merge）
			int center = (left+right)/2;
			//左边数组进行递归
			sort(data,left,center);
            //对右边数组进行递归	
			sort(data,center+1,right);
			//合并
			merge(data,left,center,right);
			System.out.println("***");
		}
	}
	
	static void mergingSort(int[] a){
		sort(a,0,a.length-1);
		for(int i =0; i < a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	

	
	public static void main(String[] args)
	{
		int[] a ={16,7,13,10,9,15,3,2,5,8,12,1,11,4,6,14};
		mergingSort(a);
		
		
	}

}
