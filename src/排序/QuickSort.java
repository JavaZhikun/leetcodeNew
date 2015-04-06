package ����;

//���������Ż��㷨���ս��

//������O��N^2��      
//��������O��NlogN��      
//ƽ�������O��NlogN��
//�ȶ��ԣ����ȶ�
//�����ռ䣺 O(lonN)~O(N)

//�����Ż��Ŀ�����������õ������㷨���ر�������������Ƚϴ��ʱ��ʵ���������ڶ�����

public class QuickSort
{
	static int partition(int[] a,int low,int high){
		int key = a[low]; //����ֵ
		while(low < high){//�����ط���д=key�����Լӿ��ٶ�
			while(low < high && a[high]>=key)//�˴�����Ҫ>=������ֻд>,�ӿ��ٶ�
				high--;
			a[low] = a[high];//�����ҵ����һ��С��key��ֵ�滻��lowλ����
			while(low < high && a[low]<=key)//�˴�����Ҫ<=������ֻд>,�ӿ��ٶ�
				low++;
			a[high]=a[low];//�������ҵ�һ������key��ֵ�滻��highλ����
		}//�������whileѭ����low��high����ȣ������С��key���ұߴ���key
		
		a[low] = key;
		return low;
	}
	
	static void qSort(int[] a,int low,int high){
		 
		//β�ݹ���ص㣺�ݹ鷢���ں�������������������Ϊ��һЩ�������£��ᱻ�Ż�Ϊѭ������˲������ջ�����
		//(���û���Ż�Ϊѭ������Ȼ�����ջ���)
		
		//ֱ�����Ұ�����黮�ֳ����ֻ��һ��Ԫ��Ϊֹ���������ˣ�������ifŶ����if�Ļ����Ұ�������ֻ������һ�Ρ�  
		while(low < high){//���������ʱ����while��β�ݹ����
			int pivot = partition(a,low,high);
			qSort(a,low,pivot-1);
	    	low = pivot + 1;
		}
		
//		if(low < high){//������С��ʱ����if�ȽϺ�
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
