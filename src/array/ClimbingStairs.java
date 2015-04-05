package array;

//��n��¥�ݣ�����n�����ﶥ��
//ÿһ�����Կ�Խ1�������������ж��ٷ������Ե��ﶥ��

public class ClimbingStairs
{
	//�赽��n��ķ�����Ϊf��n����
	//1.��n-1����һ����2.��n-2��������
	//�����ķ���������f(n-1)+f(n-2)
	
	//ʹ�õ�������f(n)
	public static int floor(int n){
		if(n==0 || n ==1)
			return 1;
		
		int floorNMinusTwo = 1;
		int floorNMinusOne = 1;
		int floorN = 0;
		
		for(int i = 2; i <= n; i++){
		    floorN = floorNMinusOne + floorNMinusTwo;
			floorNMinusTwo = floorNMinusOne;
			floorNMinusOne = floorN;
		}
		
		return floorN;
	}
	
	public static void main(String[] args)
	{
		for(int i =0; i< 5;i++){
		System.out.println(floor(i)+" ");
		}
	}

}
