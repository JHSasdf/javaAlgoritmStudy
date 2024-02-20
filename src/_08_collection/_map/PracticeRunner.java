package _08_collection._map;

import java.util.*;

public class PracticeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        while(true) {
            System.out.print("이름 입력: ");
            String inputName = scanner.nextLine();
            if (inputName.equals("종료")) {
                break;
            }
            System.out.print("나이 입력: ");
            int inputInt = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기
            map.put(inputName, inputInt);

        }
        scanner.close();
        System.out.println("입력 받은 이름과 나이 목록");
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        // entryIterator.next(); 메소드를 쓰면 next가 바로 넘어간다.
        while(entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
//            for(Map.Entry<String, Integer> entry: entrySet) {
//            System.out.printf("이름: %s , 나이: %d \n", entry.getKey(), entry.getValue());
//        }
    }
}
