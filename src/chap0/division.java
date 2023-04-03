package chap0;
//두수의 나눗셈
//정수num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
public class division {
    public int divideAndRound(int num1, int num2) {
        if (num2 == 0) { //num2가 0인경우 예외처리
            throw new IllegalArgumentException("Second parameter cannot be zero.");
        }

        double quotient = (double) num1 / num2;
        int roundedResult = (int) Math.round(quotient * 1000);
        return roundedResult;
    }
}




