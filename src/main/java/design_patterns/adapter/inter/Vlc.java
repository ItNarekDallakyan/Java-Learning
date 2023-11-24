package design_patterns.adapter.inter;

public class Vlc implements MediaPackage{

	@Override
	public void playFile() {
		System.out.println("Playing VLC File");
	}

}
