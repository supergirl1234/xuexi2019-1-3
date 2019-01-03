  //java语言中参数传递：值传递（栈空间的内容）
  //基本数据类项--》存放在栈空间--》里面放的是值
 //引用数据类型—--》栈空间--》里面放的是引用的对象所在堆空间的地址
 public class  swap{
 
 
    public static void swapp(int a,char[] args2){
		
		a=10;
		char[] chars=args;
		chars[0]='A';
		
	}
	
	public static void main(String[] args){
	    int a=20;
		char[] chars=new char[]{'a','b'};
		swap(a,chars);
	 
	}
 
 }