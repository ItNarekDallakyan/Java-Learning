package design_patterns.adapter.inter;

public class Mp4 implements MediaPackage{

	public void playFile(){
		System.out.println("Playing MP4 File");
	}
}
