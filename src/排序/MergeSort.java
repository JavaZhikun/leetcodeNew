package ����;

import java.util.Arrays;

//˼�룺 �鲢����������ù鲢��˼��ʵ�ֵ����򷽷���
//����ԭ���Ǽ����ʼ���к���n����¼������Կ�����n������������У�ÿ�������еĳ���Ϊ1��
//Ȼ�������鲢���õ�[n/2]([X]λ��С��x����С����)������Ϊ2����1�����������У��������鲢
//����������ظ���ֱ���õ�һ������Ϊn����������Ϊֹ���������򷽷���Ϊ2·�鲢����

//���ڷǳ��ں������ȶ��Ե�Ӧ����˵���鲢�����Ǹ����㷨

//������O��NlogN��    
//��������O��NlogN��            
//ƽ�������O��NlogN��
//�����ռ䣺O��N��
//�ȶ��ԣ��ȶ�
public class MergeSort
{
	static void merge(int[] data, int left , int center, int right){
		//��SR�еļ�¼�鲢��TR
		int[] tmpArr = new int[data.length];
		int mid =center+1,third=left,tmp = left;
		while(left<=center && mid<= right){
			//������������ȡ����С�ķ����м�����
			tmpArr[third++] = data[left]<data[mid]?data[left++]:data[mid++];	
		}
		// ����data[left,center]��ʣ���Ԫ�ط����м�����
		while(left<=center){
			tmpArr[third++]=data[left++];
		}
		
		//����data[mid��right]��ʣ���Ԫ�ط����м�����
		while(mid<=right){
			tmpArr[third++]=data[mid++];
		}
		
		
		//���м���������ݸ��ƻ�ԭ����
		while(tmp <= right){
			data[tmp] = tmpArr[tmp++];
		}
		
		//��׮���
		System.out.println(Arrays.toString(data));
	}
	
	//��SR[s,t]�鲢����ΪTR1[s,t]
	static void sort(int[] data,int left, int right){
		
		if(left<right){//�˴�����ΪС�ںţ�ֻ������������Ԫ�ص�ʱ��Ŵ��ںϲ���merge��
			int center = (left+right)/2;
			//���������еݹ�
			sort(data,left,center);
            //���ұ�������еݹ�	
			sort(data,center+1,right);
			//�ϲ�
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
