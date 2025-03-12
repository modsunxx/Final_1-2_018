public class MyClass {
    public static void main(String args[]) {
        Skill fb = new Skill("FireBall","Fire",150,7,70);
        Wizard wz = new Wizard(100, fb);
        System.out.println("Wizard Mp : "+wz.getMp());
        wz.useSkill();
        System.out.println("Wizard Mp : "+wz.getMp());
        wz.useSkill();
        System.out.println(wz.toString());
    }
}