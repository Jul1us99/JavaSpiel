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
	
	
	public double length(){
		
	    return Math.sqrt(x*x+y*y);
	}
	
	
	public vertex skalarMult(double s) {
		
		return new vertex(x*s,y*s);
	}
	
	
    public void skalarMultMod(double s) {
		
		x = x*s;
		y = y*s;
	}
	
    
    public vertex add(vertex v){
    	
    	return new vertex (v.x+x, v.y+y);
    }

    
    public void addMod(vertex v) {
		
	    x = v.x+x;
	    y = v.y+y;
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
    
    
    
    public boolean equals(Object thatObject){
    	
        if(thatObject instanceof vertex){
    	
    	vertex that = (vertex)thatObject;
        
    	    return this.x == that.x && this.y == that.y;
        }	
    
        return false; 
    }
    
    
    public double distance(vertex v){
		
    	double xx = v.y+this.y;
    	double yy = v.x+this.x;		
	    return Math.sqrt(xx*xx+yy*yy);
	}
    
    
    public vertex sub(vertex v){
    	
    	return new vertex (v.x+x, v.y+y);
    }
    
    
    public void subMod(vertex v){
    	
    	x = v.x+x;
    	y = v.y+y;	
    }
    
    
    public void normalize(){
    	
    	double factor = length();
    	x = x/factor;
    	y = y/factor;
    }
}

   