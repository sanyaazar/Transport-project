public class waterTransport extends Transport {
    //свойства
    private int countMotors;         //количество моторов
    private boolean isUnderWater;    //может ли находиться под водой?

    {
        setGround(false);
        setWater(true);
        setAir(false);
    }

    //конструкторы
    waterTransport() {
        super();
    }
    waterTransport(int speed, int cost, int capacity, boolean isWar,
                   int countMotors, boolean isUnderWater) {
        super(speed, cost, capacity, isWar);
        this.countMotors = countMotors;
        this.isUnderWater = isUnderWater;
    }

    //геттеры и сеттеры
    public void setCountMotors(int countMotors) {
        this.countMotors = countMotors;
    }
    public int getCountMotors() {
        return this.countMotors;
    }

    public void setUnderWater(boolean isUnderWater) {
        this.isUnderWater = isUnderWater;
    }
    public boolean getUnderWater() {
        return this.isUnderWater;
    }

    //методы
    public void display() {
        super.display();
        System.out.println("Количество моторов: " + this.countMotors + "\n" +
                "Может ли находиться под водой? " + (this.isUnderWater ? "Да":"Нет") + "\n");
    }
    public void swim() {
        System.out.println("Ура, мы поплыли)0((");
    }

}
