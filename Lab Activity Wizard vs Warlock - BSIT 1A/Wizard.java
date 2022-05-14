public class Wizard extends Character {
    Wizard(String name) {
        super(name);
    }

    public void Tornado(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with Tornado (Damage - 430 , Mana Cost - 150)");
        int damagePoints = 430;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 150;
        manaTarget(enemyCharacter, manaPoints);

    }

    public void EMP(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with EMP (Mana Burned - 550 , Mana Cost - 125)");
        int ManaBurnedPoints = 550;
        damageTarget(enemyCharacter, ManaBurnedPoints);
        int manaPoints = 125;
        manaTarget(enemyCharacter, manaPoints);

    }
    public void SunStrike(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with SunStrike (Damage - 475 , Mana Cost - 175)");
        int damagePoints = 475;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 175;
        manaTarget(enemyCharacter, manaPoints);

    }
    public void ChaosMeteor(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with ChaosMeteor (Damagepersec - 166 , Mana Cost - 200)");
        int damagepersecPoints = 166;
        damageTarget(enemyCharacter, damagepersecPoints);
        int manaPoints = 200;
        manaTarget(enemyCharacter, manaPoints);
    }
    public void IceWall(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with IceWall (Damagepersec - 42 , Mana Cost - 125)");
        int damagepersecPoints = 24;
        damageTarget(enemyCharacter, damagepersecPoints);
        int manaPoints = 125;
        manaTarget(enemyCharacter, manaPoints);
    }
    public void DefeningBlast(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName
                + " with DefeningBlast (Damage - 260 , Mana Cost - 300)");
        int damagePoints = 260;
        damageTarget(enemyCharacter, damagePoints);
        int manaPoints = 300;
        manaTarget(enemyCharacter, manaPoints);
    }
}