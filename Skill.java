public class Skill {
    private String name;
    private String attribute;
    private int attack;
    private int hit;
    private int magicPoint;

    public Skill(String name,String attribute,int attack,int hit,int magicPoint){
        this.name = name;
        this.attribute = attribute;
        this.attack = attack;
        this.hit = hit;
        this.magicPoint =magicPoint;
    }

    public String getName() {
        return name;
    }
    public String getAttribute() {
        return attribute;
    }
    public int getAttack() {
        return attack;
    }
    public int getMagicPoint() {
        return magicPoint;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public void setHit(int hit) {
        this.hit = hit;
    }
    public String toString() {
        return "Name : "+name+"\n"+"Attribute : "+attribute+"\n"+"Attack : "+attack+"\n"+"Hit : "+hit+"\n"+"MagicPoint : "+magicPoint;
    }

}

