package com.jyjz.playground.hierarchy;

import java.util.LinkedList;
import java.util.List;

/**
 * 等级结构中的非叶子节点
 */
public class Holder implements SimpleHierarchy {
    /**
     * 子元素所构成的 List
     */
    private List<SimpleHierarchy> components = new LinkedList<SimpleHierarchy>();

    public void add(SimpleHierarchy component) {
        components.add(component);
    }

    @Override
    public List<SimpleHierarchy> traverse() {
        List<SimpleHierarchy> simpleHierarchyList = new LinkedList<SimpleHierarchy>();
        for (SimpleHierarchy component : components) {
            simpleHierarchyList.addAll(component.traverse());
        }
        return simpleHierarchyList;
    }
}
