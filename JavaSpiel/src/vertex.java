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
	
	
	public double lenght(){
		
	    return Math.sqrt(x*x+y*y);
	}
	
	
	public vertex skalarMult(double s) {
		
		return new vertex(x*s,y*s);
	}
	
	
    public void skalarMultMod(double s) {
		
		x=x*s;
		y=y*s;
	}
	
    
    public vertex add(vertex v){
    	
    	return new vertex (v.x+x, v.y+y);
    }

    
    public void addMod(vertex v) {
		
	    x = v.x + x;
	    y = v.y + y;
    }
    
    
    public void setX(double x){
    	
    	this.x = x;
    }
    
    
    public void setY(double y){
    	
    	this.y = y;
    }
    
    
    public double getX() {
    	return x;
    }


    public double getY() {
    	return y;
    }
}

