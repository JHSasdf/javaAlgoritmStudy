package _08_collection._set;

// Set
// - 저장 순서 유지 x
// - 객체 중복 저장 불가능
// - 하나의 'null'값만 저장 가능
// - 수학에서의 집합과 유사한 개념 (순서 상관x, 중복 허용 x)\
// - 요소 순서를 저장하지 않기 떄문에 메소드에 인덱스를 매개값으로 갖는 메소드가 없음

// HashSet
// - Set 컬렉션 중에서 가장 많이 사용되는 컬렉션
// - 동일한 객체 (동등 객체)는 중복 저장 하지 않음
// - 다른 객체더라도 'hashCode()' 메소드의 리턴 값이 같고 'equals()'메소드가 'true'를 return 하면 동일한 객체라고 판단 

// TreeSet
// - 검색 기능을 강화시킨 컬렉션
// - 이진 트리를 기반으로 한 Set 컬렉션
// - 이진 트리: 여러 개의 노드가 트리 형태로 연결된 구조로 root 노드라는 하나의 노드에서 시작해서 각 노드에 최대 2개의 노드를 연결할 수 있음
// 주의. 검색 관련 메소드는 TreeSet에만 정의되어 있어 Set 타입보다는 TreeSet 타입으로 선언하는 게 좋음
/*
    Set<E> treeSet = new TreeSet<>(); // (X)
    TreeSet<E> treeSet = new TreeSet<>(); // (O)
* */
public class Course {
    private int id;
    private String title;

    public Course(int id, String title) {
        this.id = id;
        this.title = title;
    }
    
    @Override
    public int hashCode() {
        // title은 String이므로 hashCode()사용
        // id는 int이므로 정수 값의 해시 코드에 더하기 연산
        return title.hashCode() + id;
    }

    // id, title 값이 같으면 true 리턴
    @Override
    public boolean equals(Object that) {
        // 여기서 that instanceof Course는 that 객체가 Course 클래스의 인스턴스인지를 확인합니다.
        // 그리고 target이라는 변수에 그 인스턴스를 형변환하여 저장합니다.
        if(that instanceof Course target) {
            // id는 int라서 ==비교
            // title은 String 이므로 equals 비교
            return target.id == id && target.title.equals(title);
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Course {" + "id=" + id + ", title'" + title + '\'' + "}";
    }
    // id와 title 값이 같으면 동일한 hashCode 리턴하도록
    // - 참고 hashCode란?
    // - hashCode: 객체의 메모리 주소를 기반으로 한 정수 값의 해시 코드
    // - hashCode() 메소드: Object 클래스에 정의되어 있으며, 객체의 해시 코드를 반환하는 역할
    // - 클래스에서 hashCode() 재정의: 객체의 내부 상태를 기반으로 고유한 해시 코드를 생성 가능


}
