class C{
C(){
this(5);
System.out.println("hello a ");}
C(int x){
System.out.println(x);
}
}
class TestThis6{
public static void main(String args[]){
C c = new C();
}
}