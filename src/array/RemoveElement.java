package array;

//给一个数组和一个值，移除所有和该值相等的元素并返回长度

public class RemoveElement
{
	static int removeElement(int[] a ,int n, int value){
		
		int index = 0;
		
		//标志下标index在a[i]和value值相同的时候不做出改变，不等的时候将a[i]的值赋值给标志位所在的元素，然后标志位加1
		for(int i = 0; i < n; i++){
			if(a[i]!=value)
				a[index++] = a[i];
		}
		return index;
	}
	
	public static void main(String[] args)
	{
		int[] a ={1,1,2,2,1,2,1,3,4,5};
	    int	length = removeElement(a,a.length,1);
	    System.out.println(length);
	}

}
