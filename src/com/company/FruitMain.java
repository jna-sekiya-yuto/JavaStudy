package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FruitMain {

    public static void main(String[] args) {
        Fruit apple = new Fruit("リンゴ", "赤", true);
        Fruit banana = new Fruit("バナナ", "黄色", true);
        Fruit melon = new Fruit("メロン", "緑", false);

        // 1-2
        Map<String, Fruit> fruitMap = new HashMap<>();
        fruitMap.put("リンゴ", apple);
        fruitMap.put("バナナ", banana);
        fruitMap.put("メロン", melon);

        // 1-3
        for (Fruit fruit : fruitMap.values()) {
            System.out.println(fruit.toString());
        }

        // 2-2
        Cart cart = new Cart();

        // fruitをセットしていない状態でgetFruit()を実施
        Optional<Fruit> nullableFruit1 = cart.getFruit();
        System.out.println(nullableFruit1);  // ここでget()メソッドを使ってしまうとエラーが発生する

        // 2-3
        // fruitをセットしてからgetFruit()を実施
        cart.setFruit(apple);

        if (cart.getFruit().isPresent()) {
            System.out.println(cart.getFruit().get().getName());
        } else {
            System.out.println("かごに果物を入れてください");
        }

        // 2-4
        // fruitをセットしていない状態でgetFruit()を実施。デフォルトのバナナがセットされる
        cart.clear();
        System.out.println(cart.getFruit().orElse(banana));

        // 3-1
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(apple);
        fruits.add(banana);
        fruits.add(melon);

        List<String> names = fruits.stream()
                //.map(Fruit::getName)
                .map(s -> s.getName())
                .collect(Collectors.toList());

        // 3-2
        String name = names.stream()
                .filter(s -> s.length() == 4)
                .findFirst().orElse("該当なし");
        System.out.println(name);

        int i = -1;

    }
}
