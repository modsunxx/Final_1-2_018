public class MyClass {
    
    // main method สำหรับข้อ1
    // public static void main(String args[]) {
    //     Skill fb = new Skill("FireBall","Fire",150,7,34);
    //     System.out.println(fb.getName());
    //     fb.setAttack((int)(fb.getAttack()*1.5));
    //     fb.setHit(8);
    //     System.out.println(fb.toString());
    // }
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
