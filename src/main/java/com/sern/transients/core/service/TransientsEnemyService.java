package com.sern.transients.core.service;

import com.sern.rpg.core.service.EnemyService;
import com.sern.transients.core.character.enemy.BigMonster;
import com.sern.transients.core.character.enemy.HugeMonster;
import com.sern.transients.core.character.enemy.Mutt;
import com.sern.transients.core.character.enemy.NotBigMonster;
import com.sern.transients.core.character.enemy.OldMan;
import com.sern.transients.core.character.enemy.ReallyBigMonster;

public class TransientsEnemyService extends EnemyService {

    public TransientsEnemyService() {
        loadAllEnemies();
    }
    
    @Override
    public void loadAllEnemies() {
        addEnemy("Big Monster", new BigMonster());
        addEnemy("Huge Fucking Monster", new HugeMonster());
        addEnemy("Wretched Mutt", new Mutt());
        addEnemy("Not Big Monster", new NotBigMonster());
        addEnemy("Crotchety Old Man", new OldMan());
        addEnemy("Really Big Monster", new ReallyBigMonster());
    }
}
