package View;

import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class MyView {
	 public static void main(String[] args) {
		 Music audioPlayWave = new Music("");
	        JFrame j=new JFrame();//��������
	        
	      
	        j.setSize(400,650);
	        j.setTitle("Plane");//���ñ���
	        j.setLocationRelativeTo(null);//���þ���
	        j.setVisible(true);//��ʾ����
	      
	        
	        
	         j.setResizable(false); // ���ÿ�ܴ�СΪ���ܸı�
	         // ����رհ�ť �ر���Ϸ����
	         j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         
	          
	        
	        	boolean isStarted;
			if(isStarted=false){
				 j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				 // ������ ������
	           audioPlayWave.stop();
	        	 
	         }else {
	        	 audioPlayWave.start();
	        	 ((Clip) audioPlayWave).loop(audioPlayWave.countStackFrames());
	         }
	 }
	   

	private void Move() {
		// TODO Auto-generated method stub
		
	}
}
