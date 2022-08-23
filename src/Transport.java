public class Transport implements warTransport{
    //свойства
    private int speed;           //скорость
    private int cost;            //цена (стоимость)
    private int capacity;        //вместимость по людям
    private boolean isWater;     //водный транспорт?
    private boolean isGround;    //наземный транспорт?
    private boolean isAir;       //воздушный транспорт?
    private boolean isWar;       //военный транспорт?

    //конструкторы
    Transport() {}
    Transport(int speed, int cost, int capacity, boolean isWar) {
        this.speed = speed;
        this.cost = cost;
        this.capacity = capacity;
        this.isWar = isWar;
    }

    //геттеры и сеттеры
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return this.speed;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public int getCost() {
        return this.cost;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return this.capacity;
    }

    public void setWater(boolean isWater) {
        this.isWater = isWater;
    }
    public boolean getWater() {
        return this.isWater;
    }

    public void setGround(boolean isGround) {
        this.isGround = isGround;
    }
    public boolean getGround() {
        return this.isGround;
    }

    public void setAir(boolean isAir) {
        this.isAir = isAir;
    }
    public boolean getAir() {
        return this.isAir;
    }

    public void setWar(boolean isWar) {
        this.isWar = isWar;
    }
    public boolean getWar() {
        return this.isWar;
    }

    //методы
    public void display() {
        System.out.println("Информация о транспорте:\n" +
                "Скорость: " + this.speed + " км/ч\n" +
                "Цена: " + this.cost + " евро\n" +
                "Вместимость: " + this.capacity + " человек\n" +
                "Военный? " + (this.isWar ? "Да":"Нет") + "\n");

    }
    public void attack() {
        if (isWar) {
            System.out.println("К бою готов");
        }else{
            System.out.println("Не могу:9 Я не военный транспорт");
        }
    }
}
