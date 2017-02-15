package edu.neumont.csc150.Pong.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Ball extends JPanel {
	
	private int frameWidth, frameHeight, diameter = frameWidth / 25, locationX = frameWidth / 2, locationY = frameHeight / 2, xVeloc = 5, yVeloc = 5;
	
	public int getDiameter(){
		return diameter;
	}	
	public void setDiameter(int diameter){
		this.diameter = diameter;
	}
	
	public int getLocationX(){
		return locationX;
	}	
	public void setLocationX(int locationX){
		this.locationX = locationX;
	}
	
	public int getLocationY(){
		return locationY;
	}	
	
	public void setLocationY(int locationY){
		this.locationY = locationY;
	}
	
	/**
	 * @return the frameWidth
	 */
	public int getFrameWidth() {
		return frameWidth;
	}
	/**
	 * @param frameWidth the frameWidth to set
	 */
	public void setFrameWidth(int frameWidth) {
		this.frameWidth = frameWidth;
	}
	/**
	 * @return the frameHeight
	 */
	public int getFrameHeight() {
		return frameHeight;
	}
	/**
	 * @param frameHeight the frameHeight to set
	 */
	public void setFrameHeight(int frameHeight) {
		this.frameHeight = frameHeight;
	}
	
	/**
	 * @return the xVeloc
	 */
	public int getxVeloc() {
		return xVeloc;
	}
	/**
	 * @param xVeloc the xVeloc to set
	 */
	public void setxVeloc(int xVeloc) {
		this.xVeloc = xVeloc;
	}
	/**
	 * @return the yVeloc
	 */
	public int getyVeloc() {
		return yVeloc;
	}
	/**
	 * @param yVeloc the yVeloc to set
	 */
	public void setyVeloc(int yVeloc) {
		this.yVeloc = yVeloc;
	}
	
	public Rectangle getBounds(){
		return new Rectangle(locationX, locationY, diameter, diameter);
	}
	
	public void collision(Paddle p){
		if(this.getBounds().intersects(getBounds(p.getBounds()))){
			yVeloc *= -1;
			xVeloc *= -1;
		}
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.WHITE);
		g.fillRect(locationX, locationY, diameter, diameter);
	}
}