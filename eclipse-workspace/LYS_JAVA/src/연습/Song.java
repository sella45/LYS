package 연습;




public class Song {
	
	String title;
	
	public Song (String a) {
		this.title = a;
	}
	
	String getTitle() {
		return title;
	}
	
	public static void main(String[] args) {
		
		
		Song mySong = new Song("Nessun Dorma");
	    Song yourSong = new Song("공주는 잠 못 이루고");

	     System.out.println("내 노래는 " + mySong.getTitle());
	     System.out.println("너의 노래는 " + yourSong.getTitle());
	

		
		
	}

}
// 필드 : 클래스 안에 있는 변수 