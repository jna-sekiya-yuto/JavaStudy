package com.company.test05;

/**
 * 猫クラス
 * 吾輩は猫である。名前はまだない。。
 */
public class Cat {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    // 自己紹介する
    public String introduceMyself(){
        // StringUtils.isEmptyを使えば一発で良いが、「Apache Commons Lang」ライブラリをimportする必要がある
        // 今回は上記は使わずString.isEmpty()を使用する。
        // ただしString.isEmpty()はnull判定不可なので自前でチェックが必要
        System.out.println("吾輩はねこである。");
        if (name == null || name.isEmpty()) {  // 短絡評価。isEmpty()を先に記述してる場合は×
            return "名前はまだない。";
        }
        return "名前は" + name + "である。";
    }
}
