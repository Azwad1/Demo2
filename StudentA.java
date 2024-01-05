class StudentA{
int rollno;
String name, course;
float fee;
StudentA(int rollno,String name,String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
StudentA(int rollno,String name,String course,float fee){
this(rollno,name,course);
this.fee=fee;
}
void display(){ System.out.println(rollno+" " +name+" " +course+" "+fee);}
}
class TestThis7{
public static void main(String args[]){
StudentA a1=new StudentA(111,"Azwad","java");
StudentA a2=new StudentA(222,"Azzu","java",6000f);
a1.display();
a2.display();
}
}