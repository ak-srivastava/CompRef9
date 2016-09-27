package chap5;
//listing 12
//Test for primes.
public class FindPrime {
	
	public static void main(String aa[]){
		int num;
		boolean isPrime;
		num=16;
		if(num<2) isPrime= false;
		else isPrime = true;
		
		for(int i=2;i< num/i; i++){
			if((num%i)== 0){
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) System.out.println("Prime");
		else System.out.println("No Prime");
	}

}
