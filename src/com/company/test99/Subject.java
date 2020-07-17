package com.company.test99;

/**
 * 科目
 */
public enum Subject {
    JAPANESE("国語", 200),
    MATH("数学", 200),
    SCIENCE("理科", 100),
    SOCIETY("社会",100),
    ENGLISH("英語", 200);

    /**
     * 科目名
     */
    private String name;

    /**
     * 満点の値
     */
    private int maxScore;

    /**
     * コンストラクタ
     */
     Subject(String name, int maxScore) {
        this.name = name;
        this.maxScore = maxScore;
    }

    public String getName() {
        return name;
    }

    // 科目ごとの満点を超えているか判定する
    public boolean isOverMaxScore(int score){
        switch (this) {
            case JAPANESE:
                return JAPANESE.maxScore < score;
            case MATH:
                return MATH.maxScore < score;
            case SCIENCE:
                return SCIENCE.maxScore < score;
            case SOCIETY:
                return SOCIETY.maxScore < score;
            case ENGLISH:
                return ENGLISH.maxScore < score;
            default:
                return true;
        }
    }
}
