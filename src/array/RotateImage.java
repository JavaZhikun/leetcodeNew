package array;

//��һ��n*n�ľ���
//˳ʱ����ת90��

public class RotateImage
{
	public static void rotate(int[][] a,int n){
		//���Ÿ��Խ��߷�ת
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n - i; j++){
				//���Խ��߶ԳƵ���Ԫ�ػ���,ע��˴���n-i���ڸ��Խ����Ϸ���Ԫ��
				//��Ԫ��a[i][j]��Ԫ��a[n-1-j][n-1-i]���������߹���x = y�Գ�
				
				int temp = a[i][j];
				a[i][j] = a[n-1-j][n-1-i];
				a[n-1-j][n-1-i] = temp;
				
			}
		}
		
//		//����ˮƽ���߷�ת(��֮��Ϊn-1���б��ֲ���)
		for(int i = 0 ; i < n/2;i++){
			for(int j = 0; j < n ; j++)
			{//java����ò�Ҫдswap������ֱ�ӽ�������д��������Ϊjava��ǳ����
				int temp = a[i][j];
				a[i][j] = a[n -1 -i][j];
				a[n - 1 -i][j] = temp;
			}
		}
		
		
	}
	
	//��������
	//������ˮƽ���߷�תһ�Σ�Ȼ���������Խ��߷�ת
	public static void rotate2(int[][] a, int n){
		//����ˮƽ���߷�ת
		 for(int i =0 ; i < n/2;i++){
			 for(int j =0; j < n; j++){
			      //��Ԫ��a[i][j]��Ԫ��a[n-1-i][j]�Ե�
				 int temp = a[i][j];
				 a[i][j] =  a[n-1-i][j];
				 a[n-1-i][j] = temp;
			 }
		 }
		 
		//�������Խ��߷�ת
			for(int i = 0; i < n; i++){
				for(int j = i; j < n; j++){
					//�����Խ����Ϸ�,��Ԫ��a[i][j]��Ԫ��a[j][i]����
					int temp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = temp;
					
					
				}
			}
	}
	
	
	public static void main(String[] args)
	{
		int[][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		rotate(matrix,matrix.length);
		rotate2(matrix,matrix.length);
		for(int i = 0; i < matrix.length;i++)
		{
			for(int j = 0; j < matrix.length; j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
