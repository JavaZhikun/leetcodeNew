package array;

//��һ�������һ��ֵ���Ƴ����к͸�ֵ��ȵ�Ԫ�ز����س���

public class RemoveElement
{
	static int removeElement(int[] a ,int n, int value){
		
		int index = 0;
		
		//��־�±�index��a[i]��valueֵ��ͬ��ʱ�������ı䣬���ȵ�ʱ��a[i]��ֵ��ֵ����־λ���ڵ�Ԫ�أ�Ȼ���־λ��1
		for(int i = 0; i < n; i++){
			if(a[i]!=value)
				a[index++] = a[i];
		}
		return index;
	}
	
	public static void main(String[] args)
	{
		int[] a ={1,1,2,2,1,2,1,3,4,5};
	    int	length = removeElement(a,a.length,1);
	    System.out.println(length);
	}

}
