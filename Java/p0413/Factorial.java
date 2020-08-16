package p0413;
class Facto{
	long result = 0;
	int Factori(int x){
		if(x == 1){
			return 1;
		}else{
			return x*Factori(x-1);
		}
	}
	int Facto2(int x){
		int result = 1;
		for(int i =1 ;i<x+1;i++){
			result = result*i;
		}
		return result;
	}
	long Fibonacci2(int x){
		return x + Fibonacci2(x-1);
	}
	long Fibonacci(int x){
		long res = 0;
		for(int i =0 ;i<x ;i++){
			res += i;
		}
		return res;
	}
	long ibo(int x){
		if(x<2){
			return 1;
		}
		else{
			return ibo(x-1)+ibo(x-2);
		}
	}
}
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Facto facto = new Facto();
		int num = facto.Factori(4);
		System.out.println(num);
		
		int num2 = facto.Facto2(4);
		System.out.println(num2);

		long num3 = facto.Fibonacci(50);
		System.out.println(num3);
		
		long num4 = facto.ibo(50);
		System.out.println(num4);
	}

}
