package com.company;

public class Neko  extends Animal implements Pet{
    private int age;
    private String name;
    public static int count;

    // コンストラクタ
    public Neko(String name) {
        this.name = name;
        count++;
    }

    // 問題1-1
    public Neko(String name, int age) {
        this(name);
        this.age = age;
    }

    public void setAge(int age){
        this.age =age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // 問題3-1
    @Override
    public String getCry() {
        return "ニャー";
    }

    // 問題4-2
    @Override
    public String showProfile() {
        return "私は猫です。";
    }
}

