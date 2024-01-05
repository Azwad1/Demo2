class B{
B(){System.out.println("hello a from default constructor");}
B(int x){
this();
System.out.println(x);
}
}
class TestThis5{
public static void main(String args[]){
B b = new B(10);
}
}
