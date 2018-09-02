package com.jay.test.learn;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Apple g = new Apple();
Apple r = new Apple();
Apple b = new Apple();
Apple y = new Apple();
g.setColor("green"); r.setColor("red"); b.setColor("blue");y.setColor("yellow");
g.setWeight(5);r.setWeight(6);b.setWeight(17);y.setWeight(8);
List<Apple> list = new ArrayList<Apple>();
list.add(g);list.add(r);list.add(b);list.add(y);
MainJava8 MainJava8 = new MainJava8();

System.out.println("10 + 5 = " + MainJava8.operate(10, 5, MainJava8.addition));

System.out.println("10 - 5 = " + MainJava8.operate(10, 5, MainJava8.subtraction));

System.out.println("10 X 5 = " + MainJava8.operate(10, 5, MainJava8.multliplication));

System.out.println("10 / 5 = " + MainJava8.operate(10, 5, MainJava8.division));

System.out.println("2 sqre 16 = " + MainJava8.operate(2, 16, MainJava8.square));

System.out.println("apple Comparision "+MainJava8.compareApple(g, r, MainJava8.byWeight) );

System.out.println("apple maxWeight "+MainJava8.appleOperation(list, MainJava8.maxWeight).getColor() );	
	}
	
	Calculation addition = (int a, int b) -> a+b;
	Calculation subtraction = (int a, int b) -> a-b;
	Calculation multliplication = (int a, int b) -> a*b;
	Calculation division = (int a, int b) -> a/b;
	Calculation square = (int a, int b) -> {double d1 = a; double d2 = b; 
	double d3 = Math.pow(d1, d2);
	return (int) d3;
	};
	
	
	private int operate(int a, int b, Calculation Operation) {
	 return Operation.operate(a, b);
	   }
	
	interface Calculation {
	      int operate(int a, int b);
	   }
	
	
	interface AppleComparision<T>{
		int doCompare(Apple a, Apple b);
	}
	
	private int compareApple(Apple a, Apple b ,AppleComparision<Apple> comparision){
		return comparision.doCompare(a, b);
	}
	
	AppleComparision<Apple> byWeight = (Apple a, Apple b) -> a.getWeight()-b.getWeight();

	interface IAppleOperation<T>{
		Apple Operation(List<Apple> al);
	}
	
	private Apple appleOperation(List<Apple> al, IAppleOperation<Apple> iAppleOperation){
		return iAppleOperation.Operation(al);
	}
	
	IAppleOperation<Apple> maxWeight = (List<Apple> al) -> {
		Apple a = null;
		if(al.size() > 0)a = al.get(0);
		for(int j = 1; j < al.size() ; j++){
					if(a.getWeight() < al.get(j).getWeight()){a = al.get(j);}
		}
		return a;
	};
}
class Apple{
	public String color;
	public int weight;
	public Apple(){}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}