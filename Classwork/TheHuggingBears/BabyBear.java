package Classwork.TheHuggingBears;

public class BabyBear extends Bear{
    private int BabyBearHugs;

    public BabyBear(){
        super();
    }

    @Override
    public String getType(){
        return "Baby Bear";
    }

    public int getBearHugs(){
        return BabyBearHugs;
    }

    public void addHug(){
        BabyBearHugs++;
    }

    public String showLove(Bear other){
        return getType() + " loves " + other.getType();
    }

    public String toString(){
        return getType() + " has " + getBearHugs() + " hugs";
    }


    public void hug(Bear other){
        // none because baby bear cant hug lol
    }


}
