package com.sern.transients.core.service;

import com.sern.rpg.core.character.enemy.EnemyFactoryFactory;
import com.sern.rpg.core.character.modifier.ModifierFactoryFactory;
import com.sern.transients.core.character.enemy.TransientsEnemyFactory;
import com.sern.transients.core.character.modifier.TransientsModifierFactory;

public class TransientsFactoryService {

    public TransientsFactoryService() {
        EnemyFactoryFactory.setEnemyFactory(new TransientsEnemyFactory());
        ModifierFactoryFactory.setModifierFactory(new TransientsModifierFactory());
    }
}
