package chap0;
//머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
// 피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때,
// n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를
// return 하도록 solution 함수를 완성해보세요.
import java.lang.Math; // Math 클래스를 임포트
public class pizza03 {
     public int solution(int slice, int n) {
            // ceil 함수로 올림 연산을 수행하여,
            // 한 판 당 먹을 수 있는 사람 수를 계산하고,
            // n명의 사람이 최소 한 조각 이상 먹으려면,
            // 필요한 최소한의 판 수를 구한다.
            int answer = (int) Math.ceil((double) n / slice);

            // 최소한의 판 수를 반환한다.
            return answer;
        }
    }

