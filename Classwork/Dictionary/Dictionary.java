package Classwork.Dictionary;

public class Dictionary extends Book {
    private double definitions;

    public Dictionary() {
        // super();
        definitions = 52500;
    }

    public double getDefPerPage() {
        return definitions / getPages();
    }

    @Override
    public String toString() {
        return "This dictionary has " + getPages() + " pages";
    }

}
