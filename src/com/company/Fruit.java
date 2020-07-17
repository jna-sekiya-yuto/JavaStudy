package com.company;

public class Fruit {

    /**
     * 名前
     */
    private String name;

    /**
     * 色
     */
    private String color;

    /**
     * 実が木になるか
     */
    private boolean isWoodNature;

    /**
     * コンストラクタ
     *
     * @param name         名前
     * @param color        色
     * @param isWoodNature 実が木になるか
     */
    public Fruit(String name, String color, boolean isWoodNature) {
        this.name = name;
        this.color = color;
        this.isWoodNature = isWoodNature;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean getIsWoodNature() {
        return isWoodNature;
    }

    @Override
    public String toString() {
        return "名前：" + name + "　色：" + color + "　木になるか：" + isWoodNature;
    }
}
