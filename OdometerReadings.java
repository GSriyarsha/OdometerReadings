import java.io.*;
import java.util.*;
public class OdometerReadings {
	public static int initialiseValues(int len, int input){
		int[] values = {12, 23, 34, 45, 56, 67, 78, 89};
		return previousReadings(values, len, input);
	}
	public static int previousReadings(int[] values, int len, int input){
		int result = 0;
		int reading[] = {};
		int digit = (int) (Math.pow(10, len - 2));
		int verify = (int) (Math.pow(10, len - 1));
		for(int i = 0; i < 7 - (len - 2); i ++){
			if ((input % 10) != 0){
				result = (values[i] * digit) + (input % 10) - 1;
			}
			else if ((Math.floorDiv(input, verify) == 1) && (input % 10) != 0){
				result = (values[7 - (len - 2)] * digit) + values[7 - (len - 2)] - 1;
			}
			reading[i] = result;
			System.out.println(reading[i]);
		}
		return endReadings( values, len, input);
	}
	public static int endReadings(int[] values, int len, int input){
		int result = 0;
		int readings[] = {};
		int digit = (int) (Math.pow(10, len - 2));
		int verify = (int) (Math.pow(10, len - 1));
		for (int i = 0; i < 7 - (len - 2); i ++){
			if ((input % 10) != 0){
				result = (values[i]*digit) + (input % 10) + 1;
				readings[i] = result;
			}
			else if ((Math.floorDiv(input, verify) == 9) && (input % 10) != 0){
				result = (values[7 - (len - 2)] * digit) + values[7 - (len - 2)] + 1;
				readings[i] = result; 
			}
			System.out.println(readings[i]);
		}
		return 1;
		}

	public static void main(String[] args) {
	    int input = Integer.parseInt(args[0]);
	    String inputStr = String.valueOf(input);
	    int len = inputStr.length();
	    int inp = Integer.valueOf(inputStr);
	    initialiseValues(len, inp);
	}
}
