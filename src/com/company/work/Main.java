package com.company.work;

public class Main {

    public static void main(String[] args) {

        // 実習1 7-6
        double s = 0;
        int ix = 0;
        for (int i = 0; i < 500; i++) {
            s += Math.pow(i, 2) * 0.01;

            if (100 < s) {
                ix = i;
                break; // forループを抜ける
            }
        }
        System.out.println(s);
        System.out.println("面積sが100を超えるのは" + ix + "回目でその時の面積は" + s);

        // 実習1 7-7


        // テスト3週目
        int number = 68779620;
        int count = 2;
        System.out.print(number + "=");
        while (number > 1) {
            while (number % count == 0) {
                if (number / count == 1) {
                    System.out.print(count);
                } else {
                    System.out.print(count + "×");
                }
                number /= count;
            }
            count++;
        }
    }
}
