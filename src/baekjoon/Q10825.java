package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

//±¹¿µ¼ö
public class Q10825 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Student [] students = new Student[n];
		
		for(int i=0; i<n; i++)
			students[i] = new Student(scan.next(), scan.nextInt(), scan.nextInt(), scan.nextInt());
		
		Arrays.parallelSort(students);
		
		for(Student s : students)
			System.out.println(s.name);
		
		scan.close();
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
		int r = (this.korean - o.korean) *-1;
		if(r==0)
			r = this.english - o.english;
		if(r==0)
			r = (this.math - o.math)*-1;
		if(r==0)
			r = this.name.compareTo(o.name);
		return r;
	}
}