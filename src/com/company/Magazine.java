package com.company;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    // 9_1
    private List<Production> productions = new ArrayList<>();

    // 9_2
    public void addProduction(Production production) {
        productions.add(production);
    }

    // 9_4
    public Production getProduction(int index) {
        return productions.get(index);
    }

    // 9_5
    public int getSize() {
        return productions.size();
    }
}
