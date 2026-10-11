//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    FireMonster blaze = new FireMonster();
    blaze.setName("Blaze");
    blaze.setLevel(1);
    blaze.setElement("Fire");

    FireBird jean = new FireBird();
    jean.setName("Jean");
    jean.setLevel(2);
    jean.setElement("Fire");

    WaterMonster bubbles = new WaterMonster();
    bubbles.setName("Bubbles");
    bubbles.setLevel(1);
    bubbles.setElement("Water");

    ShockerFish toaster = new ShockerFish();
    toaster.setName("Toaster");
    toaster.setLevel(2);
    toaster.setElement("Water");

    /*System.out.println(" ");
    System.out.println(blaze.getName());
    blaze.performAttack();

    System.out.println(" ");
    System.out.println(jean.getName());
    jean.fly();
    jean.performAttack();

    System.out.println(" ");
    System.out.println(bubbles.getName());
    bubbles.performAttack();

    System.out.println(" ");
    System.out.println(toaster.getName());
    toaster.shock();
    toaster.performAttack();
    */

    //DigitalMonster test = new DigitalMonster();

    ArrayList<DigitalMonster> cyberdex = new ArrayList<>();
    cyberdex.add(jean);
    cyberdex.add(bubbles);
    cyberdex.add(toaster);
    cyberdex.add(blaze);

    for (DigitalMonster monster : cyberdex) {
        System.out.println(" ");
        System.out.println(monster.getName());
        monster.performAttack();
    }

    for (DigitalMonster monster : cyberdex) {
        if (monster instanceof Flyable) {
            System.out.println(" ");
            System.out.println("This monster can fly!");
            System.out.println(monster.getName());
            ((Flyable) monster).fly();
        }
        else if (monster instanceof Electric) {
            System.out.println(" ");
            System.out.println("This monster has electrical powers!");
            System.out.println(monster.getName());
            ((Electric) monster).shock();
        }
    }
}
