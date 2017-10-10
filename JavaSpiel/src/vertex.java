public class vertex {

	public double x;
	public double y;
	
	public vertex(double x, double y){
		
		this.x = x;
		this.y = y;
		
	}

	public String toString(){
		
		return "("+x+","+y+")";
		
	}
	
	public double lenght(vertex v){
		
	    return Math.sqrt(v.x*v.x+v.y*v.y);
		
	}
	
}
