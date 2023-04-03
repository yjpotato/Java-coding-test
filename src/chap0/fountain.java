package chap0;
//분수의 덧셈
//첫 번째 분수의 분자와 분모를 뜻하는 `numer1`, `denom1`, 두 번째 분수의 분자와 분모를 뜻하는 `numer2`
//`denom2`가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
//
//기약분수 : 분모와 분자가 1이외에 공약수가 없는 분수

    class fountain {
        public int[] Fountain(int denum1, int num1, int denum2, int num2) {
            int[] answer = new int[2];

            int denominator = num1*num2; //분모
            int molecule = denum1*num2+denum2*num1; //분자
            int max = 1;

            for(int i=1; i <= denominator && i<= molecule; i++){     //최대 공약수
                if(denominator%i==0 && molecule%i==0){
                    max = i;
                }
            }
            answer[0] = molecule/max; //분자
            answer[1] = denominator/max; //분모

            return answer;
        }
    }

