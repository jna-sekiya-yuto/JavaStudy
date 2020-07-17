package com.company.test08;

import java.util.Random;

/**
 * 男女兄弟問題
 * 二人兄弟の片方が男であるとき、もう一人も男である確率は？百分率で示せ。
 * 答えが約33%になることを確認せよ
 */
public class Main {
    private static final int MALE = 0;
    private static final int FEMALE = 1;

    public static void main(String[] args) {

        int[] sex = {MALE, FEMALE};
        int maleCount = 0;
        int femaleCount = 0;

        for (int i = 0; i < 10000; i++) {
            // 念のためループを10000回繰り返す。100回じゃ試行数が少ないかも
            int child1 = new Random().nextInt(sex.length);
            int child2 = new Random().nextInt(sex.length);

            if (child1 == MALE || child2 == MALE) {  // 片方が男性の場合
                if (child1 == MALE && child2 == MALE) {  // 両方が男性の場合
                    maleCount += 1;
                } else {
                    femaleCount += 1;
                }
            }
        }

        // doubleにキャストしないと小数点が表現出来ない
        // floorで切り捨てる
        double maleBirthRate = Math.floor((double) maleCount / (maleCount + femaleCount) * 100) ;
        System.out.println("兄弟共に男性である確率は" + maleBirthRate + "%である");
    }
}
