package View;

import javax.sound.sampled.Clip;
import javax.swing.JFrame;

public class MyView {
	 public static void main(String[] args) {
		 Music audioPlayWave = new Music("");
	        JFrame j=new JFrame();//创建窗口
	        
	      
	        j.setSize(400,650);
	        j.setTitle("Plane");//设置标题
	        j.setLocationRelativeTo(null);//设置居中
	        j.setVisible(true);//显示界面
	      
	        
	        
	         j.setResizable(false); // 设置框架大小为不能改变
	         // 点击关闭按钮 关闭游戏界面
	         j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         
	          
	        
	        	boolean isStarted;
			if(isStarted=false){
				 j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				 // 开音乐 音樂名
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
