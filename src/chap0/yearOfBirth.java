package chap0;
//머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다.
// 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.
public class yearOfBirth {
        public int solution(int age) {
            int birthYear = 2022 - age + 1; // 출생 연도 계산 -> +1은 머쓱이가 태어나지 않았어도 1년이 지나야하기 때문!
            return birthYear; // 출생 연도 반환
        }
    }

