package classed;

public class Overload {
	int sum(int x, int y) {
		return x + y;
		
	}
	
	int sum(int x, int y, int z) {
		return x + y + z;
		
	}
	
	public static void main(String[]args) {
		Overload ob = new Overload();
		System.out.println(ob.sum(150,50));
		System.out.println(ob.sum(60,100,50));
		
	}
}