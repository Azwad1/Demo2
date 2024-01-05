import java.util.Scanner;

class StudentA5
{
private int id;
private String name;
public void setId(int id)  { this.id = id;}
public void setName(String name) {this.name = name;}
public int getId() {return this.id;}
public String getName() {return this.name;}
}
class Day4Program5 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
StudentA5[] ob = new StudentA5[3];

for(int i=0;i<3;i++)
{
ob[i] = new StudentA5();
ob[i].setId(sc.nextInt());
ob[i].setName(sc.next());
}
System.out.println("Details are  :\n");
for(int j=0;j<3;j++)
{
System.out.println("ID :"+ob[j].getId());
System.out.println("NAME :"+ob[j].getName());
}
}
}
