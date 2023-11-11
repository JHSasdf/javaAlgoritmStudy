
package UDEMY_JAVA.javaWorkSpace;

public class multiplication_Table_01 {
    public static void main(String[] args) {

        method table = new method();
//   여기서 쓰인 method는 클래스명.. (옆에 있는 파일) 그리고 class의 instance인 table을 만든 것이라고 생각하면 될까..?
        table.print();
        table.helloWorldTwice(3,4);
        table.helloWorldTwice(3,4,7);


    }
}
