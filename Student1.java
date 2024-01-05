class Student1
{
int rollno;
String name;
static String college = "MTI";
Student1(int r ,String n)
{
rollno = r;
name = n;
}
void display()
{
 System.out.println(rollno+" "+name+" "+college); 
}
}
class TestStaticVariable1
{
public static void main(String args[])
{
Student1 s1 = new Student1(111,"Azwad");
Student1 s2 = new Student1(222,"Azzu");
Student1.college = "M.T.I";
s1.display();
s2.display();
}
}