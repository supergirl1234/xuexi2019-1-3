public class Person{
      private String name;
	  private int age;
	  private int gender;
	  private String secret="xxx";
	  //重载构造方法
	  //构造函数
	  //方法名和类名一样
	  //返回值：无
	public Person(){
		  
		  
     }
	 //构造方法本身是有返回值的，返回的是当前构造的对象
	  public Person(String name,int age){
		this.name = name ;
		this.age = age ;
      }
	  public Person(String name,String gender){
		this.name = name ;
		this.gender = gender ;
      }
	   public Person(String name,String gender,int age){
		   this(name,gender);//this调用一定要放在构造方法中的第一条语句
		//this.name = name ;
		//this.gender = gender ;
		this.age=age;
      }
	   public Person(String name,String gender,int age,String secret){
		    this(name,gender,age);
		//this.name = name ;
		this.secret = secret ;
      }
	  //构造方法重载是为了可以创建出不同属性信息的对象
	  
	  String personInfo(){
	       return "这个人叫"+name+",年龄为"+age+"性别为"+gender;
	  
	  }
	  //getxxx(),setxxx()方法是为了让外部访问到
	  //setxxx()是修改属性
	  //getxxx()是获取属性
	  String getSecret(){
	       return secret+"!!";
	  
	  }
	  
	  String getName(){
		  return name;
	  }
	   int getAge(){
		  return age;
	  }
	  void setName(String name){
		  this.name=name;
		  
	  }
	  void setAge(int age){
		  this.age=age;
		  
	  }
	  //具体对象
	  public static void main(String[] args){
	  //对象1
	  Person person1=new Person("张三",12);//这种赋值的方法需要构造函数
	  //给对象赋值
	 // person1.name="张三";
	  //person1.age=12;
	  //还可以这样,person4与person1指向同一个堆内存
	  //person1对象引用的地址赋值给person4
	  Person person4=person1;//他们两个是一个对象
	  person4.age=24;
	  //person对象引用空指针 
	  //person1=null;
	  //person4=null;
	  //导致堆上面的person对象（即name，age属性）已经没有变量（即person1，person4）使用它，
	  //但是对象（属性）还存在，不做内存回收，JVM自动回收
	  //堆上放的是对象的属性信息
	  
	  
	  //Person person5;
	  //System.out.println(person1.personInfo());//该句编译都通不过，因为在java中的变量不初始化，是不能用的
	  //对象2
	  //Person person2=new Person();
	  //person2.name="李四";
	  //person2.age=32;
	  System.out.println(person1.personInfo());
	  //System.out.println(person2.personInfo());
	  }
}