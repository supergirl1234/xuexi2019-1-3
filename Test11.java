//抽象类
public class Test11{

    public static void main(String[] args){
	//抽象类无法实例化对象
	
	}
}
abstract class Person{
    private string name;
	public Person(String name){
			   
		this.name=name;
    } 
	public String getName(){
        return this.name;
	}
    public String setName(String name){
	    
	    this.name=name;
	}
   //抽象方法(不能用private来修饰抽象方法)
   public abstract String getInfo();
   public static Person getPerson(){
	   //方法内部类
	   class Worker extends Person{
		   public Worker(String name){
			   
			   this.name=name;
		   } 
		   public String getPersonInfo(){
			   return "工人姓名："+this.getName();
			   
		   }
	   }
	   return new Worker("王五");
	   
	   //匿名内部类
	     new Person("小明"){
			 public String getPersonInfo(){
			   return "医生姓名："+this.getName();
			   
		   }
			 
		 };
   }
   
}

//1.子类继承抽象类，必须实现父类的抽象方法
//2.子类继承抽象类，如果没有覆写父类的抽象方法，则必须使用abstract修饰子类，则子类也无法进行实例化

class Student extends Person{
	public Student(String name){
		//	   
		super(name);
    } 
	public String getPersonInfo(){
			   return "学生姓名："+this.getName();
			   
		   }
}