//redifining method of a base class in a derived class is method overriding
class Animal3 {
public void eat() {
System.out.println("I can eat");
}
}
class Dog extends Animal3 {
@Override
public void eat() {
System.out.println("I eat dog food");
}
public void bark(){
System.out.println("I can bark");
}
}
class Test3 {
public static void main(String[] args) {
Dog labrador = new Dog();
labrador.eat();
labrador.bark();
}
}
