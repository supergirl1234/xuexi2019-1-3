public class TestString{
	
	//String对象实例化
	/*public static void print(){
	//1直接赋值
		String str1="java is best";
		//2。构造方法
		String str2=new String("java is best");
		System.out.println(str1);
		System.out.println(str2);
	}*/
	
	
	//String对象的比较
	/*public static void main(String[] args){
	
		//print();
		
		
		int x=10;
		int y=10;
		System.out.println(x==y);//true
		
		//不相等
		//== 本身是进行数值比较的，如果现在用于对象比较，那么所比较的
		//就应该是两个对象所保存的内存地址数值比较，而并没有比较对象的内容。
		String str1="java is best";
		String str=new String("java is best");
		System.out.println(str1==str); //false
		//要想比较内容比较，则必须采用String类提供的equals方法。
		System.out.println(str1.equals(str));//true
	}*/
	
	
	
	/*public static void main(String[] args){
		//String str1 = "Hello" ;
		String str1 = null;
		String str = new String("Hello") ;
		//方法2
		//System.out.println(str1.equals(str));
		System.out.println(str.equals(str1));//若str1是空的（null）会报错在运行时
		//方法1：把字符串匿名对象放在前面
		System.out.println("Hello".equals(str));
		
	}*/
	
	
	
	//直接复制法、构造方法开辟空间的比较
	/*public static void main(String[] args){
		//直接复制法
		String str1 = "hello" ;//堆空间上开辟了一个内存块，且共享（字符串共享池）
		String str2 = "hello" ;
		String str3 = "hello" ;
		System.out.println(str1 == str2); // true
		System.out.println(str1 == str3); // true
		System.out.println(str2 == str3); // true
		//构造方法法
		String str4=new String("hello");//堆空间上开辟了两个内存块，其中一个变成垃圾空间
		System.out.println(str1 == str4);//false
		
	}*/
	
	
	//通过构造方法实例化的字符串对象 入 共享池
	/*public static void main(String[] args){
		//在String类中提供有方法入池操作 public String intern() ;
		String str=new String("java is best").intern();//构造方法的要写在前面
		//或者下面这种写法
		//String str=new String("java is best");
		//str2=str2.intern;
		String str1="java is best";
		System.out.println(str1==str); //true
		
		
	}*/
	
	
	
	//字符串不可变更，如果字符串进行修改，会创建新的字符串对象
	/*public static void main(String[] args){
		//开辟了5个堆空间
		String str = "hello" ;
		str = str + " world" ;
		str += "!!!" ;
		System.out.println(str);
	}*/
	
	
	
	
	//字符与字符串之间的转换
	/*public static void main(String[] args){
		
		String str = "hello" ;
		//获取字符串指定索引位置的字符
		char ch=str.charAt(0);
		System.out.println(ch);
		
		System.out.println("-----------------------");
		
		
		//将字符串变成字符数组返回
		str="helloworld";
		char[] chars=str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
				
			System.out.print(chars[i]);
			if(i<chars.length-1){
				
				System.out.print("、");
			}
		}
		System.out.println();
		System.out.println("-----------------------");
	   
       //字符数组转换为字符串
	   String str1=new String(chars);
	   System.out.println(str1);
	   
	   String str2=new String(chars,2,4);
	   System.out.println(str2);

	}*/
	
	
	
	
	//判断str的每个字符是否由数字0~9所组成
	/*public static boolean isNumber(String str){
		char[] chars=str.toCharArray();
		for(int i=0;i<chars.length;i++){
			char c=chars[i];
			if(c>='0'&&c<='9'){
				
				continue;
			}else{
				
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args){
		String[] strs=new String[]{"abc123","123","shu0"};//String数组
		//String[] strs={"abc123","123","shu0"};//String数组还可以这样写
		for(int i=0;i<strs.length;i++){
			
			String str=strs[i];
			System.out.println(str+"is number"+isNumber(str));
			
		}
		
	}*/
	
	
	
	//字节与字符串转换
	/*public static void main(String[] args){
		String str="helloworld";
		byte[] bytes=str.getBytes();
		for (int i = 0; i < bytes.length; i++){
				
			System.out.print(bytes[i]);
			if(i<bytes.length-1){
				
				System.out.print("、");
			}
		}
	}*/

	
	
	
   //字符串比较
   /*public static void main(String[] args){
		String str1 = "hello" ;
		String str2 = "Hello" ;
		String str3="helloworld";
		System.out.println(str1.equals(str2)); // false
		System.out.println(str1.equalsIgnoreCase(str2)); // true
	   
	    //compareTo()方法返回一个整型，
		//1. 相等：返回0.
		//2. 小于：返回内容小于0.
		//3. 大于：返回内容大于0。
		//obj1.compareTo(obj2);只关心返回值的正负和0
		System.out.println("A".compareTo("a")); // -32
		System.out.println("a".compareTo("A")); // 32
		System.out.println("A".compareTo("A")); // 0
		System.out.println("AB".compareTo("AC")); // -1
		System.out.println("刘".compareTo("杨"));
   }*/
	
	
	//字符串方法
	//字符串查找
	/*public static void main(String[] args){
		
		String str1="helloworld";
		System.out.println(str1+"contain hello "+str1.contains("hello"));
		
		//1.判断是否为java文件
		String filename="Person.java";
		int index=filename.lastIndexOf(".");
		if(index!=-1){
			
			String extend=filename.substring(index+1);
			if(extend.equals("java")){
				
				System.out.println("是java文件");
			}
		}else{
			
			System.out.println(".不存在");
		}
		//2。endsWith
		System.out.println(filename.endsWith("java"));
		
		//字符串替换
		String str="aelloaorld";
		System.out.println(str.replaceAll("a", "_"));
		System.out.println(str.replaceFirst("a", "_"));
		
		//字符串拆分
		
		//ip拆分
		
		//多次拆分
		
		
		//字符串截取
		
		
		//字符串的其他方法
		//trim()
		String strp = " hello world " ;
		System.out.println("["+strp+"]");
		System.out.println("["+strp.trim()+"]");
		
		//toUpperCase
		
		
		//isEmpty()
		System.out.println("hello".isEmpty());//false
		System.out.println("".isEmpty());//true
		System.out.println(" ".isEmpty());//false
		System.out.println(new String().isEmpty());
		
		
	}*/
	
	
	 //首字母大写
    /* public static void main(String[] args){
		 
		 
	 }*/
	 
	 
	 public static void main(String[] args){
		 //StringBuilder  线程不安全
		 //StringBuffer 线程安全
		 
		 StringBuffer sb = new StringBuffer();//StringBuilder
		 for(int i=0;i<100;i++){
			sb.append("Hello").append("World").append(i);//链式调用
		 }
		System.out.println(sb.toString());
		 
		 
		 //字符串反转:reverse()
		StringBuffer sb2 = new StringBuffer("helloworld");
		System.out.println(sb2.reverse());
		
		//删除指定范围的数据: delete(int start, int end)
		
		//插入数据:insert(int offset, 各种数据类型 );
	 }
	 
	 
	 
	 
}