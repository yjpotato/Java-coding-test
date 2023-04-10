package chap0;
//문자열 my_string과 문자 letter이 매개변수로 주어집니다.
//my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
public class removeText {
    class Solution {
        public String solution(String my_string, String letter) {
            String answer = my_string;
            for(int i = 0; i < letter.length(); i++){
                char ch = letter.charAt(i); //문자열을 문자로 바꾸기
                answer = answer.replace(String.valueOf(ch), "");//replace로 ch를 ""으로 바꾸기
            }
            return answer;
        }
    }
}
