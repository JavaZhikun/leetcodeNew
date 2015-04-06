package ����;


//OK
//��������O(n)    <-->    ������
//������O(n^2)  <-->    �պ�ȫ��������
//ƽ�������O(n^2)
//�ȶ��ԣ��ȶ�

public class InsertSort
{
	
	//˼�룺��ÿ�˵Ĺؼ��ֺ���ǰ����������Ƚϣ���������뵽��һ������С��Ԫ�صĺ���
	
	static void insertSort(int[] a, int n){
		
		//��ÿ�˵Ĺؼ��ֺ���ǰ����������Ƚϣ���������뵽��һ������С��Ԫ�صĺ���
		for(int i =1; i <n; i++){
			int key = a[i];//�Ȼ��棬��ֹ���ݱ����Ƕ�ʧ
			
			//��ÿ�αȹؼ��ִ��Ԫ������һ��λ��
			int j = i-1;
			while(j>=0&&a[j]>key){
				a[j+1] = a[j];
				j--;
			}
			a[j+1] =key;//��key���ڵ�һ������С��Ԫ�صĺ���
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
