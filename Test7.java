public class Test7{
      public static void swap(int a,int b){//要加上static才能运行
		   a=a^b;
	       b=a^b;
	       a=a^b;
		  System.out.println("a="+a+"b="+b); 
	   }
	public static change(char[] ch){
		ch[0]='a';
		
	}
   public static void main(String[] args){
     int a=12;
	 int b=8;
	System.out.println("a="+a+"b="+b);
	 //a=a^b;
	 //b=a^b;
	 //a=a^b;
	 System.out.println("交换之后");
     swap(a,b);
	 System.out.println("a="+a+"b="+b);
	 char[] ch=new char[]{'b','c'}; 
	 change(ch);
    }
}