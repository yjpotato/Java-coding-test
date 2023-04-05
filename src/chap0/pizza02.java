package chap0;
//머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
// n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를
// return 하도록 solution 함수를 완성해보세요.
class pizza02 {
    public int solution(int n) {
        int answer = 1; //최소한의 판 수는 1부터 시작

        while(true){
            if(6*answer%n==0) break;//현재 판 수인 answer에 6을 곱한 값을 n으로 나눈 나머지가 0이라면,
            answer++;//// n명이 모두 같은 양을 먹을 수 있으므로, 반복문을 종료.
            //그렇지 않으면, answer를 1 증가시키고, 다시 while문을 실행
        }

        return answer;//최소한의 판 수를 반환
    }
}
