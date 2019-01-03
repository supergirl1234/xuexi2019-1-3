
public  class Outer2{
	   private String msg = "this is a attribute" ;
	    public Outer2(){
		 
	  
		}

	  private Inner2 inner2;//Outer2的属性
	  public Outer2(Inner2 inner2){
		 this.inner2=inner2;
	  
		}
	  public void fun(){
	  
		 inner2.print();
		}
		public static void main(String[] args){
		Inner2 inner=new Inner2();
		Outer2 outer=new Outer2(inner);

		outer.fun();
	
	  }
	  

}


//普通类
class Inner2{
	private String msg = "This is a inner attribute" ;
	public void print(){
		System.out.println(this.msg);
	}

}