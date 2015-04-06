package ����;


//�˷�������ʹ�ã����׳�������ʱ���QuickSort��
public class QuickSort2
{
	static int partition(int[] a,int left,int right){
		int key = a[right];//����ֵ
		int store = left;//����ֵ�Ĵ��λ��
		for(int i = left; i < right -1;i++){
			if(a[i] <key){
				int temp = a[i];
				a[i] = a[store];
				a[store] = temp;
			}
			store++;
		}
		
		//����a[store]��key
		int temp = a[store];
		a[store] = key;
		key = temp;
		
		return store;
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
