public class Sierpinski {
    
	public static void main(String args[]) {
		int x = Integer.parseInt (args[0]); // Setting the Second Command to be an Integer
		drawSierpinski(0,0,1,x); 
	}

	public static void filledTriangle(double x, double y, double length) { // Regular Triangle
        
        double xCoord[] = {x,x+length,x+(length/2)}; 
        double yCoord[] = {y,y,y+length};

        StdDraw.filledPolygon(xCoord,yCoord);

    }

    public static void drawSierpinski(double x, double y, double length, int n){ // Sierpinski
    	if(n > 0){ // Recursion
    		drawSierpinski(x,y, length/2, n-1);
    		drawSierpinski(x+length/2, y, length/2, n-1);
    		drawSierpinski(x+length/4, y+length/2, length/2, n-1);

    	}
    	else
    		filledTriangle(x,y,length);

    }
}