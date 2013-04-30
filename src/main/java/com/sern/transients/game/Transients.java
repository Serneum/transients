package com.sern.transients.game;

import com.sern.rpg.core.service.EnemyService;
import com.sern.rpg.core.service.EnemyServiceFactory;
import com.sern.rpg.core.service.ModifierService;
import com.sern.rpg.core.service.ModifierServiceFactory;
import com.sern.transients.core.service.TransientsEnemyService;
import com.sern.transients.core.service.TransientsModifierService;

public class Transients {
    
    public Transients() {
        EnemyService enemyService = new TransientsEnemyService();
        ModifierService modifierService = new TransientsModifierService();
        
        // Initialize Services
        new EnemyServiceFactory(enemyService);
        new ModifierServiceFactory(modifierService);
    }
}
