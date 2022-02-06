package Classwork.TheHuggingBears;

public class MommyBear extends Bear{
    private int MommyBearHugs;
    
    public MommyBear(){
        super();
    }

    @Override
    public String getType(){
        return "Mommy Bear";
    }

    @Override
    public int getBearHugs(){
        return MommyBearHugs;
    }

    public void addHug(){
        MommyBearHugs++;
    }

    @Override
    public void hug(Bear other){
        addHug();
        other.addHug();
        addTotalHug();
        
    }

    @Override
    public String showLove(Bear other){
        return getType() + " loves " + other.getType();
    }
}
