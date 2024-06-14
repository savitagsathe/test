package JavaProgram;

public class Squarepattern {
	public static void main(String args[])
	{
		/* Pattern1:
		 ****
         ****
         ****
         ****

		 for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}*/
		
		/*pattern2  
		*
	    **
		***
		****
		

		
		for (int i=0;i<=3;i++)
		{
			for (int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		} */
		
		  /*Pattern3:
		a
		at
		ati
		ativ
		ativa
		ativas

		    
		String s="savita";
		String rev="";
		
		for(int i=1;i<=s.length();i++) {
			rev=rev+s.charAt(s.length()-i);
			System.out.println(rev);
		}
		 */
	 
		
		/*Pattern4:
		*****
		****
		***
		**
		*
		*/

		for (int i=3;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
		

}
