import java.util.*;
class Studentmethodcalling
     {
      int rollno=101;
      float marks=686.0f;
      String name="karthick";
      }
      class Methodwithobject
        {
          public void details(Student st)
             {
              System.out.println(st. rollno);
              System.out.println(st. marks);
              System.out.println(st. name);
              }
     public static void mai(String args[])
          {
            Student p=new Student();
            Methodwithobject o=new Methodwithobject();
            o.Student(p);
           }
        }