package ua.lviv.igs;

public class Application {

	public static void main(String[] args) {
		// 1 ��������� �������� ������

//		int a = 9;
//		int b = 5;
//		
//		int c1 = a + b;
//		int c2 = a - b;
//		int c3 = a * b;
//		int c4 = a / b;
//		
//		System.out.println("a + b = "+ c1);
//		System.out.println("a - b = "+ c2);
//		System.out.println("a * b = "+ c3);
//		System.out.println("a / b = "+ c4);

		// 2 ���������/���������

//		int a = 9;
//		int b = a++;
//		int c = a++;
//		
//		System.out.println(a +" "+ b +" "+ c);

		// 3 �������� � ����������

//		int a = 1;
//		int b = 2;
//		int c = 3;
//		
//		a += 6;
//		b *= 7;
//		c %= 8;
//		
//		System.out.println("a = "+ a);
//		System.out.println("b = "+ b);
//		System.out.println("c = "+ c);

		// 4 ��������� ��������

//		int a = 5;
//		int b = a > 0 ? 4 : 6;
//		System.out.println("a = "+ b);

		// 5 ����� ���������

//		boolean a = true;
//		boolean b = false;
//		boolean c = a | b;
//		boolean d = !a;
//		
//		System.out.println("a = "+ a);
//		System.out.println("b = "+ b);
//		System.out.println("c = "+ c);
//		System.out.println("d = "+ d);

		// 6 ��������� ������

//		int a = 9;
//		int b = 7;
//		
//		String c = (a<b) ? "YES" : "NO";
//		String d = (a==b) ? "YES" : "NO";
//		String e = (a>=b) ? "YES" : "NO";
//		
//		System.out.println("c = " + c);
//		System.out.println("d = " + d);
//		System.out.println("e = " + e);

		// 7 ����������� if - else

//		int a = 9;
//		int b = 7;
//
//		if (a == b) {
//			System.out.println("1");
//		} else {
//			System.out.println("2");
//		}

		// 8 ����������� if - else - if

//		int a = 9;
//		int b = 7;
//
//		if (a == b) {
//			System.out.println("1");
//		} else if (a > b) {
//			System.out.println("2");
//		} else {
//			System.out.println("3");
//		}

		// 9 ����������� switch

//		int a = 9;
//		
//		switch(a) {
//		case 7 : case 8: System.out.println("7, 8");
//		break;
//		case 9: System.out.println("9");
//		default: System.out.println("default");
//		}

		// 10 ���� for

//		for(int i = 1; i < 10; i++) {
//			System.out.println(i);
//		}

		// 11 ���� while

//		int i = 1;
//		
//		while(i < 10) {
//			System.out.println("i = " + i);
//			i++;
//		}

		// 12 ������: �������� � �������� ����� ������

//		int[] a = { 12, 54, 92, 57, 11, 85, 37, 16, 99, 84, 45 };
//
//		int max;
//		int min;
//		int i;
//		
//		for (i = 0; i < a.length; i++) {
//			System.out.println("Array = "+ i +" = "+ a[i]);
//		}
//
//		max = a[0];
//		for (i = 0; i < 11; i++)
//			if (max < a[i]) {
//				max = a[i];
//
//			}
//
//		min = a[0];
//		for (i = 0; i < 11; i++)
//			if (min > a[i]) {
//				min = a[i];
//			}
//
//		System.out.println("Array max = " + max);
//		System.out.println("Array min = " + min);

		// 13 �������� ��������

		System.out.println("Boolean_max = true and Short_min = false");
		System.out.println("Byte_max = " + Byte.MAX_VALUE + " and Byte_min = " + Byte.MIN_VALUE);
		System.out.println("Character_max = " + Character.MAX_VALUE + " and Character_min = " + Character.MIN_VALUE);
		System.out.println("Double_max = " + Double.MAX_VALUE + " and Double_min = " + Double.MIN_VALUE);
		System.out.println("Float_max = " + Float.MAX_VALUE + " and Float_min = " + Float.MIN_VALUE);
		System.out.println("Integer_max = " + Integer.MAX_VALUE + " and Integer_min = " + Integer.MIN_VALUE);
		System.out.println("Long_max = " + Long.MAX_VALUE + " and Long_min = " + Long.MIN_VALUE);
		System.out.println("Short_max = " + Short.MAX_VALUE + " and Short_min = " + Short.MIN_VALUE);

	}

}
