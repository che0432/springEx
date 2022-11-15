package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. 원격 호출 가능한 프로그램으로 등록
@Controller
public class Hello {
	int iv = 10;		//인스턴스변수
	static int cv = 20; //static변수
	
	// 2. URL과 메서드를 연결
	@RequestMapping("/hello")	//private도 static도 인스턴스도 상관없이 호출 가능
	private void main() {		//인스턴스 메소드 - iv, cv를 둘 다 사용가능
		System.out.println("Hello - private");
		System.out.println(cv);	//ok
//		System.out.println(iv); //ok
	}
	
	public static void main2() { //static 메소드 - cv만 사용가능
		System.out.println(cv);	//ok
//		System.out.println(iv); //error
	}
}