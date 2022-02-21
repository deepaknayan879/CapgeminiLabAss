import java.util.Scanner;
class LabNo3Ex3{
public String afterString(String str){
StringBuffer sbr = new StringBuffer(str);
for(int i=0;i<str.length();i++) {
char c = sbr.charAt(i);
if(!(c == 'A' || c =='a' || c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u'||c=='E'||c=='e'))
{
sbr.replace(i,i+1,String.valueOf((char)(c+1)));
} }
return sbr.toString();
}
public static void main(String[] args) {
LabNo3Ex3 l = new LabNo3Ex3();
Scanner s = new Scanner(System.in);
System.out.println("Enter a string");
String str = s.next();
System.out.println(l.afterString(str));
}
}