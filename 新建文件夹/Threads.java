package Duoxiancheng;

public class Threads extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++) {
		System.out.println("����ѧϰ"+i);
		super.run();
	}
		}
	public static void main(String[] args) {
		
		Threads threads=new Threads();
		threads.run();
		for(int i=0;i<20;i++) {
		System.out.println("���Ѿ�ѧ��"+i);
		
	}
	}
}
