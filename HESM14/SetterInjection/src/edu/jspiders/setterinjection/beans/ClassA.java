package edu.jspiders.setterinjection.beans;

public class ClassA {
	
	public ClassA() {
		System.out.println(this.getClass().getSimpleName()+" Object Created");
	}

	int x,y;
	String s;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "ClassA [x=" + x + ", y=" + y + ", s=" + s + "]";
	}
}
