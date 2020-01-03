package calculatorr;

/**
 * 
 * @author mfakhar 
 * this project use to calculate like find maximum value and find squre and cube
 *
 *@see <a href="mail">mfakharhaysatsamtiah19@gmail.com</a>
 */

public class Calculator {
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return max  the maximum number 
	 */
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };
		int max = 0;
		for (int i = 1; i < arr.length; i++) {
		if (arr[i] > max)
		max = arr[i];
		}
		return max;
		}
	
	/**
	 * 
	 * @param num
	 * @return result squre of any value 
	 * @throws IllegalArgumentException
	 */
		public int square(int num) throws IllegalArgumentException {
		int result = 0;
		if (num > 0 && num < 10) {
		result = num * num;
		} else
		throw new IllegalArgumentException();
		return result;
		}
		/**
		 * 
		 * @param num
		 * @return result which is the cube of number 
		 */
		
		public int Cube(int num)  {
			
			int result=num*num*num;
			return  result;
			}
		
		
		
}
