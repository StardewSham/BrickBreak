import java.awt.Graphics;
import java.awt.*;
/*
*Melike Yildirim
*1.2.2025
*This sets up the paddle
*i didn't think the project would be this easy wow i really need to do my assignments more often
*i think the most annoying thing about this was either the pre and post conditions, reading through your code, or the velocity, although i think i like the latter way more. it's not as boring blah blah blah
*complaint complaint complaint complaint complaint complaint complaint
*/

//need to add pre and post conditions

//velocity and all that jazz


public class Paddle {

	//your code here!
	private int x;
	private int y; 
	private int width;
	private int height;
	private int velocity;

	public Paddle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width=width;
		this.height=height;
		this.velocity=0;
	}
	//don't forget you need instance variables:
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getHeight(){
		return height;
	}
	public int getWidth(){
		return width;
	}
	public int getVelocity() {
        return velocity;
    }
	public void setX(int x) {
        this.x = x;
    }
	public void setVelocity(int velocity) {
        this.velocity = velocity;
    }
	public void addVelocity(int velocity){
		this.velocity+=velocity;
	}
	public void move(){
		x+=velocity;
		if (x<0){
			x=0;
		}
		if (x+width>682){
			x=682-width;
		}
	}
	public void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(x,y,width,height);
	}
	//constructor(s):
	
	//methods:
	
	
}
