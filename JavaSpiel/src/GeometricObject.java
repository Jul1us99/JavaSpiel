
public class GeometricObject {
	

	
	public vertex pos;
	public double width;
	public double height;
	
	public double getwidth() {return width;}
	public double getheight() {return height;}
	public vertex getpos() {return pos;}
	
	public GeometricObject(vertex pos, double width, double height){
		
		this.pos = pos;
		this.width = width;
	    this.height = height;
	    
	    if(width <0){
	    	
	    	width = -width;
	    	pos.x = pos.x-width;
	    }
	    

	    if(height <0){
	    	
	    	height = -height;
	    	pos.y = pos.y-height;
	    }
	}
	
public GeometricObject(double width, double height){
	
	this(new vertex(0, 0), width, height);
}

public GeometricObject(double width){
	
	this(width, width);
}

public GeometricObject(){
	
	this(10);
}

public GeometricObject(vertex pos){
	
	this(pos, 0, 0);
}
}
