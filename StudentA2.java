class StudentA2{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day4Program2{
public static void main(String args[]){
StudentA2 ob1=new StudentA2();
ob1.setId(111);
ob1.setName("Azwad");
System.out.println("ID : "+ob1.getId());
System.out.println("Name : "+ob1.getName());
}
}