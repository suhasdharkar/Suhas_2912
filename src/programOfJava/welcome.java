package programOfJava;

public class welcome {
	
	public static void main(String[] args) {
		String as= "welcome";
		int b=as.length();
		for (int a=0;a<=b-1;a++)
		{
			char ch=as.charAt(a);
			
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("vovel= " +ch);
			}
			else {
				System.out.println("consonant= " +ch);
			}
		}
	
	}

}
