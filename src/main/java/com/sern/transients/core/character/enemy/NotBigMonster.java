package com.sern.transients.core.character.enemy;

import com.sern.rpg.core.character.enemy.Enemy;

public class NotBigMonster extends Enemy {

    public NotBigMonster() {
        super(1, "Not Big Monster", 2);
        setBonus(3);
    }

}
