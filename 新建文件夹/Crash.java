package View;

public class Crash {
public boolean Boom(zidan z,Dj d) {
	int zx,zy,dx,dy;
	boolean crash =false;
	zx=z.getX();
	zy=z.getY();
	dx=d.getx();
	dy=d.getY();
	if(dx<zx&&zy-dy<30&&dx+30>zx) {
		crash=true;
	}
	return crash;
}
public boolean Boom2(Dj d,int x,int y) {
	int dx,dy;
	boolean crash=false;
	dx=d.getx();
	dy=d.getY();
	x=x-50;
	y=y-80;
	if(dx>x+20&&y-dy<20&&dx<x+60) {
		
	}
	return crash;
}
}
