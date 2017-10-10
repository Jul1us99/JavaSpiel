
public class Testvertex {

public static void main(String[] args) {
		
		vertex v1 = new vertex(2,2);
		vertex v2 = v1.skalarMult(3);
		vertex v3 = v1.add(v2);
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		v1.addMod(v3);
	
		System.out.println(v1);
		
		System.out.println(v1.lenght());		
	}
	
}