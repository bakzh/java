public class IFExam4 {
    public static void main(String[] args) {
        //산술 > 비교 > 논리 > 대입

            //대입연산자 : =, +=, -=, *=, /=, %=

            //산술연산자 : =.-.*,/,%

            //비교얀산자 : ==, !=, >, <, >=, <=
            // boolen 값 결과가 나온다

        int score = 60;

        //논리연산자 : 그리고(&&), 또는(||), 부정(!), 배타적(^)
        //          boolen 값 결과가 나온다
        //70 이상 90 이하면 우수
        if (score >= 70 && score <= 90) {
            System.out.println("우수");
        }

        if ( !(score >= 70 && score <= 90)){
            System.out.println("70이상 90이하가 아닌 범위의 값이 아닙니다.");
        }
        int number = 6;
        //2의 배수이거나 3의 배수인 수
        if (number % 2 == 0 || number % 3 == 0){
            System.out.println("2의 배수이거나 3의 배수인 수");
        }else{
            System.out.println("2의 배수이거나 3의 배수가 아닌 수");
        }
    }
}