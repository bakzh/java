package com.kh.exercise17.q8;

import java.util.HashMap;
import java.util.Map;

/*
   기본 타입을 객체로 => 기본타입 wrapper 클래스
   byte => Byte
   short => Short
   char => Character
   int => integer
   long => Long
   float => Float
   double => Double
   boolean => boolean
 */
public class main {
    public static void main(String[] args) {

//        Integer x = new Integer(1);
        Integer x = 1;      //auto boxing

//        int y = x.intValue();
        int y = x;          //auto unboxing

        Map<String, Boolean> map = new HashMap<>();
        map.put("사운드", true);
        map.put("그래픽", false);
        map.put("배경음", true);
        map.put("그래픽", true);
        System.out.println(map);
    }
}
