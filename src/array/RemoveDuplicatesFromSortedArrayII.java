package array;

public class RemoveDuplicatesFromSortedArrayII
{
	public static int removeDuplicates(int[] a, int n){
		if(n <=2)
			return n;
		int index = 2;
		
		//ÿ�ν�a[i]�ͱ�־λǰ����������Ƚϣ������ȣ�i����ǰ��
		//������ȣ��ͽ�������ֵ����־λ���ڵĵ�����Ȼ���־λǰ��1
		for(int i = 2; i < n; i++){
			if(a[i] !=a[index - 2])
				a[index++] = a[i];
		}
		
		return index;
	}
	
	public static void main(String[] args)
	{
		int[]  a ={1,1,1,2,2,2,3};
		System.out.println(removeDuplicates(a,a.length));
		float aa = 1234567.8910f;
		System.out.println(aa);
	}
}
