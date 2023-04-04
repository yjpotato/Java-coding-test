package chap0;

public class pizza01 {

        public int solution(int n) {
            int pizza = 0; // 필요한 피자의 수를 저장할 변수

            // 피자를 일곱 조각씩 나누어 먹을 때, 필요한 피자의 수 계산
            if (n % 7 == 0) {
                pizza = n / 7; // 나누어 떨어지는 경우
            } else {
                pizza = n / 7 + 1; // 나누어 떨어지지 않는 경우
            }

            return pizza; // 필요한 피자의 수 반환
        }
    }


