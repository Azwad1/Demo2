class Animal1{
void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
void bark(){System.out.println("barking....");}
}
class BabyDog extends Dog{
void weep(){System.out.println("weeping....");}
}
class BabyCat extends BabyDog{
void scratch(){System.out.println("scratching....");}
}
class TestInheritance1{
public static void main(String args[]){
BabyCat c = new BabyCat();
c.scratch();
c.weep();
c.bark();
c.eat();
}
}