package test1;

import java.util.Scanner;
public class fei {

		public static void main(String[] args) {
			//�����n���ֵ
			Scanner scan = new Scanner(System.in);
			System.out.println("����������:");//������������
			int n = Integer.parseInt(scan.nextLine().trim());
			
			System.out.println("��"+n+"���ֵΪ:");
			
			int count = 1;
			int Fn_1 = 1;//��һ���ֵ
			int Fn_2 = 1;//�ڶ����ֵ
			while (n > 2) {
				Fn_2 = Fn_1;
				Fn_1 = count;
				count = Fn_1 + Fn_2;
				n--;
				
			}
			//������n���ֵ:
			System.out.println(count);
		}
	}
	

