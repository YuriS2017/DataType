package info.sjd.numbers;

import java.util.ArrayList;
import java.util.logging.Logger;

public class AppRunner {
	
	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	
	public static void main(String[] args) {
		
		int number = 12345;
		int firstMultiplayer = 1000;
		int secondMultiplayer = 9999;
		
		logger.info("Summa numbers: " + findSum(number));
		logger.info("Max number palindrom " + findMaxPalindrom(firstMultiplayer, secondMultiplayer));
		
	}
	
	public static int findSum(int number) {
		int sum = 0;
		
		while(number > 1) {
			sum += (number % 10);
			number = number / 10;
		}
		return sum + number;
	}
	
	public static long findMaxPalindrom(int firstMultiplayer, int secondMultiplayer) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		long palindrom = 0;
		
		for(int i = firstMultiplayer; numbers.size() < (secondMultiplayer - firstMultiplayer); i++) {
			numbers.add(i);
		}
		
		for(int i = 0; i < numbers.size(); i++) {
			for(int j = 0; j < numbers.size(); j++) {
				long multiplicationResult = (long) numbers.get(i) * (long) numbers.get(j);
				if(checkPalindrom(multiplicationResult)) {
					if(multiplicationResult > palindrom) {
						palindrom = multiplicationResult;
					}
				}
			}
		}
		
		return palindrom;
	}
	
	private static boolean checkPalindrom(long number) {
		
		char[] palindrom = String.valueOf(number).toCharArray();
		int start = 0;
		int end = palindrom.length - 1;
		boolean flag = false;
		
		while(start < end) {
			if(palindrom[start] == palindrom[end]) {
				start++;
				end--;
				flag = true;
			}
			else {
				return false;
			}
		}
		
		return flag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
