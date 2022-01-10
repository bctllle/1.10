package View;
	import java.io.File;
	import java.io.IOException;

	import javax.sound.sampled.AudioFormat;
	import javax.sound.sampled.AudioInputStream;
	import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
	import javax.sound.sampled.FloatControl;
	import javax.sound.sampled.LineUnavailableException;
	import javax.sound.sampled.SourceDataLine;
	import javax.sound.sampled.UnsupportedAudioFileException;
	
	public class Music extends Thread {
	      public static void main(String[] args) {
	           @SuppressWarnings("unused")
	           int musicOpenLab = 1;
	       }
	    private String fileName;
	    private final int EXTERNAL_BUFFER_SIZE = 524288;

	    public Music(String wavFile) {
	        this.fileName = wavFile;
	    }

	    @SuppressWarnings("unused")
	    public void run() {
	        File soundFile = new File(fileName); // �������ֵ��ļ���
	        if (!soundFile.exists()) {
	            System.err.println("Wave file not found:" + fileName);
	            return;
	        }
	       // ����ѭ������
	            AudioInputStream audioInputStream = null; // ������Ƶ����������
	            try {
	                audioInputStream = AudioSystem.getAudioInputStream(soundFile); // ������Ƶ����
	                Clip clip= AudioSystem.getClip();
	                clip.loop(Clip.LOOP_CONTINUOUSLY);
	            } catch (UnsupportedAudioFileException e1) {
	                e1.printStackTrace();
	                return;
	            } catch (IOException e1) {
	                e1.printStackTrace();
	                return;
	            } catch (LineUnavailableException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            AudioFormat format = audioInputStream.getFormat(); // ��Ƶ��ʽ
	            SourceDataLine auline = null; // Դ������
	            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
	            try {
	                auline = (SourceDataLine) AudioSystem.getLine(info);
	                auline.open(format);
	            } catch (LineUnavailableException e) {
	                e.printStackTrace();
	                return;
	            } catch (Exception e) {
	                e.printStackTrace();
	                return;
	            }
	            if (auline.isControlSupported(FloatControl.Type.PAN)) {
	                FloatControl pan = (FloatControl) auline.getControl(FloatControl.Type.PAN);
	            }
	            auline.start();
	            int nBytesRead = 0;
	            byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];
	            try {
	                while (nBytesRead != -1) {
	                    nBytesRead = audioInputStream.read(abData, 0, abData.length);
	                    if (nBytesRead >= 0)
	                        auline.write(abData, 0, nBytesRead);
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	                return;
	            } finally {
	                auline.drain();
	//auline.close();
	            }

	    }
	}





