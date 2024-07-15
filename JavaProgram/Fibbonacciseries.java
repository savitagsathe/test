
public class Fibbonacciseries {

	public static void main(String[] args) {
        
		int n=7;
		
		int firstTerm=0, secondTerm=1,nextTerm;
		System.out.println("Fibonacci Series up to " + n + " terms:");
		
		for(int i=1;i<=n;i++) {
		System.out.print(firstTerm + ", ");	
		nextTerm=firstTerm+secondTerm;
		firstTerm=secondTerm;
		secondTerm=nextTerm;
		
		}

	}

}
