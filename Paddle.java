package edu.neumont.csc150.Pong.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Paddle implements KeyListener{
	
	private int locationY, width, height, yVeloc;
	private boolean isLeft;
	
	public Paddle() {}
	
	public Paddle(boolean isLeft, int width, int height) {
		this.setSide(isLeft);
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
	
	public int setLocationX(int width, boolean isLeft){
		if(isLeft == true){
			return width / 25;
		}else{
			return width - 2 * (width / 25);
		}
	}
	
	public void shape(int frameWdith){
		
	}

	@Override
	public void keyPressed(KeyEvent ke) {
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