public class Obj.java{

   public static void main(String[] args){
	   //
		String str = "123" ; // String类型
		//默认是十进制
		int num 1= Integer.parseInt(str) ;
		//16表示当前要转换的数值为16进制
		int num 2= Integer.parseInt(str,16) ;
		System.out.println(num1);
		System.out.println(num2);
		
		
		
		String str = "123" ; // String类型
		double num = Double.parseDouble(str) ;
		System.out.println(num);
		
		
		//字符串与boolean转换
		System.out.println(Boolean.parseBoolean("true") );//true
		System.out.println(Boolean.parseBoolean("TRue") );//true
		System.out.println(Boolean.parseBoolean("false") );//false
		System.out.println(Boolean.parseBoolean("abc") );//false
		
		
		//将基本数据类型变为字符串
		String intstr =String.valueOf(100) ;
		String doublestr =String.valueOf(100.23) ;
		String booleanstr =String.valueOf(100) ;
		System.out.println(intstr);
		System.out.println(doublestr);
	    System.out.println(booleanstr );
		
		
		
		//JDK
	     int a=100_000;
		 int b=0b110;//二进制表示方式，6
		 
		 
		
		 
		 
		 
	
		
	}
}