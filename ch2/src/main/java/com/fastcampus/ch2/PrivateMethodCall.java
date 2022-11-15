package com.fastcampus.ch2;

import java.lang.reflect.Method;

public class PrivateMethodCall {
	public static void main(String[] args) throws Exception {	//����ó�� �ʿ�
//		Hello hello = new Hello();
//		hello.main();	//private�� ��� �ܺ� ȣ�� �Ұ�
		
		//�׷��� �� �������� ���� ȣ���� �Ǿ��°�?
		//Reflection API�� ����߱� ���� - Ŭ���� ������ ��� �ٷ� �� �ִ� ������ ��� ����
		//java.lang.reflect��Ű���� ����
		//HelloŬ������ Class��ü(Ŭ������ ������ ��� �ִ� ��ü)�� ���´�.
		Class helloClass = Class.forName("com.fastcampus.ch2.Hello");
		//��ȯ������ ������Ʈ�̱� ������ ����ȯ �ʿ�
		Hello hello = (Hello)helloClass.newInstance(); //Class��ü�� ���� ������ ��ü ����
		Method main = helloClass.getDeclaredMethod("main"); //main �޼ҵ��� ������ ������
		main.setAccessible(true); //private�� main()�� ȣ�Ⱑ���ϰ� �Ѵ�.
		
		main.invoke(hello); //hello.main()�� ����
	}
}
