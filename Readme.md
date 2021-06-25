자바 프로그래밍

기초 문제 및 실습 문제

-클래스와 객체 비교

1. 클래스
   객체의 공통된 특징을 기술한 것
   객체의 특성과 행위를 정의

2. 객체
   물리적 공간을 갖는 구체적인 것, 실체
   클래스의 인스턴스(실체)
   클래스를 구체화한 객체를 인스턴스(instance)라고 부름
   객체와 인스턴스는 같은 뜻으로 사

*주의사항*
- 파일명과 클래스명의 일치
- 하나의 파일안에 클래스가 2개이상 있게되면 반드시 public 키워드로 진입(메인)
- 하나의 파일안에 public 클래스는 하나만 있을 수 있다.


Call By Reference: 참조값에 의한 호출(Hash Code)

-메소드로 참조 타입을 전송할 수 있다.

-메소드로 클래스의 객체를 전달하면 메모리가 전달되는 것이 아니라
 객체를 가르키고 있는 Hash Code가 전달됨으로 Call By Reference라고 한다.

-Call By Reference의 경우 참조값(Hash Code)을 전달한 객체는 자신의 참조값이
 전달됨으로 값의 변화가 발생할 수 있고 heap memory를 공유하게 된다.


String 객체의 특징

-한번 생선된 객체는 불변이다. ("안녕" -> (X) "안녕하세요")

-클래스를 객체화할때 new를 사용하지만 String은 사용하지 않아도 된다.
 (String name = "jaewon";

-메모리상에서 같은 문자열을 공유한다.
 
String name = "jaewon";
 
String str = "jaewon";
 
name hashcode와 str hashcode는 같다.

-문자열을 변경할때
 메모리상에는 "안녕"이라는 객체와 "안녕하세요"라는 객체가 둘다 존재
 변경되어지는 객체가 있을때마다 새로운 객체가 만들어진다.

Method Overloading

-같은 클래스 내에서 같은 이름의 메소드를 여러개 선언하는 것을 말한다.

-메소드 이름이 동일하여야 한다.

-메소드의 인자 개수가 서로 다르거나, 메소드의 인자 타입이 서로 달라야한다.

-메소드의 리턴 타입이 다르면 메소드 오버로딩이 성립되지 않고 컴파일 오류.

생성자(Constructor)

-return type이 없습니다.
-클래스 이름과 같아야 한다.(대소문자 구별)

-new를 이용하여 객체를 메모리에 할당한 후 할당된 메로리를 특정 값으로 초기화

-생성자가 없을때 기본생성자를 자동으로 만들어준다.

-생성자 오버로딩 가능


*기본생성자를 선언해야 하는 경우*

-인수를 받는 생성자가 존재하게되면 반드시 기본 생성자를 선언해야 한다.

-기본 생성자는 하는 일이 없어도 반드시 선언을 적극 권장한다.


static 변수(정벅 변수, 클래스 변수), static method(클래스 메소드)

-객체를 만들지 않고 변수나 메소드의 사용이 가능하다.

-보통 간단한 값의 처리시 주로 이용한다.

-일반적인 클래스는 new를 이용하여 메모리를 할당해서 사용하나,
 static 요소들은 클래스가 JVM에 인식될때 new없이 자동으로 메모리가 할당됨




