public class  Test8{
	
	  public static void main(String[] args){
		  Person person1=new Person();
		  person1.print();
		  Student student1=new Student();
		  student1.print();
	  }
	
}
class Person{
	
	
	   public void print(){
		   
		   System.out.println("这是person的print方法");
	   }
}
class Student extends Person{
	//defualt 包私有
	//public >protected>default>private
	  public void print(){//对父类方法进行复写
		  System.out.println("这是student的print方法");
		  
	  }
	
}