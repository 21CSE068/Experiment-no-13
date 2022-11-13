import java.util.*;
public class studentcgpa {
    public static void main(String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        Std arr[]=new Std[10];
        System.out.println("enter the number of student:");
        n=obj.nextInt();
        ArrayList<Std> list=new ArrayList<>();
        if (n<=10)
        {
        for(int i=1;i<=num;i++)
        {
            arr[i]=new Std( );
            arr[i].getdata(i,n);
            list.add(arr[i]);
        }
        System.out.println("--details of students--");
        System.out.println(list);
        System.out.println("\n");
        System.out.println("Student Details after Sorted  by their CGPA: ");
        Collections.sort(list, new sorting());
        System.out.println(list);
        }
        else 
        {
                    System.out.println("No memory space");
        
        }
    }
}
class Std
{
    String name;
    String rollno;
    double cgpa;
    void getdata( int i,int n)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter student"+ i +" Name:");
        name=obj.next();
        System.out.println("Enter student " + i+ " Roll number:");
        rollno=obj.next();
        System.out.println("Enter student " + i+" CGPA:");
        cgpa=obj.nextDouble();
    }
    @Override
    public String toString()
            
    {      
        return "\n NAME:"+ name + "::Roll No.=" + rollno + ":: CGPA=" + cgpa + "\n";
        
    }
    
}

class sorting implements Comparator<Std>
{
    public int compare(Std s1,Std s2)
    {
        return Double.compare(s2.cgpa, s1.cgpa);
    }
}