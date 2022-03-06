package com.capgemini;

public abstract class Shape {
 String color="red";
 boolean filled=true;


public Shape() {
	super();
}

public Shape(String color, boolean filled) {
	super();
	this.color = color;
	this.filled = filled;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public boolean isFilled() {
	return filled;
}

public void setFilled(boolean filled) {
	this.filled = filled;
}

public abstract void getArea();
public abstract void getPerimeter();


}
