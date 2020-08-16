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
		System.out.println("�̸� : " + this.name);
		System.out.println("��ȣ : " + this.number);
		System.out.println("���� : " + this.korean);
		System.out.println("���� : " + this.english);
		System.out.println("���� : " + this.math);
		System.out.println("���� : " + GetSum());
		System.out.println("��� : " + GetAvg());
		if(this.rank != 0)
			System.out.println("��� : " + this.rank);
		else
			System.out.println("��� : �����������");
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
		System.out.println("ù��° �л��� �̸� : ");
		String name = sc.next();
		System.out.println("ù��° �л��� ��ȣ : ");
		int number = sc.nextInt();
		student1.SetStudentInfo(name, number);

		System.out.println("�ι�° �л��� �̸� : ");
		name = sc.next();
		System.out.println("�ι�° �л��� ��ȣ : ");
		number = sc.nextInt();
		student2.SetStudentInfo(name, number);

		System.out.println("����° �л��� �̸� : ");
		name = sc.next();
		System.out.println("����° �л��� ��ȣ : ");
		number = sc.nextInt();
		student3.SetStudentInfo(name, number);

		System.out.println("ù��° �л��� ���� ���� : ");
		int korean = sc.nextInt();
		System.out.println("ù��° �л��� ���� ���� : ");
		int english = sc.nextInt();
		System.out.println("ù��° �л��� ���� ���� : ");
		int math = sc.nextInt();
		student1.SetScore(korean, english, math);

		System.out.println("�ι�° �л��� ���� ���� : ");
		korean = sc.nextInt();
		System.out.println("�ι�° �л��� ���� ���� : ");
		english = sc.nextInt();
		System.out.println("�ι�° �л��� ���� ���� : ");
		math = sc.nextInt();
		student2.SetScore(korean, english, math);

		System.out.println("�ι�° �л��� ���� ���� : ");
		korean = sc.nextInt();
		System.out.println("�ι�° �л��� ���� ���� : ");
		english = sc.nextInt();
		System.out.println("�ι�° �л��� ���� ���� : ");
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
