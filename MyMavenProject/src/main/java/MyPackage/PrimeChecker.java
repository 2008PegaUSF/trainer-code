package MyPackage;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.config.Configurator;

public class PrimeChecker {
	
	public static boolean isPrime(int num) {
		if (num <= 1) return false;
		
		for (int i = 2; i <= ( num / 2 ); ++i) {
			if (num % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Configurator.initialize(null, "log4j2.xml");
		Logger log = LogManager.getLogger(PrimeChecker.class);
		
		log.error("Error!");
	}
}
