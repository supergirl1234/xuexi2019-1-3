class  Person{
     private String num;
	 private String gender;
	 public Person(String num,String gender){
	    this.num=num;
	    this.gender=gender;
	 
	 }
     public String getGender(){
	    return this.gender;
	 }
	 public String getNum(){
	    return this.num;
	 }
	 public void getIn(){
	     System.out.println("姓名:"+getNum()+"性别:"+getGender());
	 }
}
class Student extends Person{
     private int id;
	 private String job;
	 public Student(String num,String gender,int id,String job){
	    super(num,gender);
        this.id=id;
	    this.job=job;
	 }	
	 public int getId(){
	    return this.id;
	 }
	 public String getJob(){
	    return this.job;
	 }
	 public void getInfo(){
		  //super.getIn();
	      System.out.println("学号:"+getId()+"职业:"+getJob());
	 }
}
public class Test5{
       public static void main(String[] args){
		   
		   Student student=new Student("李四","男",1,"程序员");
		   
		   student.getInfo();
	   }

}