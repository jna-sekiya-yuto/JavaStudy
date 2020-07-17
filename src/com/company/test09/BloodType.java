package com.company.test09;

/**
 * 血液型Enum
 */
public enum BloodType {
    A("几帳面"),
    B("好奇心旺盛"),
    O("社交的"),
    AB("天才肌");

    // 特徴
    private String characteristic;

    /**
     * コンストラクタ.
     * Enumのコンストラクタは必ずprivateである(理由は調べてみよう)
     */
    private BloodType(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    // 相性診断
    // A型とO型、B型とAB型が相互に相性が良い
    public BloodType findBestPartner() {
        switch (this) {
            case A:
                return O;
            case B:
                return AB;
            case O:
                return A;
            case AB:
                return B;
            default:
                return null;
        }
    }
}
