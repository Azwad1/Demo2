import java.util.Scanner;
class Author {
private String name;
private int age;
private String place;
public void setName(String name) {this.name = name;}
public void setAge(int age) { this.age = age;  }
public void setPlace(String place) {this.place = place;}
public String getName() {return this.name;}
public int getAge() {return this.age;}
public String getPlace() {return this.place;}
}
class Book1 {
String name;
int price;
Author author;
Book1(String name, int price, Author author) {
this.name = name;
this.price = price;
this.author = author;
}
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
Book1[] books = new Book1[3];
for (int i = 0; i < 3; i++) {
Author author = new Author();
System.out.println("Enter Author Name for Book " + (i + 1) + ": ");
author.setName(sc.next());
System.out.println("Enter Author Age for Book " + (i + 1) + ": ");
author.setAge(sc.nextInt());
System.out.println("Enter Author Place for Book " + (i + 1) + ": ");
author.setPlace(sc.next());
System.out.println("Enter Book Name for Book " + (i + 1) + ": ");
String bookName = sc.next();
System.out.println("Enter Book Price for Book " + (i + 1) + ": ");
int bookPrice = sc.nextInt();
books[i] = new Book(bookName, bookPrice, author);
}
System.out.println("----------Author Details--------");
for (int j = 0; j < 3; j++) {
System.out.println("Book Name: " + books[j].name);
System.out.println("Book Price: " + books[j].price);
System.out.println("Author Name: " + books[j].author.getName());
System.out.println("Author Age: " + books[j].author.getAge());
System.out.println("Author Place: " + books[j].author.getPlace());
System.out.println("-------------------------");
}
}
}
