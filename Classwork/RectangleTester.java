public class RectangleTester {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(1, 4);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println();

        System.out.println("The area difference between the first two Rectangles is " + r1.getAreaDiff(r2) + ".");

        System.out.println(String.format("There are %1$s rectangles.", Rectangle.getNumOfRects()));
    }
}