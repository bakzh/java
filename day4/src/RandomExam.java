import java.lang.reflect.Array;
import java.util.Arrays;

/*
    로또 프로그램 구현하기
    : 1~45번호 중 중복되지 않는 6자리 추출하기
    Math.random() : 0 <= ? < 1 사이의 랜덤한 실수발생

*/
public class RandomExam {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        for (int i = 0; i < lotto.length; i++) {
            int num = (int) (Math.floor(Math.random() * 45) + 1);
            lotto[i] = num;

            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(lotto));
    }
}
