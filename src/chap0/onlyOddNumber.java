package chap0;
//정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
public class onlyOddNumber {
        public int[] solution(int n) {
//n이 홀수인 경우, n 이하의 홀수의 개수는 (n + 1) / 2개
//ex) n이 7인 경우에는 1, 3, 5, 7의 네 개의 홀수, (7 + 1) / 2로 계산하면 4.
            int[] answer = new int[(n + 1) / 2];
            int idx = 0;
            for (int i = 1; i <= n; i += 2) {//i가1부터 시작하기 때문에 홀수값만 저장
                answer[idx++] = i;
            }
            return answer;
        }
    }


