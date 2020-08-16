package p0409;

import java.util.Scanner;

public class ScoreManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[3];
		int[][] score = new int[3][5];
		float[] avg = new float[3];
		String[] subject = { "��ȣ", "����", "����", "����", "����" };

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < name.length; i++) {
			System.out.println(i + 1 + "�� �л��� �̸��� �Է��Ͻÿ�");
			name[i] = sc.next();
		}
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length - 1; j++) {
				System.out.println(name[i] + " �л��� " + subject[j] + "�� �Է� �Ͻÿ�.");
				score[i][j] = sc.nextInt();
			}
			score[i][score[i].length - 1] = score[i][1] + score[i][2] + score[i][3];
			avg[i] = score[i][score[i].length - 1] / 3;
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println(i + 1 + "��° �л�");
			System.out.println("�̸� : " + name[i]);
			for (int j = 0; j < score[i].length ; j++) {
				System.out.println(subject[j] + " : " + score[i][j]);
			}
			System.out.println("��� : " + avg[i]);
		}
		
		float[] sortedAvg = new float[avg.length];
		sortedAvg = avg.clone();
		
		for (int i = 1; i < sortedAvg.length; i++) {
			float temp = sortedAvg[i];
			for (int j = i - 1; j >= 0; j--) {
				if (temp < sortedAvg[j]) {
					sortedAvg[j + 1] = sortedAvg[j];
					if(j==0){
						sortedAvg[0] = temp;
					}
				} else {
					sortedAvg[j + 1] = temp;
					break;
				}
			}
		}

		int[] rankArr = new int[name.length];
		for(int i = 0; i<sortedAvg.length;i++){
			for(int j = 0; j< avg.length;j++){
				if(sortedAvg[i] == avg[j]){
					rankArr[i] = j;
				}
			}
		}
		
		System.out.println("���� ���");
		
		for(int i = rankArr.length-1 ;i >=0 ;i --)
		{
			System.out.println(rankArr.length - i+"��");
			System.out.println((rankArr[i]+1) + "��° �л�");
			System.out.println("�̸� : "+ name[rankArr[i]]);
			for(int j = 0 ;j<score[rankArr[i]].length;j++){
				System.out.println(subject[j] + " : " + score[rankArr[i]][j]);
			}
			System.out.println("��� : " + avg[rankArr[i]]);
		}
		sc.close();
	}
}
