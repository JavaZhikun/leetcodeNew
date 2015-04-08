package dynamicProgramming;

//������������飬��������

/**����һ�������е�������������ѡ��
 * 1.����֮ǰ��subArray�����֮ǰ��subArray����ʹ���0��������Ϊ�Ժ���������й��׵ģ�ѡ����룩
 * 2.�Լ�����һ��subArray��֮ǰ��subArray�����С�ڵ���0���Ժ������û�й��ף����������ʼ����һ�����飩
 * 
 * @author Administrator
 *
 */

public class MaximumSubArray
{
	static int maxSubArray(int[] a,int n){
		int result = Integer.MIN_VALUE;
		int f = 0; //ÿһ��ǰi������������������еĺ�
		
		for(int i = 0; i< n; i++){
			f = max(f+a[i],a[i]);  //���ÿһ�ΰ���a[i]�����������֮��
			result = max(result,f);//�����������һ��a[i]����������е����ֵ����������������������
		}
		return result;
	}
	
	
	public static int maxSubArray2(int[] a, int n){
		int result = Integer.MIN_VALUE;
		int f = 0;
		for(int i = 0; i < n; i++){
			f = max(f+a[i], f);
			result = max(result,f);
		}
		return result;
	}
	
	static int  max(int a, int b){
		return a>b?a:b;
	}
	
	public static void main(String[] args)
	{
//		int[] a = {2,-4,7,5,9,0,7,-5,-6,8,9};
		int[] a = {-4,-4,-7,-3,-9,-30,-8,-5,-6,-8,-5};
		System.out.println(maxSubArray(a,a.length));
	}

}
