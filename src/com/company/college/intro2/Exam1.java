package com.company.college.intro2;

//メイン処理を行うクラス
public class Exam1 {

    public static void main(String[] args) {
        // tamaというインスタンスを生成
        Exam2 tama = new Exam2("タマ");

        // 名前を取得し、表示する
        System.out.println(tama.getName());
    }
}
