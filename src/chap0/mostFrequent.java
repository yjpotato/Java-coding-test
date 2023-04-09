package chap0;

import java.util.*;

//최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
// 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
// 최빈값이 여러 개면 -1을 return 합니다.
public class mostFrequent {

    class Solution {
        public int solution(int[] array) {
            int answer = array[0]; // 초기 답은 배열의 첫 번째 요소로 설정합니다.
            int max = 0; // 최대 빈도수를 0으로 초기화합니다.
            int frequent[] = new int[1000]; // 각 숫자(1000개 이하)의 빈도수를 저장할 배열을 생성합니다.

            // 배열을 순회하면서 빈도수 배열과 답을 업데이트합니다.
            for (int i = 0; i < array.length; i++) {
                frequent[array[i]]++; // 현재 숫자의 빈도수를 증가시킵니다.
                if (max < frequent[array[i]]) { // 현재 숫자의 빈도수가 지금까지 최대 빈도수보다 크면
                    max = frequent[array[i]]; // 최대 빈도수를 업데이트합니다.
                    answer = array[i]; // 답을 현재 숫자로 설정합니다.
                }
            }

            int temp = 0; // 최대 빈도수를 가진 요소의 개수를 세기 위한 변수를 생성합니다.
            for (int j = 0; j < 1000; j++) { // 0부터 999까지의 숫자에 대해 반복합니다.
                if (max == frequent[j]) temp++; // 현재 숫자의 빈도수가 최대 빈도수와 같으면 개수를 증가시킵니다.
                if (temp > 1) answer = -1; // 최대 빈도수를 가진 요소가 2개 이상이면 답을 -1로 설정합니다.
            }

            return answer; // 답을 반환합니다.
        }
    }

}


//frequent 배열은 [0, 1, 3]과 같이 길이가 3인 배열이 되며,
// frequent[1]은 1이 한 번, frequent[2]는 2가 3번,
// frequent[3]은 3이 한 번 나타난 것을 나타낸다.