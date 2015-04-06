package ����;

//OK
//��������O(n^2)
//������O(n^2)
//ƽ�������O(n^2)
//�ȶ��ԣ��ȶ�

public class SelectSort
{
	static void selectSort(int[] a,int n){
		//ѡ��ÿһ�˵���Сֵ
		for(int i = 0; i < n; i++){
			int min = i;  //��ÿһ�˵ĵ�һ������Ϊ��Сֵ��λ��
			for(int j = i+1; j < n; j++){
				if(a[min] > a[j])
					min = j;//��¼��С������λ��
			}
				//��ÿ�ε���Сֵ��a[i]�Ե���ȷ��a[i]Ϊ��Сֵ
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
