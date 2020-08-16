package p0409;

import java.util.Scanner;

class Student {
	String name;
	int number, korean, english, math, sum, rank;
	double avg;

	void SetStudentInfo(String name, int number) {
		this.name = name;
		this.number = number;
	}

	void SetScore(int korean, int english, int math) {
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	void SetRank(int[] scoreList){
		for(int i = 0; i<scoreList.length;i++){
			if(scoreList[i] == this.sum){
				this.rank = scoreList.length - i;
			}
		}
	}

	int GetSum() {
		this.sum = this.korean + this.english + this.math;
		return this.sum;
	}

	double GetAvg() {
		this.avg = (this.korean + this.english + this.math) / 3;
		return this.avg;
	}
	

	void PrintInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("번호 : " + this.number);
		System.out.println("국어 : " + this.korean);
		System.out.println("영어 : " + this.english);
		System.out.println("수학 : " + this.math);
		System.out.println("총점 : " + GetSum());
		System.out.println("평균 : " + GetAvg());
		if(this.rank != 0)
			System.out.println("등수 : " + this.rank);
		else
			System.out.println("등수 : 계산하지않음");
	}
}

class Sort {
	int[] arr;

	void SetArr(int[] arr) {
		this.arr = arr;
	}

	void InsertSort() {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (temp < arr[j]) {
					arr[j + 1] = arr[j];
					if (j == 0) {
						arr[0] = temp;
					}
				} else {
					arr[j + 1] = temp;
					break;
				}
			}
		}
	}
	int[] GetArr(){
		return arr;
	}

	void PrintArr() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}

public class ScoreManageClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 학생의 이름 : ");
		String name = sc.next();
		System.out.println("첫번째 학생의 번호 : ");
		int number = sc.nextInt();
		student1.SetStudentInfo(name, number);

		System.out.println("두번째 학생의 이름 : ");
		name = sc.next();
		System.out.println("두번째 학생의 번호 : ");
		number = sc.nextInt();
		student2.SetStudentInfo(name, number);

		System.out.println("세번째 학생의 이름 : ");
		name = sc.next();
		System.out.println("세번째 학생의 번호 : ");
		number = sc.nextInt();
		student3.SetStudentInfo(name, number);

		System.out.println("첫번째 학생의 국어 성적 : ");
		int korean = sc.nextInt();
		System.out.println("첫번째 학생의 영어 성적 : ");
		int english = sc.nextInt();
		System.out.println("첫번째 학생의 수학 성적 : ");
		int math = sc.nextInt();
		student1.SetScore(korean, english, math);

		System.out.println("두번째 학생의 국어 성적 : ");
		korean = sc.nextInt();
		System.out.println("두번째 학생의 영어 성적 : ");
		english = sc.nextInt();
		System.out.println("두번째 학생의 수학 성적 : ");
		math = sc.nextInt();
		student2.SetScore(korean, english, math);

		System.out.println("두번째 학생의 국어 성적 : ");
		korean = sc.nextInt();
		System.out.println("두번째 학생의 영어 성적 : ");
		english = sc.nextInt();
		System.out.println("두번째 학생의 수학 성적 : ");
		math = sc.nextInt();
		student3.SetScore(korean, english, math);

		int[] scoreList = new int[3];
		scoreList[0] = student1.GetSum();
		scoreList[1] = student2.GetSum();
		scoreList[2] = student3.GetSum();

		Sort sort = new Sort();
		sort.SetArr(scoreList);
		sort.InsertSort();

		student1.SetRank(scoreList);
		student2.SetRank(scoreList);
		student3.SetRank(scoreList);

		student1.PrintInfo();
		student2.PrintInfo();
		student3.PrintInfo();

		sc.close();

	}

}
