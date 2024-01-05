import java.util.Scanner;
class StudentA4
{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day4Program4
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
StudentA4[] ob=new StudentA4[5];
for (int i =0;i<5;i++)
{
ob[i]=new StudentA4();
ob[i]=setId(sc.nextInt());
ob[i]=setName(sc.next());
}
System.out.println("Details are :\n");
for(int j = 0;j<5;j++)
{
System.out.println("ID : "+ob[j].getId());
System.out.println("Name : "+ob[j].getName());
}
}
}