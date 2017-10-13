
public class Testvertex {

public static void main(String[] args) {
		
		vertex v1 = new vertex(10,12);
		//vertex v2 = v1.skalarMult(3);
		//vertex v3 = v1.add(v2);
		
		System.out.println(v1);
		//System.out.println(v2);
		//System.out.println(v3);
		
		//v1.addMod(v3);
	
		//System.out.println(v1);
		
		//System.out.println(v1.length());	
		
		v1.normalize();
		
		System.out.println(v1);
		System.out.println(v1.getX()+v1.getY());
	}
	
}