import java.util.Scanner;
class ReverseStringPolin{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String n;
String rs="" ;
n = sc.next();
int len = n.length()-1;
for (int i = len ; i>=0;i--){
rs=rs+n.charAt(i);
}
System.out.println(rs);
if (n.equals(rs)){
System.out.println("Palindrome");
}
else{
System.out.println("Not a Palindrome");
}
}
}