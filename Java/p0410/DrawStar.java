package p0410;

import java.util.Scanner;

public class DrawStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		for(int i = 0 ; i<num;i++){
			String str = "";
			str = "";
			for(int j = 0; j<num-i-1;j++){
				str += " ";
			}
			for(int k = 0;k<i*2+1;k++){
				str +="*";
			}
			System.out.println(str);
		}
	}

}
