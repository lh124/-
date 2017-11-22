package com.lh.util;

public class Person  implements Comparable<Person>{
	private int age;
	private String name;
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	@Override
	public int compareTo(Person o) {
		if(this.age>o.age) {
			return -1;
		}else if(this.age<o.age) {
			return 1;
		}else {
			return 0;
		}
		//return this.age-o.age;
		
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
}
