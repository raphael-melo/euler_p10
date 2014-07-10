package euler_p10;

import java.util.List;

import Util.Util;

public class SummationOfPrimes {

	public static Long sumPrimesUpTo(Long upperLimit){
		List<Long> primes = Util.generateListOfPrimes2(upperLimit);
		
		return Util.sumListOfLongs(primes);
	}
	
	public static void main(String[] args) {
		Long upperLimit = 2000000L;
		System.out.println(sumPrimesUpTo(upperLimit));
	}
}
