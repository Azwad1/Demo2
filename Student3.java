class Student3
{
int rollno;
String name;
static String college = "MTI";
static void change()
{
college = "M.T.I";
}
Student3 (int r,String n)
{
rollno = r;
name = n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
class TestStaticVariable2
{
public static void main(String args[])
{
Student2 s1 = new Student2(111,"Azwad");
Student2 s2 = new Student2(222,"Azzu");
Student2 s3 = new Student2(333,"A");
s1.display();
s2.display();
s3.dispaly();
}
}
