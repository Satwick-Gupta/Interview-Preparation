import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

class Employee {
    private int employeeid;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;
    
    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isCompanyTransport() {
        return companyTransport;
    }

    public void setCompanyTransport(boolean companyTransport) {
        this.companyTransport = companyTransport;
    }
}

public class MyClass {
    static int findCountOfEmployeesUsingCompTransport(Employee[] emp) {
        int count = 0;
        for (int i = 0; i < emp.length; i++) {
           if(emp[i].isCompanyTransport()==true)
           {
               count++;
           }
        }
     return count;
    }
    static Employee findEmployeewithSecondHighestRating(Employee[] emp)
    {
        double max1=Integer.MIN_VALUE;
        double max2=Integer.MIN_VALUE;
        Employee first=null;
        Employee second=null;
        for(int i=0;i<emp.length;i++)
        {

            if(emp[i].getRating()>max1&&emp[i].isCompanyTransport()==false)
            {
                max1=emp[i].getRating();
                first=emp[i];

            }

        }
        for(int i=0;i<emp.length;i++)
        {
            if(emp[i].getRating()>max2&&emp[i].getRating()!=max1&&emp[i].isCompanyTransport()==false)
            {
                max2=emp[i].getRating();
                second=emp[i];

            }
        }
        return second;

    }

    public static  void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Employee emp[]=new Employee[4];

            Employee emp1=new Employee();
            emp1.setEmployeeid(1001);
            emp1.setName("Ashwa");
            emp1.setBranch("IT");
            emp1.setCompanyTransport(true);
            emp1.setRating(5);
        Employee emp2=new Employee();
        emp2.setEmployeeid(1002);
        emp2.setName("Preeti");
        emp2.setBranch("IT");
        emp2.setCompanyTransport(true);
        emp2.setRating(4);

         Employee emp3=new Employee();
        emp3.setEmployeeid(1003);
        emp3.setName("Uma");
        emp3.setBranch("Admin");
        emp3.setCompanyTransport(false);
        emp3.setRating(3);

        Employee emp4=new Employee();
        emp4.setEmployeeid(1004);
        emp4.setName("Akash");
        emp4.setBranch("Hardware");
        emp4.setCompanyTransport(false);
        emp4.setRating(4.5);
        emp[0]=emp1;
        emp[1]=emp2;
        emp[2]=emp3;
        emp[3]=emp4;

       int out1=findCountOfEmployeesUsingCompTransport(emp);
       if(out1==0)
       {
           System.out.println("No Such Employees");
       }
       else
       {
           System.out.println(out1);
       }
       if(findEmployeewithSecondHighestRating(emp)==null)
       {
           System.out.println("All Employees using company transport");
       }
       else {
           System.out.println(findEmployeewithSecondHighestRating(emp).getEmployeeid());
           System.out.println(findEmployeewithSecondHighestRating(emp).getName());
       }

    }
}

