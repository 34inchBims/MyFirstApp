package com.example.mcleod.myfirstapp.characterSheet;

/**
 * Created by mcleod on 9/25/16.
 */
public class CharacterClass {
    private String classValue;

    public CharacterClass (String classValue ){
        this.classValue = classValue;
    }

    public String flatten() {
        return classValue;
    }

    public static CharacterClass inflate (String flatten){
        return new CharacterClass(flatten);
    }
}
