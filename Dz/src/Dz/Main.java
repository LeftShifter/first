package Dz;

import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите числитель:(первая дробь)");
		int a1 = sc.nextInt();
		System.out.println("Введите знаменатель:(первая дробь)");
		int b1 = sc.nextInt();
		
		System.out.println("Введите числитель:(вторая дробь)");
		int a2 = sc.nextInt();
		System.out.println("Введите знаменатель:(вторая дробь)");
		int b2 = sc.nextInt();
		
		Drob drob12 = new Drob(a1,b1,a2,b2);
		System.out.println("Выберите операцию:\n1.Деление\n2.Умножение\n3.Вычитание\n4.Сложение");
		int f = sc.nextInt();
		if (f==1){
		drob12.divinity();
		}
		if (f==2){
		drob12.multiplication();
		}
		if (f==3){
		drob12.subtraction();
		}
		if (f==4){
		drob12.addition();
		}
		
	}
}
