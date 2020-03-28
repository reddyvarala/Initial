
public class Lamp {

	private boolean ison =false;
	
	public Lamp(boolean ison) {
		
		this.ison = ison;
	}
	
	public void turnon () {
		
		
		this.ison = true ;
	}
	
	public static void main(String[] args) {
		
		Lamp[]lamps = new Lamp[3];
		
		for ( int i =0 ; i < lamps.length ; i++) {
			
			lamps[i]= new Lamp(false);
			System.out.println(lamps[i].ison);
			
			lamps[i].turnon();
			System.out.println(lamps[i].ison);
			
		}
		
		
		
		
		// TODO Auto-generated method stub

	}

}
