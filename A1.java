class A1{
void m(){System.out.println("Hello m");}
void n(){System.out.println("Hello n");
this.m();
}}
class TestThis4{
public static void main(String args[]){
A1 a = new A1();
a.n();
}}