package ϸ��ʵ����;

public class PalindromeNumber
{

	public static boolean isPalindrome(int x){
		if(x<0)
			return false;
		int d = 1;//����
		while(x/d >=10)
			d *=10;//���������x�����ĳ�����10��n�η���
		
		while(x != 0){
			int q = x/d;//x�ĵ�һλ
			int r = x%10;//x�����һλ
			if(q != r) return false;
			x = x%d /10;  //ȥ��ȥβ��x
			d /= 100; //d��ԭ���İٷ�֮һ
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		int x = -123454321;
		System.out.println(isPalindrome(x));
	}
}
