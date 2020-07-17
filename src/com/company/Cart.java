package com.company;

import java.util.Optional;

/**
 * かごクラス
 */
public class Cart {

    /**
     * 果物リスト
     */
    private Fruit fruit;

    /**
     * コンストラクタ
     */
    public Cart() {
    }

    /**
     * かごに果物を追加する
     *
     * @param fruit 果物
     */
    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    /**
     * かごを空にする
     */
    public void clear() {
        this.fruit = null;
    }

    /**
     * かごの中身を取得する
     * 果物が存在しない場合、Optionalを返却する
     */
    public Optional<Fruit> getFruit() {
        return Optional.ofNullable(fruit);
    }

}
