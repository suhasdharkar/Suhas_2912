package programOfJava;

public class star_shape1 {

	public static void main(String[] args) {
		
		for (int p=1; p<=5; p++)          //op             *
		{                                   //         *     *
			for(int q=5; q>=p; q--)        //       *     *     *
			{                             //     *    *      *     *  
			System.out.print("  ");      //   *     *     *    *     *
			}
		for(int r=1; r<=p; r++) 
		{
						System.out.print(" *  ");
		}
			System.out.println();
		}
	}
}