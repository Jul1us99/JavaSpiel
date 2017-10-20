
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

public String toString(){
	
	return "pos="+pos+", width = "+width+", height = "+height+"";
}

public double circumference(){
	
	return 2*(width+height);
}


public double area(){
	
	return (width*height);
}

public boolean contains(vertex v){
	
	return (v.x >= pos.x && v.x <= pos.x+width) &&
		   (v.y >= pos.y && v.y <= pos.y+height);
}

public boolean isLargerThan(GeometricObject that){
	
	return this.area() > that.area();
}

public void moveTo(vertex v){
	
	this.pos = v;
}

public void moveTo(double x, double y){
	
	moveTo(new vertex(x,y));
}

public boolean equals(Object thatObject){
	
	if(thatObject instanceof GeometricObject){
		
		GeometricObject that = (GeometricObject)thatObject;
		
		return that.width == this.width &&
			   that.height == this.height &&
			   this.pos.equals(that.pos);
	}
	return false;
}
}

