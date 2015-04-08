package 细节实现题;

//如果反转之后溢出，则返回0，以实现
//AC

public class ReverseInteger2
{
	public static int reverse(int x){
		boolean isNegtive = x >=0? false:true;
		x = Math.abs(x);
		int result = 0;
		while( x > 0){
			if(result > (Integer.MAX_VALUE - x%10)/10)
				return 0;
			result = result*10 + x%10;
			x /= 10;
		}
		return isNegtive? -result:result;
	}
	
	public static void main(String[] args)
	{
		int a = -2147483648;
		System.out.println(reverse(a));
	}

}
