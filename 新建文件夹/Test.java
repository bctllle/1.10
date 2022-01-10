package Duoxiancheng;
public class Test implements Runnable{
//public class Test extends Threads{
	String 
	getName1="兔子";
	String getName="乌龟";
	private static String winner;
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for (int i = 0; i <= 100; i++) {
		if(Thread.currentThread().getName().equals("兔子")&&i%10==0) {
			
		}
	boolean flag=gameover(i);
	if(flag) {
		break;
	}
		System.out.println(Thread.currentThread().getName()+"跑了"+i+"步");
		
		}
	}
     private boolean gameover(int step) {
    	 if(winner!=null) {
    		 return true;
    	 }
    	 {
    	 if(step==100) {
    			 winner=Thread.currentThread().getName();
    	
    			System.out.println("Winner is"+winner);
    	    return true;
    	 }
     }
    	 return false;
    
	}

         public static void main(String[] args) {
			Test test=new Test();
			new Thread(test,"兔子").start();
			new Thread(test,"乌龟").start();
			
			//test.start();
			
		}
}
