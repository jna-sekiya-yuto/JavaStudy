package com.company.test99;

/**
 * 生徒クラス
 */
public class Student {

    private int id;

    private String name;

    // key: 科目、value:点数
    private Score score = new Score();

    // コンストラクタ
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Score getScore() {
        return score;
    }
}
