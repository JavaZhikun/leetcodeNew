package ���η�;

public class Demo03 {
	public static void main(String[] args) {
		Cell c1 = new Cell();
		c1.row = 5;
		c1.col = 9;
		Cell c2 = new Cell();
		c2.row = 0;
		c2.col = 3;
		Cell c3 = new Cell();
		c3.row = 0;
		c3.col = 5;
		Cell c4 = new Cell();
		c4.row = 1;
		c4.col = 4;
		//��� ���� c1
		for(int row=0; row<=19; row++){
			for(int col=0; col<=9; col++){
				if(c1.row==row &&
						c1.col==col){
					System.out.print("*");
				}else{
					System.out.print("-");
				}
				if(col==9){
					System.out.println();//�س�
				}
			}
		}
		
	}
}
//����˹�����е�һ���������
class Cell{
	int row;//��
	int col;//�� column����д 
}

