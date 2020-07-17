package com.company;

public class Animal {

    /**
     * 体重
     */
    protected double weight;

    /**
     * 鳴き声
     */
    public String cry = "未設定";

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getCry() {
        return cry;
    }
}
