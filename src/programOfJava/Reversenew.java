package programOfJava;

public class Reversenew {

    public static void main (String[] args) {
        
  String str="Shuas";
  String nstr="";
  char ar[]=str.toCharArray();
  int len=str.length();
for (int i=len-1;i>=0;i--)
{

	nstr=nstr+ar[i];
}
System.out.println(nstr);
   }

}
