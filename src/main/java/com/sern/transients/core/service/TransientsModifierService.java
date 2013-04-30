package com.sern.transients.core.service;

import com.sern.rpg.core.service.ModifierService;
import com.sern.transients.core.character.modifier.Armored;
import com.sern.transients.core.character.modifier.Flying;
import com.sern.transients.core.character.modifier.MoreArms;
import com.sern.transients.core.character.modifier.Rich;
import com.sern.transients.core.character.modifier.Slimy;
import com.sern.transients.core.character.modifier.Squealer;
import com.sern.transients.core.character.modifier.SuperRich;

public class TransientsModifierService extends ModifierService {

    public TransientsModifierService() {
        loadAllModifiers();
    }
    
    @Override
    public void loadAllModifiers() {
        addModifier("Armored", new Armored());
        addModifier("Flying", new Flying());
        addModifier("More Arms", new MoreArms());
        addModifier("Rich", new Rich());
        addModifier("Slimy", new Slimy());
        addModifier("Squealer", new Squealer());
        addModifier("Super Rich", new SuperRich());
    }
}
