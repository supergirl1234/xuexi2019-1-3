public class TestParking{
     public static void main(String[] args){
		 Car bus=new Bus();
		 
     //对象数组
     Car[] cars=new Car{new Bus(),new Truck()};  
     for(int i=0;i<cars.length;i++){
		 
		 Parking.park(cars[i]);
		 
	 }	 
   }
}
class Parking{
    private static final int standardwidth=2;
	private static final int standardlength=3;
    public void park(Car car){
       if(car.length<standardlength&&car.width<standardwidth){
			System.out.println("公交车不能停在停车场");
			
		}else{
			System.out.println("公交车能停在停车场");
			
		} 
   }
}
interface Car{
    int length();
	int width();

}
class Bus implements Car{
	
	public int length(){
		return 9;
		
	}
	public int width(){
		return 4;
		
	}
	//
	public String toString(){
		
		return "Bus width="+this.width+"Bus length="+this.length;
	}
    
}
class Auto implements Car{

}