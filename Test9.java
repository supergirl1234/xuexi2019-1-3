class Person{
   public void print(){
       System.out.println("1.我是爸爸！");
   }
   public String getPersonInfo(){
	   return  "这是Person的方法";
	   
   }
}
class Student extends Person{
   public void print(){
        System.out.println("2.我是儿子！");
   }
   public String getStudentInfo(){
	   
	   return "这是Student的方法";
   }
   
   
}
public class Test9{
    public static void main(String[] args) {
        Person per = new Student(); //向上转型
        per.print();
		System.out.println(per.getPersonInfo());
		//System.out.println(per.getStudentInfo());//该句错误，无法通过编译，因为Person没有getStudentInfo()方法
		
		
		//Student student=(Student)new Person();//编译通过，运行不行
		
		
		//Student student1 =(Student)Person;
		
		//对象 instanceof 类名
		System.out.println();
    }
}