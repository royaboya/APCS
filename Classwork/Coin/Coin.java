package Classwork.Coin;

public class Coin {
    private boolean faceValuehead;
    private static int numOfCoins;

    public Coin() {
        faceValuehead = Math.random() > 0.5;
        numOfCoins++;
    }

    public Coin(boolean b) {
        faceValuehead = b;
        numOfCoins++;
    }

    public boolean isHead() {
        return faceValuehead == true;
    }

    public boolean toss() {
        faceValuehead = Math.random() > 0.5;
        return faceValuehead;
    }

    public String toString() {
        if (faceValuehead) {
            return "Head";
        }
        return "Tail";
    }

    public boolean equals(Coin other) {
        return isHead() == other.isHead();
    }

    public double test(int n) {
        double heads = 0;
        for (int i = 0; i < n; i++) {
            boolean b = toss();
            if (b) {
                heads++;
            }
        }
        return heads / n;
    }

    public static int getNumOfCoins() {
        return numOfCoins;
    }

    public static Coin duplicate(Coin c) {
        return new Coin(c.isHead());
    }

}
