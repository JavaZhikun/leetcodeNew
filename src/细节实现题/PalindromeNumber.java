package 细节实现题;

public class PalindromeNumber
{

	public static boolean isPalindrome(int x){
		if(x<0)
			return false;
		int d = 1;//除数
		while(x/d >=10)
			d *=10;//算出不大于x的最大的除数（10的n次方）
		
		while(x != 0){
			int q = x/d;//x的第一位
			int r = x%10;//x的最后一位
			if(q != r) return false;
			x = x%d /10;  //去首去尾的x
			d /= 100; //d是原来的百分之一
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		int x = -123454321;
		System.out.println(isPalindrome(x));
	}
}
