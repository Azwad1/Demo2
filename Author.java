class Author{
String authorName;
int age;
String place;
Author (String name ,int age ,String place){
this.authorName = name;
this.age = age;
this.place = place;
}
}
class Book{
String name;
int price ;
Author author;
Book(String name,int price,Author author){
this.name = name;
this.price = price;
this.author = author;
}
public static void main(String args[]){
Author author = new Author("Jhon",42,"USA");
Book b = new Book("Java for Beginers",800,author);
System.out.println("Book name : " +b.name);
System.out.println("Book price : "+b.price);
System.out.println("--------Author Details---------");
System.out.println("Author Name : "+b.author.authorName);
System.out.println("Author Age : "+b.author.age);
System.out.println("Author Place : "+b.author.place);
}
}