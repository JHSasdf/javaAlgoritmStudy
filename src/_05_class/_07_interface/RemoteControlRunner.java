package _05_class._07_interface;

public class RemoteControlRunner {
    // interface도 하나의 타입이므로 변수의 타입으로 사용 가능
    // - interface는 참조 타입 -> null 대입 가능
    public static void main(String[] args) {

    RemoteControl rc; // null
        // rc 변수에 Tv 객체를 대입
        rc = new Tv();
        rc.turnOn();
        RemoteControl.kimchi();
        rc.setVolume(37);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        RemoteControl.kimchi();
        rc.setVolume(-37);
        rc.setVolume(3);
        rc.turnOff();
    }

}
