package p0408;

public class Fibonacci {
	public static void main(String[] args){
		long[] fibonacciArr = new long[80];
		fibonacciArr[0] = 0;
		fibonacciArr[1] = 1;
		for(int i = 2;i<fibonacciArr.length;i++){
			fibonacciArr[i] = fibonacciArr[i-1]+ fibonacciArr[i-2];
		}
		System.out.println("1¹ø");
		for(int i = 0; i<fibonacciArr.length;i++){
			System.out.print(fibonacciArr[i]+ "\t");
		}
		System.out.println();
		System.out.println("2¹ø");
		long first = 0, second = 1;
		System.out.print(first + "\t" + second + "\t");
		for(int i = 0; i<78;i++){
			long result = first + second;
			System.out.print(result + "\t");
			first = second;
			second = result;
		}
	}
}
