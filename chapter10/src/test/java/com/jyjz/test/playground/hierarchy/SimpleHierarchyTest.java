package com.jyjz.test.playground.hierarchy;

import com.jyjz.playground.hierarchy.Holder;
import com.jyjz.playground.hierarchy.Leaf;
import org.junit.Assert;
import org.junit.Test;

public class SimpleHierarchyTest {
    /**
     * 世界上有 13 个国家的人口超过 1 亿, 把这些国家按照其所在位置组成一个等级结构
     */
    @Test
    public void testDensePopulation() {
        Holder eastAsia = new Holder();
        eastAsia.add(new Leaf("China"));
        eastAsia.add(new Leaf("Japan"));

        Holder southeastAsia = new Holder();
        southeastAsia.add(new Leaf("Indonesia"));
        southeastAsia.add(new Leaf("Philippines"));

        Holder southAsia = new Holder();
        southAsia.add(new Leaf("India"));
        southAsia.add(new Leaf("Pakistan"));
        southAsia.add(new Leaf("Bangladesh"));

        Holder asia = new Holder();
        asia.add(eastAsia);
        asia.add(southAsia);
        asia.add(southeastAsia);

        Holder northAmerica = new Holder();
        northAmerica.add(new Leaf("U.S."));
        northAmerica.add(new Leaf("Mexico"));

        Holder southAmerica = new Holder();
        southAmerica.add(new Leaf("Brazil"));

        Holder africa = new Holder();
        africa.add(new Leaf("Nigeria"));
        africa.add(new Leaf("Ethiopia"));

        Holder europe = new Holder();
        europe.add(new Leaf("Russia"));

        Holder oceania = new Holder();
        Holder antarctica = new Holder();

        Holder world = new Holder();
        world.add(asia);
        world.add(europe);
        world.add(africa);
        world.add(northAmerica);
        world.add(southAmerica);
        world.add(oceania);
        world.add(antarctica);

        Assert.assertEquals(world.traverse().size(), 13);
        Leaf some = new Leaf("U.S.");
        Assert.assertTrue(world.traverse().contains(some));
    }
}
