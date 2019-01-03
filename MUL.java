public class MUL{
    public static void main(String [] args){
	    int row=1;
		int col=1;
	
		for(row=1;row<=9;row++){
		  for(col=1;col<=row;col++){
			  
		     System.out.print(row+"*"+col+"="+row*col);
		     System.out.print("\t");
		  }
		  System.out.print("\n");
		}
	
	}


}