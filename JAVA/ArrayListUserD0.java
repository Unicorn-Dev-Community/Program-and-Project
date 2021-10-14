import java.util.*;
public class ArrayListUserD0
 {
  public static void main(String[] args) 
  {
	  ArrayList<Student> s3csa=new ArrayList<Student>();
	  s3csa.add(new Student("Aasish"));
	  s3csa.add(new Student("Amal"));
  
    for(Student s : s3csa) 
    {
      System.out.println(s.length1());
    }
  }
}


class Student 
{
  public String name;
  public Student(String name1) 
  {
    name = name1;
  }
  int length1()
  {
	return name.length();
  }

}

