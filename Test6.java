public class Test6{
	   public static void swap(int a,int b){//要加上static才能运行
		   int temp=0;
		   temp=a;
		   a=b;
		   b=temp;
		  System.out.println("a="+a+"b="+b); 
	   }
	
	
	public static void main(String[] args){
		
		int a=12;
		int b=8;
		int temp=0;
		System.out.println("a="+a+"b="+b);
		//temp=a;
		//a=b;
		//b=temp;
		System.out.println("交换之后");
		swap(a,b);
		
		
	}
}