package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

//나이순 정렬
public class Q10814 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		List<Person> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			Person p = new Person();
			StringTokenizer st = new StringTokenizer(reader.readLine());
			p.id = i;
			p.age = Integer.parseInt(st.nextToken());
			p.name = st.nextToken();
			list.add(p);
		}
		
		Collections.sort(list);
		
		for(Person p : list)
			System.out.println(p.age+" "+p.name);
	}

}
class Person implements Comparable<Person>{
	int id;
	int age;
	String name;
	
	@Override
	public int compareTo(Person o) {
		int r = this.age - o.age;
		if(r==0)
			r = this.id = o.id;
		return r;
	}
	
}