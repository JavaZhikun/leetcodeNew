package ���η�;

public class Sqrt
{
	public static  int sqrt(int x){
		int left = 1, right = x/2;
		int last_mid = 0;
		
		if(x < 2)
			return x;
		while(left <= right){
			int mid = left + (right - left)/2;
			if(x/mid > mid){//��Ҫ��x>mid*mid  ,���ܻ��������x�Ƚϴ�ʱ
				left =mid +1;//���Ҽб�
				last_mid = mid;
			}else if(x/mid < mid){
				right = mid - 1;//����б�
			}else{
				return mid;
			}
		}
		return last_mid;
	}
	
	public static void main(String[] args)
	{
		int x = 399;
		System.out.println(sqrt(x));
	}

}
