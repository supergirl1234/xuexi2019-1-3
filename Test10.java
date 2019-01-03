public class Test10{
     public static void show(A a){
	    System.out.println(a.getInfo());
	 }
	 public static void main(String[] args){
	 
	    show(new A());
		show(new A1());
		show(new A2());
		show(new A3());
	 }
}
class A{
   String getInfo(){
	   
	   return "A";
   }

}
class A1 extends A{
    String getInfo(){
	   
	  return "A1";
   }

}
class A2 extends A{
   String getInfo(){
	   
	   return "A2";
   }

}
class A3 extends A{
     String getInfo(){
	   
	   return "A3";
   }


}