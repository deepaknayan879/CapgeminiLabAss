import java.util.Scanner;
class LabNo3Ex2{
public String getImage(String str)
{
 StringBuffer sbr = new StringBuffer(str);
 sbr.append('|');
 StringBuffer sb = new StringBuffer(str);
 sb.reverse();
 sbr.append(sb);
 return sbr.toString();
 }
 public static void main(String[] ar)
 {
 LabNo3Ex2 L = new LabNo3Ex2();
 Scanner s = new Scanner(System.in);
 System.out.println("Enter a String");
 String str = s.next();
 System.out.println(L.getImage(str));
 }
}