package Classwork.Employee;

public class BXEmployee implements Employee, Comparable<Employee> {
    private int age;
    private String name;

    public BXEmployee(int a, String s){
        age = a;
        name =s;
    }    
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public boolean equals(Employee other){
        return getName().equals(other.getName());

    }

    @Override
    public int compareTo(Employee other){
        if(getAge() > other.getAge()){
            return 1;
        }
        else if(getAge() < other.getAge()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
