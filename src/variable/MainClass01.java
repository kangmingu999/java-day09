package variable;
/*
클래스 변수 - 클래스가 메모리에 올라갓을 경우 생성된다
인스턴스 변수 - 인스턴스(객체)가 생성될 때 생성된다
지역 변수 - 해당 지역이 실행될 때 생성된다
*/
public class MainClass01 {
	public static void main(String[] args){
		String name = "홍길동";
		if(true) {
			//String n2 = "김길이";
			name = "김개똥";
		}
		//System.out.println( n2 );
		System.out.println( name );
	}
}










