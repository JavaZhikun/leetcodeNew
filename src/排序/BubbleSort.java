package 排序;
/**
 * 稳定性：假设Ki=Kj(1<=i<=n,1<=j<=n)且在排序前的序列中，Ri领先于Rj（即i小于j）。
 * 如果排序后中Ri仍然领先于Rj，则称所用的排序方法是稳定的。反之，称为不稳定的。
 * 
 * */



//OK,最优的bubbleSort 
//最坏情况：O（n^2）      <--> 刚好全逆序排列  
//最好情况：O（n）            <--> 刚好顺序排列
//平均情况：O（n^2）
//稳定性：稳定

public class BubbleSort
{
	public static void bubbleSort(int[] a,int n){
		boolean flag = true;//标志位
		for(int i = 0; i < n-1&&flag ==true;i++ ){//n-1趟,因为第n趟已经自动排好像序，故省略
			flag = false;
			for(int j =0 ; j <n-1-i; j++){//每一趟有n-1-i次比较
				if(a[j] > a[j+1])
				{//大数沉底
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
					flag =true;//有数字交换，将其置为true.若某一趟全部没有交换，代表已经排好序，则为false
				}
			}
		}
	}
	
	public static void show(int[] a){
		for(int i =0; i < a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] a ={7,4,5,2,6,3,1,5,7,8,3,5,8,5,9,0};
		bubbleSort(a,a.length);
		show(a);
		
	}

}
