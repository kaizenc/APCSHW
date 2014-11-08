public class coordinate{
    private int x,y;

    public coordinate(int x, int y){
	setX(x);
	setY(y);
    }

    public coordinate(){
    }
    
    public int getX(){
	return x;
    }

    public void setX(int xVar){
	x = xVar;
    }

    public int getY(){
	return y;
    }

    public void setY(int yVar){
	y = yVar;
    }

    public void setXY(int x, int y){
	setX(x);
	setY(y);
    }

    public String toString(){
	return "("+getX()+","+getY()+")";
    }
}