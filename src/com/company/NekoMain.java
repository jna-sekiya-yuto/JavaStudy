package com.company;

public class NekoMain {

    public static void main(String[] args) {
        // 問題1-2
        Neko tama = new Neko("タマ", 2);
        System.out.println("ネコの名前：" + tama.getName());
        System.out.println("ネコの年齢：" + tama.getAge());

        // 問題2-3
        tama.setWeight(10);
        System.out.println("ネコの体重は" + tama.getWeight() + "kg");

        // 問題3-2
        System.out.println("ネコの鳴き声：" + tama.getCry());

        // 問題4-2
        System.out.println(tama.showProfile());
    }
}
