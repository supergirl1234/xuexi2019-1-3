public class Outer{
     private String msg = "this is a attribute" ;

     class Inner{ //定义一个内部类
		private String msg = "this is a inner attribute" ;
        public void print(){ //定义一个普通方法
           //System.out.println(msg); //调用msg属性，正确的
		   System.out.println(this.msg); 
		   System.out.println("这个是从inner的方法中输出的"+Outer.this.msg);//访问外部类的属性：外部类的名字.this.名字
         }
     }

//在外部类中定义一个方法，该方法负责产生内部类对象并且调用print()方法
      public void fun(){
		  System.out.println(this.msg);
          Inner in = new Inner(); //内部类对象
          in.print(); // 内部类提供的print()方法
        }

    public static void main(String[] args){
        Outer out = new Outer(); //外部类对象
        out.fun(); //外部类方法
    }
}