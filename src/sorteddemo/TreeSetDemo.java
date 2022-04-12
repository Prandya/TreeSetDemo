package sorteddemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		Student sroll=new Student(10,"A","Pune");
		Student sname=new Student(30,"C","Kolhapur");
		Student scity=new Student(20,"B","Mumbai");
		
		System.out.println("Before Sorting");
		
		TreeSetDemo td=new TreeSetDemo();
		System.out.println(sroll);
		System.out.println(sname);
		System.out.println(scity);
		
		System.out.println("After Sorting");


//		By Roll No
		Set ts= new TreeSet<>();
		ts.add(sroll);
		ts.add(sname);
		ts.add(scity);
		
System.out.println(ts);		
		
		
//By Name	
		
//		Set ts1 = new TreeSet();
//		ts1.add(sroll);
//		ts1.add(sname);
//		ts1.add(scity);
//		
//		System.out.println(ts1);
		
//	By City	

//Set ts2 = new TreeSet();
//ts2.add(sroll);
//ts2.add(sname);
//ts2.add(scity);
//System.out.println(ts2);
//		
//		
	}

}
