package com.jyjz.playground.hierarchy;

import java.util.List;

/**
 *  简单的等级结构
 */
public interface SimpleHierarchy {

    /**
     * @return 遍历等级结构, 获取所有的叶子节点并作为 List 返回
     */
    List<SimpleHierarchy> traverse();
}
