package ���η�;

//��x��n����
//���ַ�
//x^n = x^(n/2)*x^(n/2)*x^(n%2)
//ʱ�临�Ӷȣ�O��logN��  �ռ临�Ӷȣ�O��1��

public class Pow
{
	public static double pow(double x, int n){
		if(x<0.000001 &&x>-0.000001)
			return 0.0;
		if(n<0)
			return 1.0/power(x,-n);
		return power(x,n);
	}
	
	private static double power(double x, int n){
		if(n == 0)
			return 1;
		double v = power(x,n/2);
		if(n%2 == 0)
			return v*v;
		else
			return v*v*x;
	}
	
	public static void main(String[] args)
	{
		double a = 3.0;
		int b = -2;
		System.out.println(pow(a,b));
	}

}
