package edu.neumont.csc150.Pong.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Paddle extends JPanel implements KeyListener {
	
	private int frameWidth, frameHeight, locationX, locationY = frameHeight / 2, width = frameWidth / 25, height = frameHeight / 5, yVeloc = 5;
	private boolean isLeft;
	
	public Paddle() {}
	
	public Paddle(boolean isLeft, int width, int height, int yVeloc, int frameWidth, int frameHeight) {
		this.setSide(isLeft);
		this.setWidth(width);
		this.setHeight(height);
		this.setYVeloc(yVeloc);
		this.setFrameWidth(frameWidth);
		this.setFrameHeight(frameHeight);
	}
	
	/**
	 * @return the locationX
	 */
	public int getLocationX() {
		return locationX;
	}

	/**
	 * @param locationX the locationX to set
	 */
	public void setLocationX(int locationX) {
		if(isLeft == true){
			locationX = frameWidth / 25;
		}else{
			locationX = frameWidth - 2 * (frameWidth / 25);
		}
		this.locationX = locationX;
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

	public boolean isLeft(){
		return this.isLeft();
	}
	
	public void setSide(boolean isLeft){
		this.isLeft = isLeft;
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public void setWidth(int width){
		this.width = width;
	}

	
	public int getHeight(){
		return this.height;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public int getLocationY(){
		return locationY;
	}	
	public void setLocationY(int locationY){
		this.locationY = locationY;
	}
	
	public int getYVeloc(){
		return this.yVeloc;
	}
	
	public void setYVeloc(int yVeloc){
		this.yVeloc = yVeloc;
	}
	
	public Rectangle getBounds(){
		return new Rectangle(locationX, locationY, width, height);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.WHITE);
		g.fillRect(locationX, locationY, width, height);
	}

	@Override
	public void keyPressed(KeyEvent ke) {
		if(isLeft == true){
			if(ke.getKeyLocation() == KeyEvent.VK_W){
				this.locationY += yVeloc;
			}else if(ke.getKeyLocation() == KeyEvent.VK_S){
				this.locationY -= yVeloc;
 			}
		}else if(isLeft == false){
			if(ke.getKeyLocation() == KeyEvent.VK_UP){
				this.locationY += yVeloc;
			}else if(ke.getKeyLocation() == KeyEvent.VK_DOWN){
				this.locationY -= yVeloc;
			}
		}		
	}

	@Override
	public void keyReleased(KeyEvent ke) {
		if(isLeft == true){
			if(ke.getKeyLocation() == KeyEvent.VK_W){
				
			}else if(ke.getKeyLocation() == KeyEvent.VK_S){
				
			}
		}else if(isLeft == false){
			if(ke.getKeyLocation() == KeyEvent.VK_UP){
				
			}else if(ke.getKeyLocation() == KeyEvent.VK_DOWN){
				
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent ke) {}
	
}