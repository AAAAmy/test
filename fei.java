package test1;

import java.util.Scanner;
public class fei {

		public static void main(String[] args) {
			//输出第n项的值
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入项数:");//请输入项数：
			int n = Integer.parseInt(scan.nextLine().trim());
			
			System.out.println("第"+n+"项的值为:");
			
			int count = 1;
			int Fn_1 = 1;//第一项的值
			int Fn_2 = 1;//第二项的值
			while (n > 2) {
				Fn_2 = Fn_1;
				Fn_1 = count;
				count = Fn_1 + Fn_2;
				n--;
				
			}
			//输出请第n项的值:
			System.out.println(count);
		}
	}
	

