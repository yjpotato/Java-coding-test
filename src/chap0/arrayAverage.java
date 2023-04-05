package chap0;
//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
public class arrayAverage {

        public double solution(int[] numbers) {
            // numbers 배열의 원소의 합을 구합니다.
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            // 평균값을 계산하여 반환합니다.
            return (double) sum / numbers.length;
        }
    }


