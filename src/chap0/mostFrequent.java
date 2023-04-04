package chap0;
import java.util.*;
//최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
// 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
// 최빈값이 여러 개면 -1을 return 합니다.
public class mostFrequent {

        public int solution(int[] array) {
            // 각 숫자의 등장 횟수를 저장하기 위한 Map
            Map<Integer, Integer> freqMap = new HashMap<>();

            // 가장 빈번하게 등장하는 숫자의 등장 횟수
            int maxFreq = 0;

            // 가장 빈번하게 등장하는 숫자
            int mode = -1;

            // 각 숫자의 등장 횟수 계산
            for (int num : array) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
                maxFreq = Math.max(maxFreq, freqMap.get(num));
            }

            // 가장 빈번하게 등장하는 숫자가 하나 이상인지 확인
            boolean hasMultipleModes = false;
            for (int num : freqMap.keySet()) {
                if (freqMap.get(num) == maxFreq) {
                    if (mode == -1) {
                        mode = num;
                    } else {
                        hasMultipleModes = true;
                        break;
                    }
                }
            }

            // 가장 빈번하게 등장하는 숫자가 하나면 해당 숫자를, 여러 개면 -1을 반환
            return hasMultipleModes ? -1 : mode;
        }
    }

