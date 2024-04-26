package programers;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Pro_호텔대실 {
    public static void main(String[] args) {
        System.out.println(solution(new String[][] {{"10:50", "11:10"}, {"10:20", "10:40"}, {"10:00", "10:10"}}));
    }
    public static int solution(String[][] book_time) {
        int answer = 1;
        List<MeetingHo> meet = new ArrayList<>();
        for(String[] book : book_time) {
            meet.add(new MeetingHo(book[0], book[1]));
        }
        meet.sort((o1, o2) -> {
            if(o1.start == o2.start) {
                return o1.end - o2.end;
            }
            return o1.start - o2.start;
        });
        PriorityQueue<MeetingHo> pq = new PriorityQueue<>((o1, o2) -> {
            return o1.end - o2.end;
        });

        for(MeetingHo m: meet) {
            if(pq.isEmpty()) {
                pq.offer(m);
                continue;
            }
            while(!pq.isEmpty() && ((pq.peek().end % 100 >= 50) ?
                    pq.peek().end / 100 * 100 + 100 + pq.peek().end % 10 : pq.peek().end + 10) <= m.start) pq.poll();
            pq.offer(m);
            answer = Math.max(answer, pq.size());
        }

        return answer;
    }
}

class MeetingHo {
    int start;
    int end;

    public MeetingHo(String start, String end) {
        this.start = Integer.parseInt(start.substring(0,2) + start.substring(3,5));
        this.end = Integer.parseInt(end.substring(0,2) + end.substring(3,5));
    }
}