package com.jyjz.playground.hierarchy;

import java.util.LinkedList;
import java.util.List;

/**
 * 等级结构的叶子节点
 */
public class Leaf implements SimpleHierarchy {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public List<SimpleHierarchy> traverse() {
        List<SimpleHierarchy> simpleHierarchyList = new LinkedList<SimpleHierarchy>();
        simpleHierarchyList.add(this);
        return simpleHierarchyList;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object that) {
        if (!(that instanceof Leaf)) {
            return false;
        }
        if (this.toString() == null) {
            return false;
        }
        return this.toString().equals(that.toString());
    }
}
