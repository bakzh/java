package com.kh.exam4;

public class Main2 {
    public static void main(String[] args) {
        int x = 10;
        double y = x;  //자동 형변환, 작은 타입을 큰 타입에 대입

        double i = 20;
//        int j = i;     //큰 타입을 작은 타입에 대입할 수 없다
        int j = (int) i; //큰 타입을 작은 타입에 대입하려면 형변환 연산자를 사용해야함
                         //값의 손실이 없는 전제 하에 강제로 형변환 해준다


        byte k =  127; //-128 ~ 127 까지의 값의 범위를 갖는다

        byte l = (byte) (k + 1);
        System.out.println(l);

        byte m = (byte) (k - 1);
        System.out.println(m);

        int a = 10;
        byte b = (byte) a;
        System.out.println(b);
    }
}
