public class Java100_variable_HelloWorld3 {
	public static void main(String[] args) {
		System.out.println( "Hello World~" );
	}
}

접근제한자    클래스선언    클래스이름 {
	접근제어자    static     반환타입    메인메서드( 문자열 배열  변수명) {
		
	}
}

(1) 메인메서드 --> main() --> 만약 다르게 작성하면 기본 메서드를 찾을 수 없다라고 에러 발생 --> 기본 메서드(main) 작성하라고 함.
				--> 자바 프로그램이 실행되면 제일 먼저 메인 메서드를 찾아서 실행.
				--> 길게 작성된 소스에서 그 프로그램의 시작이 어딘지 알 수 없으면 안되므로 시작점을 알려주는 용도 --> entry point --> main()

(2) 파라미터스 --> 메서드(함수) 호출시 하나 or 둘 이상의 파라미터 값을 넣어서 호출할 수 있음.
				--> 그러한 인수(파라미터)들의 값을 저장할 변수(바구니)들을 명시.
				--> String --> 문자열 --> [] 배열 --> args --> argument(논의, 논쟁, 언쟁, 말다툼, 주장; 인수, 독립 변수)
				--> args는 하나의 변수명일 뿐이므로 임의의 이름을 지정해도 무방.
				
(3) 반환할타입 --> return type --> 반환할 값이 있냐? 없냐? --> 없으면 void(빈 공간, 공허함, empty)
				--> 이 메서드(함수)는 호출하면 결과로써 특별히 반환되는 값은 없이 수행되는 메서드.