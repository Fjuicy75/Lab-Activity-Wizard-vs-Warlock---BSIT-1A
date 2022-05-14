public class Warlock extends Character {
    Warlock(String name) {
        super(name);
    }
    public void FatalBonds(Character enemyCharacter) {

        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with FatalBonds (Damage - 50 , Mana Cost - 140)");
        int damagePoints = 50;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 140;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void UpHeaval(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with UpHeaval (Damage - 45 , Mana Cost - 150)");
        int damagePoints = 45;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 150;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void ChaoticOffering(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks again " + enemyCharacter.characterName
                + " with ChaoticOffering (Damage - 100 , Mana Cost - 300)");
        int damagePoints = 100;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 300;
        manaTarget(enemyCharacter, manaPoints);

    }
    public void FlamingFist(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with FlamingFist (Damagepersec - 60 , Mana Cost - 0)");
        int damagepersecPoints = 475;
        damageTarget(enemyCharacter, damagepersecPoints);
        int manaPoints = 0;
        manaTarget(enemyCharacter, manaPoints);
    }
    public void ShadowWord(Character characterName) {
        System.out.println(super.characterName + " Use ShadowWord (Heal - 45)");
        int healPoints = 45;
        healTarget(characterName, healPoints);
        manadTarget(characterName, manaPoints);
    }
}