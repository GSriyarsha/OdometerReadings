#include <string.h>
#include <bits/stdc++.h> 
using namespace std; 
public class OdometerReadings {
	int initialiseValues(int len, String input){
		int[] values = {12, 23, 34, 45, 56, 67, 78, 89};
		return previousReadings(values, len, input);
	}
	int previousReadings(int[] values, int len, int input){
		int result = 0;
		int reading[] = {};
		int digit = (int) (math.pow(10, len - 2));
		int verify = (int) (math.pow(10, len - 1));
		for(int i = 0; i < 7 - (len - 2); i ++){
			if ((input % 10) != 0){
				result = (values[i] * digit) + (input % 10) - 1;
			}
			else if ((math.floorDiv(input, verify) == 1) && (input % 10) != 0){
				result = (values[7 - (len - 2)] * digit) + values[7 - (len - 2)] - 1;
			}
			reading[i] = result;
			cout << readings[i];
		}
		return endReadings( values, len, input );
	}
	public static int endReadings(int[] values, int len, int input){
		int result = 0;
		int readings[] = {};
		int digit = (int) (math.pow(10, len - 2));
		int verify = (int) (math.pow(10, len - 1));
		for (int i = 0; i < 7 - (len - 2); i ++){
			if ((input % 10) != 0){
				result = (values[i]*digit) + (input % 10) + 1;
				readings[i] = result;
			}
			else if ((math.floorDiv(input, verify) == 9) && (input % 10) != 0){
				result = (values[7 - (len - 2)] * digit) + values[7 - (len - 2)] + 1;
				readings[i] = result; 
			}
			cout << readings[i];
		}
		return 1;
		}

	int main() {
		int input = stoi(argsv[1]);
		string inputStr = atoi(input);
		int len = input.length();
		int inp = stoi(inputStr);
	  initialiseValues(len, inp);
	}
}
