package p0422;

import java.util.Scanner;

public class StringTest {
	public static void main(String[] args){
		System.out.println("councat() test : " + "abc".concat("def"));
		System.out.println("subString() test : " + "subString".substring(3,9));
		String color = "red, blue, white";
		String arr[] = color.split(" ");
		for(int i =0 ;i<arr.length;i++){
			System.out.println("arr["+ i + "] = "+arr[i]);
		}
		System.out.println("Trim test : " + "abc".trim());
		System.out.println("councat()toLowerCase test : " + "abc".toLowerCase());
		System.out.println("councat()toUpperCase test : " + "abc".toUpperCase());
		System.out.println("lastIndexOf test : " + "abcdefghikj".lastIndexOf("a"));
		System.out.println("Contains() test : " + "On Air".contains("on"));
		System.out.println("replace() test : hello java".replace("java", "world"));
		System.out.println("endsWith() test : " + "abcdefghikj".endsWith("fg"));
		System.out.println("startWith() test : " + "abcdefghikj".startsWith("abc"));
		System.out.println("compareTo() test : " + "abcdefghikj".compareTo("abcdefg"));
		System.out.println("equals() test : " + "abc".equals("abc"));
		
		//금지어 : 십장생, 개나리, 진달래, 꽃놀이, 산책
		//메세지 입력받아서 String에 저장한뒤 금지어를 "삐리리"로 변경해서 출력
		Scanner sc = new Scanner(System.in);
		String[] warnString = {"십장생" ,"개나리", "진달래","꽃놀이","산책"};
		String resultString ="";
		String word = sc.next();
		String[] wordArray = word.split(" ");
		for(String i : wordArray){
			for(String j : warnString){
				if(i.equals(j)){
					i = "삐리리";
				}
			}
			resultString.concat(i);
		}
		System.out.println(resultString);
	}
}
