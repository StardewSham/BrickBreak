/*
*Melike Yildirim
*1.2.2025
*i'm actually submitting this on the 16th cause i want to come in tomorrow and tell you i submitted all my assignments
*while also keeping my promise of turning this in before the test
*i also printed out every single one of the tests
*i'm pulling an all nighter for java cause i need to score at least a 90% on the midterm
*for my very little pride and sanity that is left
*also for my weak grade
*/


import java.awt.*;

//need to add pre and post conditions

//x,y, size

public class Ball {
	//your code here

	//don't forget you need instance variables:
	private int size;
	private int x;
	private int y;
	private int xVelocity = 1;
	private int yVelocity = 1;
	
	//constructor(s):
	public Ball(int x, int y, int size){
		this.x = x;
		this.y =y;
		this.size=size;
	}
	//methods:

	//getters:
	public int getXpos(){
		return x;
	}
	public int getYpos(){
		return y;
	}
	public int getSize(){
		return size;
	}
	public int getXVelocity(){
		return xVelocity;
	}
	public int getYVelocity(){
		return yVelocity;
	}

	//setters
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public void setXVelocity(int xVelo){
		xVelo = xVelocity;
	}
	public void setYVelocity(int yVelo){
		yVelo = yVelocity;
	}

	public void reverseX(){
		xVelocity*=-1;
	}
	public void reverseY(){
		yVelocity*=-1;
	}
	public void move(){
		x += xVelocity;
		y += yVelocity;
	}

	public void draw (Graphics g){
		g.setColor(Color.BLUE);
		g.fillOval(x, y, size, size);
	}
}
