public class FlyingFish extends WaterMonster implements Flyable{
    @Override
    public void fly() {
        System.out.print("Launches from the water!");
    }
}
