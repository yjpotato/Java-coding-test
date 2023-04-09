package chap0;
//문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
public class reverseString {
        public static String solution(String my_string) {
            StringBuilder sb = new StringBuilder(my_string);//StringBuilder 문자열을 다루기 위한 클래스
            return sb.reverse().toString();//reverse 문자열 뒤집기.  toString 문자열을 String으로 변환
        }
    }

