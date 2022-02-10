package Classwork.Employee;

import java.security.spec.EllipticCurve;

public class BXEmployeeTester
{
  public static void selectionSort(Comparable[] arr)
  {int low;
    //add your code here

    for(int i = 0; i < arr.length; i++){
      low = i; // reset low every time you move through the array and sort
        for(int j = i + 1; j < arr.length; j++){
            if(arr[j].compareTo(arr[low]) == -1){
                low = j; // find smallest
            }
        }
        // sort blah blah blah yea
        Comparable temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

    }
  }
  
  public static void main(String[] args)
  {
    boolean check32 = false;
    boolean check25 = false;
    boolean check42 = false;
    boolean check23 = false;
    boolean check35 = false;
    
    BXEmployee[] arr ={new BXEmployee(32,"Alice"),
                       new BXEmployee(25,"Ben"),
                       new BXEmployee(42,"Calvin"),
                       new BXEmployee(23,"Dora"),
                       new BXEmployee(35,"Elisa"),
                       };
    
    selectionSort(arr);
    
    System.out.println("//////////////////////////////////////");
    System.out.println("After selection sort:");
    
    boolean sortCorrectly = true;
    System.out.println("Index\tAge\tName"); 
    
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(i + "\t" + arr[i].getAge() + "\t" + arr[i].getName());
      if(i !=0 && arr[i].getAge() < arr[i-1].getAge()){
        System.out.print("\t X");
        sortCorrectly = false;
      }
      
      if(arr[i].getAge()==32){
        check32 = true;
      }else if(arr[i].getAge()==25){
        check25 = true;
      }else if(arr[i].getAge()==42){
        check42 = true;
      }else if(arr[i].getAge()==23){
        check23 = true;
      }else if(arr[i].getAge()==35){
        check35 = true;
      }
      
      System.out.println();
    }
    
    if(sortCorrectly && check32 &&  check25 && check42 && check23 && check35)
    {
      System.out.println("The array is correctly sorted!");
    }else{
      System.out.println("Please try again!");
    }
  }
}