public abstract class DigitalMonster {
    private String name;
    private int level;
    private String element;

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getElement() {
        return element;
    }

    public void setName(String newname) {
        name = newname;
    }

    public void setLevel(int newlevel) {
        level = newlevel;
    }

    public void setElement(String newelement) {
        element = newelement;
    }

    public abstract void performAttack();

}