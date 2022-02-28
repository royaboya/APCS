import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);

        // 1, 2, 3

        arr.remove(1);

        // 1, 3
        arr.remove(new Integer(1));
        System.out.println("size: " + arr.size());
        // 3

        arr.add(5);

        // 3, 5

        arr.add(arr.remove(1));
        // 3, 5 - > removes 5 and adds 5

        arr.add(7);

        // arr.remove(2); //-> size is only 2 so (0, 1) out of bounds

        // 3,5

        arr.set(2, 6);

        arr.add(arr.remove(0));
        // 5, 3 take away 3 and adds it to the end

        System.out.println(arr);

    }
}
