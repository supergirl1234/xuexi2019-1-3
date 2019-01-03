public  class Ou{
	
	public static void main(String[] args){
		Inner2 inner=new Inner2();
		Outer2 outer=new Outer2(inner);
		
		outer.fun();
	  
	  }
}
//普通类
 class Outer2{
	   private String msg = "Hello World" ;
	
	  private Inner2 inner2;//Outer2的属性
	  public Outer2(Inner2 inner2){
		 this.inner2=inner2;
	  
		}
	  public void fun(){
	  
		 inner2.print();
		}
	  

}


//普通类
class Inner2{
	private String msg = "This is a dog" ;
	public void print(){
		System.out.println(this.msg);
	}

}