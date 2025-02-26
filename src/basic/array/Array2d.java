package basic.array;

import java.util.Arrays;

public class Array2d {
    public static void main(String[] args) {

//        int[][] arr = new int[3][4];
//        arr[1][1] = 100;
//        System.out.println(Arrays.deepToString(arr));

        int[][] score = {
                {79, 80, 99}, //stu1
                {60, 80, 77}, //stu2
                {79, 90, 45}, //stu3
                {60, 85, 32} //stu4
        };

        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};

        /*
         1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
         2. 각 과목의 평균을 출력해 보세요.
         3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
         */

        //1번
        int idx = 0; //stuName 배열에서 학생 이름을 지목할 용도
        for (int[] stu : score) {
            int total = 0;
            for (int s : stu) {
                total += s;
            }
            double avg = total / subName.length;
            System.out.printf("%s의 평균: .1f점\n",stuName[idx], avg);
            idx++;
        }

        System.out.println("=================");

        //2번
        int avr = 0;

        for (int i = 0; i < subName.length ; i++) {
            int total = 0;
            for (int j = 0; j < stuName.length ; j++) {
                total += score[j][i];
            }
            double avg = (double) total / stuName.length;
            System.out.printf("%s의 평균 점수", subName[i]);
        }


        System.out.println("=============");


        //3번

        double totalAVg = 0.0;

        int index = 0; //stuName 배열에서 학생 이름을 지목할 용도
        for (int[] stu : score) {
            int total = 0;
            for (int s : stu) {
                total += s;
            }
            double avg = total / subName.length;
            System.out.printf("%s의 평균: .1f점\n",stuName[index], avg);
            idx++;
        }

        double classAvg = totalAVg / stuName.length;
        System.out.printf("우리반 평균: %.1f점\n", classAvg);
    }
}
