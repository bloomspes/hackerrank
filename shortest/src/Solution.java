// 문자열 1개 이상 단위로 문자열을 자르기
// 자른 문자열을 중복 제거하기
// 가장 짧은 문자열을 return 하라.

// 문자열 2개 단위로 잘라서 압축하면?
// 문자열 3개 단위로 잘라서 압축하면?
// 문자열 자를 수 있는 최대 길이 값은...? 문자열 길이 / 2
// 가장 짧은 길이는? 문자열 길이.max


import java.io.StringWriter;

public class Solution {
    public static int solution(String s) {
        int answer = s.length();
        int count = 1;

        for (int length = 1; length <= s.length()/2; length++) {
            StringBuilder stringBuilder = new StringBuilder();

            for (int i = 0; i < s.length(); i = i + length) {
                String result = "";

                if (s.length() <= i + length) {
                    result = s.substring(i, s.length());
                }
                else {
                    result = s.substring(i, i + length);
                }

                StringBuilder word = new StringBuilder();

                // 그 다음위치 ~ 끝까지 문자열 비교하는 코드 작성


                // 중복되지 않은 문자열들만 골라서 새 문자열 만들기.

                if (count == 1) {
                    word.append(result);
                }
                else {
                    word.append(count).append(result);
                }

                stringBuilder.append(word.toString());
            }

            // 구해야 하는 결과는
            answer = Math.min(answer, stringBuilder.toString().length());
        }

        return answer;
    }
}
