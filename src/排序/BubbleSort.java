package ����;
/**
 * �ȶ��ԣ�����Ki=Kj(1<=i<=n,1<=j<=n)��������ǰ�������У�Ri������Rj����iС��j����
 * ����������Ri��Ȼ������Rj��������õ����򷽷����ȶ��ġ���֮����Ϊ���ȶ��ġ�
 * 
 * */



//OK,���ŵ�bubbleSort 
//������O��n^2��      <--> �պ�ȫ��������  
//��������O��n��            <--> �պ�˳������
//ƽ�������O��n^2��
//�ȶ��ԣ��ȶ�

public class BubbleSort
{
	public static void bubbleSort(int[] a,int n){
		boolean flag = true;//��־λ
		for(int i = 0; i < n-1&&flag ==true;i++ ){//n-1��,��Ϊ��n���Ѿ��Զ��ź����򣬹�ʡ��
			flag = false;
			for(int j =0 ; j <n-1-i; j++){//ÿһ����n-1-i�αȽ�
				if(a[j] > a[j+1])
				{//��������
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
					flag =true;//�����ֽ�����������Ϊtrue.��ĳһ��ȫ��û�н����������Ѿ��ź�����Ϊfalse
				}
			}
		}
	}
	
	public static void show(int[] a){
		for(int i =0; i < a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] a ={7,4,5,2,6,3,1,5,7,8,3,5,8,5,9,0};
		bubbleSort(a,a.length);
		show(a);
		
	}

}
