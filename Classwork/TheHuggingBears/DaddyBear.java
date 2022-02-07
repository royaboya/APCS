package Classwork.TheHuggingBears;

public class DaddyBear extends Bear{
    private int DaddyBearHugs;
    
    public DaddyBear(){
        super();
    }

    @Override
    public String getType(){
        return "Daddy Bear";
    }

    @Override
    public void hug(Bear other){
        addHug();
        other.addHug();
        addTotalHug();
        
    }
    @Override
    public int getBearHugs(){
        return DaddyBearHugs;
    }

    public void addHug(){
        DaddyBearHugs++;
    }

    @Override
    public String showLove(Bear other){
        return getType() + " loves " + other.getType();
    }

}