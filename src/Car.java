//методы: движение, обслуживание, переключение передач, включение фар дворников.

public abstract class Car implements IFuelStation {
    protected String mark, model, color, bodyType, fuelType, transmissionType;
    protected int numberOfWheels;
    protected double engineVolume;
    private boolean light_on;

    public Car(String mark, String model, String color, String bodyType, String fuelType, String transmissionType, int numberOfWheels, double engineVolume) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.numberOfWheels = numberOfWheels;
        this.engineVolume = engineVolume;
    }

    protected void movement() {
    }

    protected void service() {
    }

    protected void changeGear(){
    }

    protected void turnOnLights(){
    }

    public void sweepStreet() {

    }
    // Метод sweepStreet() был добавлен в класс Car, чтобы показать, что можно добавлять новые методы в абстрактный класс без нарушения принципа SRP.

    public abstract void transportCargo();
    // Принцип OCP (Open-Closed Principle) гласит, что классы должны быть открыты для расширения, но закрыты для изменения.
    // В данном случае мы расширили абстрактный класс Car, добавив метод transportCargo().
    // При этом мы не меняли уже существующие методы класса, а только расширили его функциональность. Таким образом, принцип OCP соблюден.
    @Override
    public void refueling() {

    }

    @Override
    public void headLightCleaning() {

    }

    @Override
    public void mirrorCleaning() {

    }

    @Override
    public void windScreenCleaning() {

    }
}
