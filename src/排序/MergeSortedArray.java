package ����;

//�������Ѿ��ź��������ϲ���Ϊһ������

public class MergeSortedArray
{
	public static void merge(int[] A,int m, int[] B,int n,int[]  C){
		//�Ӻ���ǰ���кϲ�
		int ia = m-1,ib = n-1, icur = m + n -1;
		while(ia >= 0 &&ib >=0)
		{//ÿһ�ν�A,B�н����������A��Ȼ��ia����ib��ǰ�ƶ�һλ
			A[icur--] = (A[ia]>B[ib] ? A[ia--]:B[ib--]); 
		}
		while(ib >= 0){//���B�л���ʣ��ģ����丳ֵ��A
			A[icur--] = B[ib--];
		}
	}
	
	
}
