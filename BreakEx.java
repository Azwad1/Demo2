import java.util.Scanner;
class BreakEx{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
byte i = 0;
//short i = 0;
//int i = 0;
//double i = 0;
while(true){
i++;
if(i%2==0)continue;
System.out.print(i+",");
}
}}