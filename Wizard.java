public class Wizard{
    private String name = "Wizard";
    private String race = "Human";
    private int level;
    private double hp;
    private double mp;
    private int attack;
    private int magic;
    private int defend;
    private Skill skill;

    public Wizard(int level,Skill skill){
        hp = level *52;
        mp = level *80;
        attack = level *25;
        magic = level * 50;
        defend = level * 10;
        this.skill = skill;
    }
    

    public double getMp() {
        return mp;
    }
    public void useSkill(){
        mp -= skill.getMagicPoint();
        
    }
    public String toString() {
        return name+"\t"+race+"\n"+"Level : "+level+"\n"+"HP : "+hp+"\n"+"MP : "+mp+"\n"+"Attack : "+attack+"\n"+"Magic : "+magic+"\n"+"Defend : "+defend+"\n"+skill;
    }    
}
