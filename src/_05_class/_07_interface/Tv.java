package _05_class._07_interface;

public class Tv implements RemoteControl{
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("Tv turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv turn off.");
    }

    @Override
    public void setVolume(int volume) {
        // 인터페이스의 상수 필드를 이용해서 volumn 필드의 값 제한
        if (volume < MIN_VOLUME) {
            this.volume = MIN_VOLUME;
        } else if (volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재볼륨:"  + this.volume);
    }
}
