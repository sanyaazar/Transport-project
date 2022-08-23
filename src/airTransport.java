public class airTransport extends Transport{
    //свойства
    private int countWings;     //количество крыльев

    {
        setGround(false);
        setWater(false);
        setAir(true);
    }

    //конструкторы
    airTransport() {
        super();
    }
    airTransport(int speed, int cost, int capacity, boolean isWar,
                 int countWings) {
        super(speed, cost, capacity, isWar);
        this.countWings = countWings;
    }

    //геттеры и сеттеры
    public void setCountWings(int countWings) {
        this.countWings = countWings;
    }
    public int getCountWings() {
        return countWings;
    }

    //методы
    public void fly() {
        System.out.println("Ура, мы умеем летать)");
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Количество крыльев: " + this.countWings + "\n");
    }
}
