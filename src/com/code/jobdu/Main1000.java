package com.code.jobdu;

/**
 * http://ac.jobdu.com/problem.php?pid=1000
 * @author xiaochen
 *
 *题目描述：
	求整数a，b的和。
	输入：
	测试案例有多行，每行为a，b的值。
	输出：
	输出多行，对应a+b的结果。
	样例输入：
	1 2
	4 5
	6 9
	样例输出：
	3
	9
	15
	
	提交格式：
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
