package mock;

public class Newrev {
	public static void main(String[] args) {
		String str="abcd",nstr="";
		 int len=str.length();
		for(int i=len-1;i>=0;--i)
		{ 	char ch=str.charAt(i);
			nstr=nstr+ch;
			
		}
		System.out.println("original= "+str);
		System.out.println("Reverse String= "+nstr);
		
	}

}
