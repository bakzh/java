import java.util.Arrays;

/*
    로또 프로그램 구현하기
    : 1~45번호 중 중복되지 않는 6자리 추출하기
    Math.random() : 0 <= ? < 1 사이의 랜덤한 실수발생
     중복 체크 로지은 별도의 메소드를 사용하여 구현할 것.

*/
public class RandomExam3 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        int count = 0; // for문 반복횟수 카운트
        int i = 0;
        while (i < lotto.length) {
            int num = (int) (Math.floor(Math.random() * 45) + 1);
            count++; //count = count + 1 , count += 1;

            //동일 번호가 존재하면
            if (isExist(lotto, num)) {
                i--; // i = i - 1, i -= 1;
                continue;
            }

//        lotto[i] = num;
//        i++;
            lotto[i++] = num;

        }
        System.out.println("for문 반복횟수:" + count);
        System.out.println(Arrays.toString(lotto));
    }

    //배열 내 중복값이 있는지 체크하는 메소드
    public static boolean isExist(int[] arr, int num) {
        boolean result = false;

        for (int i = 0; i < arr.length; i++) {
            //배열 내에 동일한 번호가 있으면
            if (arr[i] == num) {
                result = true;
                break; //가장 가까운 반복문을 빠져나온다.
            }
        }
        return result;

    }
}

