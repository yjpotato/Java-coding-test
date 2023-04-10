package chap0;
//문자열 my_string과 정수 n이 매개변수로 주어질 때,
// my_string에 들어있는 각 문자를 n만큼 반복한 문자열을 return 하도록 solution 함수를 완성해보세요.
public class repeatedOutput {
    class Solution {
        public String solution(String my_string, int n) {
            String answer = "";
            for(int i=0; i<my_string.length(); i++){  // my_string 각 문자 n번 반복하여 결과값에 넣ㄱ;
                char c = my_string.charAt(i); // my_string에서 i번째 위치에 있는 문자를 가져옴
                for(int j=0; j<n; j++){ // 문자 c를 n번 반복
                    answer += c;
                }
            }
            return answer;
        }
    }

}
