package View;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;



public class zidan {
      int x,y;
      public zidan(int a,int b) {
    	  this.x=a;
    	  this.y=b;
      }
      
      public void drawzidan( Graphics g) {
    Image zidan  =new ImageIcon("");
    g.drawImage(zidan,x-19,y-80,null);
}
      public int getX() {
    	  return x;
      }
      public void setX(int x) {
    	  this.x=x;
      }
      public int getY() {
    	  return y;
      }
      public void setY(int y) {
    	  this.y=y;
      }
}