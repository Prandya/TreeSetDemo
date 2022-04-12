package sorteddemo;

public class Student implements Comparable<Object>  {
	
int rollNo;
String name;
String city;

@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + ", city=" + city + "]";
}

public Student(int rollNo, String name, String city) {
	super();
	this.rollNo = rollNo;
	this.name = name;
	this.city = city;
}

//@Override
//public int compareTo(Object o) {
//	Student s2= (Student) o;
//	return
//	this.city.compareTo(s2.city);
//	
//}

//@Override
//public int compareTo(Object o) {
//	Student s1= (Student) o;
//	return
//	this.name.compareTo(s1.name);
//}

@Override
public int compareTo(Object o) {
	Student s= (Student) o;
	if(this.rollNo==s.rollNo)
		return 0;
	else if (this.rollNo>s.rollNo)
		return 1;
	else 
	return -1;
}

}
