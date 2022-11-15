package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {
	public static void main(String[] args) throws Exception {	//예외처리 필요
//		Hello hello = new Hello();
//		hello.main();	//private일 경우 외부 호출 불가
		
		//그런데 왜 매핑했을 때는 호출이 되었는가?
		//Reflection API를 사용했기 때문 - 클래스 정보를 얻고 다룰 수 있는 강력한 기능 제공
		//java.lang.reflect패키지를 제공
		//Hello클래스의 Class객체(클래스의 정보를 담고 있는 객체)를 얻어온다.
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		//반환파일이 오브젝트이기 때문에 형변환 필요
		Hello hello = (Hello)helloClass.newInstance(); //Class객체가 가진 정보로 객체 생성
		Method main = helloClass.getDeclaredMethod("main"); //main 메소드의 정보를 가져옴
		main.setAccessible(true); //private인 main()을 호출가능하게 한다.
		
		main.invoke(hello); //hello.main()과 동일
	}
}
