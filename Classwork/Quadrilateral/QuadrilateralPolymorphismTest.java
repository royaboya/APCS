package Classwork.Quadrilateral;

public class QuadrilateralPolymorphismTest {
    public static void main(String[] args) {
        Quadrilateral q1 = new Quadrilateral();
        Quadrilateral q2 = new Rectangle();
        Quadrilateral q3 = new Square();

        PrintQObject(q1);
        PrintQObject(q2);
        PrintQObject(q3);

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Square();

        // System.out.println(r1);
        // System.out.println(r2);

        System.out.println();
        Square s1 = new Square();

        // printObject(q1);
        // printObject(q2);
        // printObject(q3);

        printObject(r1);
        printObject(r2);

        printObject(s1);

    }

    public static void printObject(Rectangle other) {
        System.out.println(other);
    }

    public static void PrintQObject(Quadrilateral other) {
        System.out.println(other);
    }

}
