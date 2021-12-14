// 구슬이 바닥으로 떨어지는 시작위치 구하기
// 구슬이 내려가는 높이 = drum 배열의 길이
// 배열의 길이에 영향을 주는 문자열 = #, *
// 내려가는 동안 *을 두번 만나면 안 됨.

import java.util.ArrayList;
import java.util.List;

// 문자열에서 #과 *의 갯수의 합 = drum.length 만족시키면 된다.
class Solution {
    public int solution(String[] drum) {
        List<String> answer = new ArrayList<>();

        int sharpCount = 0;
        int asteriskCount = 0;

        for (int i = 0; i < drum.length; i++) {

            if (drum[i].charAt(i) == '#') {
                sharpCount += 1;
            }

            if (drum[i].charAt(i) == '*') {
                asteriskCount += 1;
            }

            if (drum.length == sharpCount + asteriskCount) {
                if (asteriskCount == 1 || asteriskCount == 0) {
                    answer.add(drum[i]);
                    System.out.println(answer);
                }
            }

        }

        return answer.size();
    }


}