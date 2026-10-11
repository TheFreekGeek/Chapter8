//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    FireMonster blaze = new FireMonster();
    blaze.setName("Blaze");
    blaze.setLevel(1);
    blaze.setElement("Fire");

    WaterMonster bubbles = new WaterMonster();
    bubbles.setName("Bubbles");
    bubbles.setLevel(1);
    bubbles.setElement("Water");

    System.out.println(" ");
    System.out.println(blaze.getName());
    blaze.performAttack();

    System.out.println(" ");
    System.out.println(bubbles.getName());
    bubbles.performAttack();

    //DigitalMonster test = new DigitalMonster();
}
