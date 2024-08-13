public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public double distance(MyPoint other){
        int xDiff = getX() - other.getX();
        int yDiff = getY() - other.getY();
        return Math.hypot(xDiff, yDiff);
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
