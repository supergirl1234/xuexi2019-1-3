interface MyInterface {
    void test();//public 

}


class Outter {
	private int num=29;
	//final int value
	public void display(int value) {
	// 匿名内部类，实现了MyInterface接口
		MyInterface my= new MyInterface(){
	
	        public void test() {
				//来自Outter的成员方法的参数value
	            System.out.println("匿名内部类"+value);
	        }
	    };
		my.test();
		//匿名对象没办法创建更多的对象，只能有一个
	}
}
public class Test4{
       public static void main(String[] args){
		   
		   Outter outter=new Outter();
		   
	   }

}