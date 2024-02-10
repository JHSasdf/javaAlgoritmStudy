package data.type;

public class Int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		System.out.println("size:" + Integer.SIZE); // 비트
//		System.out.println("BYTES:" + Integer.BYTES); // 바이트
//		System.out.println("max val: " + Integer.MAX_VALUE); // 2의 size -1승
		long a = (long) Math.pow(2, 31);
		System.out.println(a);
//
//		long i = 555555555555l; // 정수만 주면 Integer로 인식함
//		int newNum = (int) 31l;
//		System.out.println("31l의 int 형변환" + newNum); // implicit cast 암시적 변환: 큰 용기에 작은 내용물을 담는 것 (명시 안해도 알아서 해줌)
//		newNum = (int) i;
//		System.out.println("5555555555의 int 형변환: " + newNum); // explicit cast 명시적 변환 : 작은 용기에 큰 내용물을 담는 것 (수가 깨짐)
//
//		long newlong = (int) Math.pow(3, 2);
//		System.out.println("newlong is: " + newlong);
		int eight = 0113; // 리터럴은 8진수 지원(0으로 시작하면 8진수) 64 + 8 + 3 = 72
		int sixteem = 0x10; // 리럴은 16진수도 지원 (0x로 시작하면 16진수)
		int fifteen = 0xF;
		int big = 0XBBAACC;
		System.out.println("eight: " + eight);
		System.out.println("sixteen: " + sixteem);
		System.out.println("fifteen: " + fifteen);
		System.out.println(big);

		int i = 3456;
		short s = (short) i; // i.는 4바이트고 s.는 2바이트라서 명시적 변환을 해줘야함. 안하면 컴파일러와 충돌 == 내가 short가 더 작은거 알고있으니까
								// short로 변환해서 넣어줘
		System.out.println(s);
		i = s; // i는 4바이트, s는 2바이트라서 암시적 형변환이 됨.
		System.out.println(i);

	}

}
