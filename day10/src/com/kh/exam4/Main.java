package com.kh.exam4;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.smile();
        p1.eat();
//        p1.study();

        System.out.println("==============");

        Student s1 = new Student();
        s1.smile();
        s1.eat();
        s1.study();
//        s1.teach();

        System.out.println("==============");
        Teacher t1 = new Teacher();
        t1.smile();
        t1.eat();
        t1.teach();
//        t1.study();  형제끼리는 상호작용 불가능

        //하위개념을 상위개념에 대입(o)
        //하위개념의 실체를 상위개념으로 다루겠다
        Person p2 = s1;             //자동 형변환

        //상위개념을 하위개념에 대입(x)
//        Student s2 = p2;
        Student s2 = (Student) p2;  //강제 형변환
        s2.study();


        //컴파일 시점에서는 오류가 안 나지만 런타임 시점에서는 오류가
        // 형 변환할 수 없다는 오류가 발생한다
        //강제 형 변환의 전제조건 : 실체가 강제 형 변환하려는 타입이어야한다다
        Person p3 = p1;
        Student s3 = (Student) p3;
        s3.study();
    }
}
