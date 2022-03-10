//Huo Chen, 3/9/2022
public class StudentListTester
{
  public static void main(String[] args)
  {
    String[] testList = {"AMY","ANDREW","ANGELA","ANNA","ANTHONY","BARBARA","BETTY","BRENDA","BRIAN","CAROL","CHARLES","CHRISTOPHER","CYNTHIA","DANIEL","DAVID","DEBORAH","DEBRA","DONALD","DONNA","DOROTHY","EDWARD","ELIZABETH","ERIC","FRANK","GARY","GEORGE","GREGORY","HELEN","JAMES","JASON","JEFFREY","JENNIFER","JESSICA","JOHN","JOSE","JOSEPH","JOSHUA","KAREN","KATHLEEN","KENNETH","KEVIN","KIMBERLY","LARRY","LAURA","LINDA","LISA","MARGARET","MARIA","MARK","MARTHA","MARY","MATTHEW","MELISSA","MICHAEL","MICHELLE","NANCY","PAMELA","PATRICIA","PAUL","RAYMOND","REBECCA","RICHARD","ROBERT","RONALD","RUTH","SANDRA","SARAH","SCOTT","SHARON","SHIRLEY","STEPHEN","STEVEN","SUSAN","THOMAS","TIMOTHY","VIRGINIA","WILLIAM"};
    String[] RandomizedTestList = {"BETTY","RONALD","CHRISTOPHER","DEBORAH","JEFFREY","MELISSA","REBECCA","KATHLEEN","GARY","CAROL","ANTHONY","KEVIN","DOROTHY","SUSAN","SARAH","STEPHEN","DANIEL","ANNA","JESSICA","ANDREW","ROBERT","RICHARD","HELEN","NANCY","KAREN","KIMBERLY","DAVID","PAUL","MARK","ERIC","JOSEPH","PAMELA","BRENDA","JOHN","LINDA","SHARON","LISA","STEVEN","MICHELLE","MARIA","THOMAS","LARRY","DONNA","JENNIFER","SCOTT","TIMOTHY","RUTH","GEORGE","GREGORY","BARBARA","ELIZABETH","EDWARD","MARGARET","JOSE","SHIRLEY","MARY","JOSHUA","MICHAEL","LAURA","PATRICIA","WILLIAM","CYNTHIA","CHARLES","FRANK","JASON","KENNETH","MARTHA","AMY","ANGELA","MATTHEW","DONALD","BRIAN","JAMES","DEBRA","RAYMOND","SANDRA","VIRGINIA"};
    
    
    System.out.print("Starting Testing...");
    System.out.println();
    System.out.print("Checking join and getStudentByIndex methods...");
    
    StudentList sl = new StudentList();

    for(int i = 0; i<=2; i++)
    {
      sl.join(RandomizedTestList[i]);
    }
	
    if(sl.getStudentByIndex(0).equals("BETTY") && sl.getStudentByIndex(1).equals("CHRISTOPHER") && sl.getStudentByIndex(2).equals("RONALD")){
      System.out.println("Passed");
    }
    else
    {
      System.out.println("Failed");
    }
   
    System.out.println();
    System.out.print("Checking getList method...");

    for(int i = 3; i<RandomizedTestList.length; i++)
    {
      sl.join(RandomizedTestList[i]);
    }

    String[] resultList = sl.getList();
        
    boolean mark = true;
    for(int i =0; i<testList.length;i++)
    {
      if(!resultList[i].equals(testList[i]))
      {
        mark = false;
      }
    }
    if(mark)
    {
      System.out.println("Passed");
    }
    else
    {
      System.out.println("Failed");
    }
    
    System.out.println();
    System.out.print("Checking findStudent method...");
    if(sl.findStudent("BARBARA")==5 && sl.findStudent("LALALA")==-1)
    {
      System.out.println("Passed");
    }
    else
    {
      System.out.println("Failed");
    }
    
    System.out.println();
    System.out.print("Checking getStudentByIndex method...");
    if(sl.getStudentByIndex(3).equals("ANNA"))
    {
      System.out.println("Passed");
    }
    else
    {
      System.out.println("Failed");
    }
    
    System.out.println();
    System.out.print("Testing Ended!");
  }
}

