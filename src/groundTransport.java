public class groundTransport extends Transport{
    //свойтсва
    private int countWheels;     //количество колёс
    private boolean isElectric;  //электрический?

    {
        setGround(true);
        setWater(false);
        setAir(false);
    }

    //конструкторы
    groundTransport() {
        super();
    }
    groundTransport(int speed, int cost, int capacity, boolean isWar,
                    int countWheels, boolean isElectric) {
        super(speed, cost, capacity, isWar);
        this.countWheels = countWheels;
        this.isElectric = isElectric;
    }

    //геттеры и сеттеры
    public void setCountWheels(int countWheels) {
        this.countWheels = countWheels;
    }
    public int getCountWheels() {
        return countWheels;
    }

    public void setElectric(boolean electric) {
        this.isElectric = isElectric;
    }
    public boolean getElectric() {
        return this.isElectric;
    }

    //методы
    public void display() {
        super.display();
        System.out.println("Количество колёс: " + this.countWheels + "\n" +
                "Электрический? " + (isElectric ? "Да":"Нет") + "\n");
    }

    public void go() {
        System.out.println("Ура, мы едем!:)):)):):");
    }
}
