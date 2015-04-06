package ����;

//OK,������
//������O��NlogN��      
//��������O��NlogN��            
//ƽ�������O��NlogN��
//�ȶ��ԣ����ȶ�
//�����ռ䣺O(1)




public class HeapSort
{
		public static  void maxHeapify(int[] a , int i, int length)
		{
			int left, right, largest;
			left = 2*i +1;
			right = 2*i +2;
			
			//Ѱ�ҳ�һ�����������ֵ���������붥�㽻��
			if(left <length  && a[left] >a[i])
				largest = left;
			else 
				largest = i;
			
			if(right <length &&a[right] >a[largest])
			largest = right;
			
			if(i  != largest)
			{
				int temp = a[largest];
				a[largest] =a [i];
				a[i] =temp;
				maxHeapify(a, largest,length);
			}
		}
		
		public static  void buildHeap(int[] a)
		{
			//�˴�ʹ��length/2-1�ͣ�length-1��/2���ɣ��������߿��ܶ�һ�β���Ҫ������
			for(int i = a.length/2-1 ; i>=0; i--)
			{
				maxHeapify(a, i, a.length);
			}
		}
		
		public static void heapSort(int[] a,int length )
		{
			buildHeap(a);
			for(int i =a.length -1; i>=1; i--)
			{
				//������Ԫ�ؽ����������һ��
				int temp = a[0];
				a[0]= a[i];
				a[i ] = temp;
				
				//��С�ѵ���������ȥ�����һ��Ԫ�صĶ����½��ɴ󶥶�
				//�˴���i��������ĳ��ȣ���˽���һ������֮������ĳ��ȼ���1�����պ�i��ֵΪlength-1���ʲ��øı�
				//������maxHeapify(a,0,i-1) �ʹ��ˣ���ʱa[i-1]û�����ȥ����Ϊleft��rightҪС��length.��i-1�պõ���length
				//���ܵ���right����������������
				maxHeapify(a, 0,i);
				
			}
		}
		
		public static void display(int[] a)
		{
			for(int i =0; i< a.length; i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	

		public static void main(String[] args)
		{
			int[] a ={16,7,13,10,9,8,15,3,1,2,5,8,12,1,11,4,6,14,25,36,58,26,24,29,27,31,3,
					34,38,39,35,37,31,36,32,16,7,13,};
			heapSort(a, a.length);
			display(a);
		}
} 

