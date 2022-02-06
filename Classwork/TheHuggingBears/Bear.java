package Classwork.TheHuggingBears;

public abstract class Bear {
    private static int bearCount;
    private static int hugCount;

    public Bear() {
        addtotalBear();
    }

    public static int getTotalHugCount() {
        return hugCount;
    }

    public static void addtotalBear() {
        bearCount++;
    }

    public static void addTotalHug() {
        hugCount++;
    }

    public static int getBearCount() {
        return bearCount;
    }

    public static boolean CheckGroup(Bear b1, Bear b2, Bear b3) {
        int baby = 0;
        int mommy = 0;
        int daddy = 0;

        if (b1.getType() == "MommyBear") {
            mommy++;
        } else if (b1.getType() == "Daddybear") {
            daddy++;
        } else {
            baby++;
        }

        if (b2.getType() == "Mommy Bear") {
            mommy++;
        } else if (b2.getType() == "Daddy Bear") {
            daddy++;
        } else {
            baby++;
        }

        if (b3.getType() == "Mommy Bear") {
            mommy++;
        } else if (b3.getType() == "Daddy Bear") {
            daddy++;
        } else {
            baby++;
        }

        return baby == 1 && mommy == 1 && daddy == 1;
    }

    public abstract String getType();

    public abstract void hug(Bear other);

    public abstract void addHug();

    public abstract String showLove(Bear other);

    public abstract int getBearHugs();

    public String toString(){
        return getType() + " has " + getBearHugs();
    }
}