public class Rand{ 
	private final int value;
	public Rand(){
		java.util.Random random=new java.util.Random();
		this.value=random.nextInt(100);
		
	}
    public void fun(){
		
		java.util.Scanner scanner=new java.util.Scanner(System.in);
	    
		while(true){
			System.out.println("请输入一个数");
			int  num = scanner.nextInt();
			if(num<this.value){
				System.out.println("数小了");
				
			}else if(num>this.value){
				System.out.println("数大了");
			}else{
				System.out.println("猜中了");
				break;
			}
		}
	}
	public static void main(String[] args){
		Rand rand=new Rand();
		rand.fun();
	}
}