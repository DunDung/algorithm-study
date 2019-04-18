package baekjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

//국영수
public class Q10825 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Student [] students = new Student[n];
		
		for(int i=0; i<n; i++)
			students[i] = new Student(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt());
		
		Arrays.sort(students); 
		
		for(Student s : students)
			System.out.println(s.name);

		scan.close();
//		Set<Student> set  = new TreeSet<>(); //SortedSet을 이용한 풀이
//		
//		for(int i=0; i<n; i++) 
//			set.add(new Student(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt()));
//		
//		Iterator<Student> it  = set.iterator();
//		
//		while(it.hasNext())
//			System.out.println(it.next().name);
	}
}

class Student implements Comparable<Student>{
	String name;
	int korean;
	int english;
	int math;

	public Student(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	@Override
	public int compareTo(Student o) {
		int r = (this.korean - o.korean) * -1; //내림차순
		if(r==0)
			r = this.english - o.english; //오름차순
		if(r==0)
			r = (this.math - o.math) * -1; //내림차순
		if(r==0)
			r = this.name.compareTo(o.name); //오름차순
		return r;
	}
}