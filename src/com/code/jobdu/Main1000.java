package com.code.jobdu;

/**
 * http://ac.jobdu.com/problem.php?pid=1000
 * @author xiaochen
 *
 *��Ŀ������
	������a��b�ĺ͡�
	���룺
	���԰����ж��У�ÿ��Ϊa��b��ֵ��
	�����
	������У���Ӧa+b�Ľ����
	�������룺
	1 2
	4 5
	6 9
	���������
	3
	9
	15
	
	�ύ��ʽ��
	import java.util.*;
	public class Main {
		public static void main(String args[]) {
			Scanner cin = new Scanner(System.in);
			int a, b;
			while (cin.hasNext()) {
				a = cin.nextInt(); 
				b = cin.nextInt();
				System.out.println(a + b);
			}
		}
	}
 */

import java.util.*;
public class Main1000 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a, b;
		while (cin.hasNext()) {
			a = cin.nextInt(); 
			b = cin.nextInt();
			System.out.println(a + b);
			Vector<Integer> v = new Vector<Integer>();
			new Vector<Integer>(v);
			v.removeElementAt(v.size()-1);
			List<List<Integer>> result = new ArrayList<List<Integer>>();
			List v2 = new ArrayList();
			
		}
		cin.close();
	}
}
