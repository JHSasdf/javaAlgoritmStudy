package _05_class._07_interface;

public class MusicRunner {
    public static void main(String[] args) {
        Music mp3Player = new Mp3Player();
        System.out.println(" ===MP3 Player===");
        mp3Player.play("아이유 블루밍");
        mp3Player.stop("아이유 블루밍");

        Music cdPlayer = new CdPlayer();
        System.out.println();
        System.out.println(" ===CD Player===");
        cdPlayer.play("아이유 마음");
        cdPlayer.stop("아이유 마음");
    }
}
