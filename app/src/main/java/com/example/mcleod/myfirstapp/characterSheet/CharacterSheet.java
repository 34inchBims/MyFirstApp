package com.example.mcleod.myfirstapp.characterSheet;

import android.widget.Switch;

/**
 * Created by mcleod on 9/25/16.
 */
public class CharacterSheet {
    private String chracterName;
    private CharacterClass characterClass;
    private Integer level;
    private String paragonPath;
    private Integer totalXP;

    public CharacterSheet (String characterName, CharacterClass characterClass, Integer level, String paragonPath, Integer totalXP) {
        this.chracterName = characterName;
        this.characterClass = characterClass;
        this.level = level;
        this.paragonPath = paragonPath;
        this.totalXP = totalXP;
    }

    public String flatten (){
        String result = "";
        result += chracterName + ":";
        result += characterClass.flatten() + ":";
        result += level + ":";
        result += paragonPath + ":";
        result += totalXP + ":";
        return result;
    }

    public static CharacterSheet inflate (String flattened){
        String[] tokens = flattened.split(":");
        String chracterName = "";
        CharacterClass characterClass = null;
        Integer level = 0;
        String paragonPath = "";
        Integer totalXP = 0;
        for (int index = 0; index < tokens.length; index++){
            switch (index){
                case 0 :
                    chracterName = tokens[index];
                    break;
                case 1 :
                    characterClass = CharacterClass.inflate(tokens[index]);
                    break;
                case 2 :
                    level = Integer.parseInt(tokens[index]);
                    break;
                case 3 :
                    paragonPath = tokens[index];
                    break;
                case 4 :
                    totalXP = Integer.parseInt(tokens[index]);
                    break;
                default:
                    throw new IllegalArgumentException("unhandled field inflating character class");
            }
        }
        return new CharacterSheet(chracterName,characterClass,level,paragonPath,totalXP);

    }
}
