package 细节实现题;

public class ReverseInteger
{
	public static  long reverse(int x){
		long r = 0;
		while(x!=0){
			r = r*10 +x%10;
			x /= 10;
		}
		return r;
	}

	public static void main(String[] args)
	{
		int a = -1000000003;
		System.out.println(reverse(a));
		System.out.println(Integer.MAX_VALUE);
	}

}
