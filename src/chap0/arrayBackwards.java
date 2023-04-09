package chap0;
//정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
// num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
public class arrayBackwards {
    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length]; // 새로운 배열 생성
            for (int i = 0; i < num_list.length; i++) {
                answer[i] = num_list[num_list.length - 1 - i]; // 배열 뒤집기
                //i가0일때 num_list[4]
                //i가1일때 num_list[3]...이렇게 하나씩 배열인덱스값을 줄이며 거꾸로 출력
            }
            return answer;
        }
    }

    }

