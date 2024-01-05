import java.util.Scanner;
class Employee1{
private int eid;
private String ename;
private String edept;
public void setEid(int eid){this.eid=eid;}
public void setEname(String ename){this.ename=ename;}
public void setEdept(String edept) {this.edept=edept;}
public int getEid()  {return this.eid;}
public String getEname()  {return this.ename;}
public String getEdept()  {return this.edept;}
}
class Employee
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Employee1[] ob=new Employee1[5];
for(int i=0;i<5;i++)
{
ob[i]=new Employee1();
ob[i].setEid(sc.nextInt());
ob[i].setEname(sc.next());
ob[i].setEdept(sc.next());
}
System.out.println("Details are:");
for(int j=0;j<5;j++)
{
System.out.println("E-ID : "+ob[j].getEid());
System.out.println("E-NAME : "+ob[j].getEname());
System.out.println("E-DEPT : "+ob[j].getEdept());
}
}
}