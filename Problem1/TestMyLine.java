public class TestMyLine {

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(4, 6);
        MyPoint p2 = new MyPoint(7, 8);

        MyLine l1 = new MyLine(p1, p2);

        double Length = l1.getLength();

        double Gradient = l1.getGradient();

        System.out.println("begin point = " + l1.getBegin());
        System.out.println("end point = " + l1.getEnd());
        System.out.println("test begin x = " + l1.getBeginX());
        System.out.println("test begin y = " + l1.getBeginY());
        System.out.println("test end x = " + l1.getEndX());
        System.out.println("test end y = " + l1.getEndY());

        p1.setX(2);
        System.out.println("new begin point = " + l1.getBegin());

        System.out.println("the line length is: " + Length);
        System.out.println("the line gradient is: " + Gradient);
    }
}
