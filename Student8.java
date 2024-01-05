class Student8{
int rollno;
String name;
float fee;
Student8(int rollno, String name, float fee){
this.rollno = rollno;
this.name = name;
this.fee = fee;
}
void display(){ System.out.println(rollno+"  "+name+" "+fee);}
}
class TestThis2{
public static void main(String args[]){
Student8 s1 = new Student8(111,"Azwad",5000.94f);
Student8 s2 = new Student8(112,"Azzu",4500.32f);
s1.display();
s2.display();
}
}