import java.util.Scanner;
class LaNo3Ex5
{
public static void main(String args[])
{
int nl=1,nw=0;           
char ch;
Scanner scr=new Scanner(System.in);
System.out.print("\nEnter File name: ");
String str=scr.nextLine();
LabNo3Ex5 l=new LabNo3Ex5(str);
int n=l.available();
for(int i=0;i<n;i++)
{
ch=(char)l.read();
if(ch=='\n')
nl++;
else if(ch==' ')
nw++;
}
System.out.println("\nNumber of lines : "+nl);
System.out.println("\nNumber of words : "+(nl+nw));
System.out.println("\nNumber of characters : "+n);
}
}