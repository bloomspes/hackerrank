public class Solution {

    // 직사각형을 만드는 데 필요한 나머지 한 점의 좌표를 return 하라.
    // 1. 직사각형의 각 변은 x,y축에 평행하다.
    // 2. 반드시 직사각형을 만들어야 함.

    // (x, x+p) (y, y+p) p는 Integer.
    public int[] solution(int[][] v) {
        final int x;
        final int y;

        // 1. x 좌표 구하기

        if (v[0][0] == v[2][0]) {
            x = v[1][0];
        }
        else if (v[1][0] == v[2][0]) {
            x = v[0][0];
        }
        else {
            x = v[2][0];
        }

        // 2. y 좌표 구하기

        if (v[0][1] == v[1][1]) {
            y = v[2][1];
        }
        else if (v[1][1] == v[2][1]) {
            y = v[0][1];
        }
        else {
            y = v[1][1];
        }

        int[] answer = {x, y};
        return answer;
    }
}
