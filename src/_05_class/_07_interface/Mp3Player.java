package _05_class._07_interface;

public class Mp3Player implements Music{
    

    @Override
    public void play(String nameOfSong) {
        System.out.println("MP3 플레이어에서 '" + nameOfSong + "' 음악을 재생합니다." );
    }

    @Override
    public void stop(String nameOfSong) {
        System.out.println("MP3 플레이어에서 '" + nameOfSong + "' 음악을 정지합니다." );
    }
}
