class StudentA1{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){return this.id;}
public String getName(){return this.name;}
}
class Day4Program1{
public static void main(String args[]){
StudentA1 ob1=new StudentA1();
ob1.setId(111);
ob1.setName("Azwad");
System.out.println("ID : "+ob1.getId());
System.out.println("Name : "+ob1.getName());
StudentA1 ob2=new StudentA1();
ob2.setId(222);
ob2.setName("Anand");
System.out.println("ID : "+ob2.getId());
System.out.println("Name : "+ob2.getName());
StudentA1 ob3=new StudentA1();
ob3.setId(333);
ob3.setName("Faisal");
System.out.println("ID : "+ob3.getId());
System.out.println("Name : "+ob3.getName());
StudentA1 ob4=new StudentA1();
ob4.setId(444);
ob4.setName("Durga");
System.out.println("ID : "+ob4.getId());
System.out.println("Name : "+ob4.getName());
StudentA1 ob5=new StudentA1();
ob5.setId(555);
ob5.setName("Sameer");
System.out.println("ID : "+ob5.getId());
System.out.println("Name : "+ob5.getName());
}
}