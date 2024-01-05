import java.util.Arrays;
class StudentA3{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day4Program3{
public static void main(String args[]){
StudentA3[] ob=new StudentA3[5];
ob[0]=new StudentA3();
ob[0].setId(001);
ob[0].setName("Azwad");
System.out.println("ID : "+ob[0].getId());
System.out.println("Name : "+ob[0].getName());

ob[1]=new StudentA3();
ob[1].setId(111);
ob[1].setName("Sameer");
System.out.println("ID : "+ob[1].getId());
System.out.println("Name : "+ob[1].getName());

ob[2]=new StudentA3();
ob[2].setId(222);
ob[2].setName("Anand");
System.out.println("ID : "+ob[2].getId());
System.out.println("Name : "+ob[2].getName());

ob[3]=new StudentA3();
ob[3].setId(333);
ob[3].setName("Faisal");
System.out.println("ID : "+ob[3].getId());
System.out.println("Name : "+ob[3].getName());

ob[4]=new StudentA3();
ob[4].setId(444);
ob[4].setName("Durga");
System.out.println("ID : "+ob[4].getId());
System.out.println("Name : "+ob[4].getName());
}
}