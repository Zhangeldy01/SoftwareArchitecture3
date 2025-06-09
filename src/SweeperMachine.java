/**
 * Расширенный класс автомобиль подметающий улицу унаследованный от абстрактного класса Car.
 * Провести проверку принципа SRP.
 */
public class SweeperMachine extends Car{

    public SweeperMachine(String mark, String model, String color, String bodyType, String fuelType, String gearboxType, int numberOfWheels, double engineSize) {
        super(mark, model, color, bodyType, fuelType, gearboxType, numberOfWheels, engineSize);
    }
    public void sweepStreet() {
        System.out.println(model + " Подметает улицу");
    }
    @Override
    protected void movement() {
        System.out.println("Легковой автомобиль " + model + " движется");
    }

    @Override
    protected void turnOnLights() {
        System.out.println("Включение фар автомобиля " + model);
    }

    @Override
    public void transportCargo() {
        System.out.println("Перевозка грузов на автомобиле " + model);
    }

    @Override
    protected void changeGear() {
        System.out.println("Переключение передач у автомобиля " + model);
    }
    @Override
    public void refueling() {
        System.out.println("Заправка " + fuelType + " прошла успешно");
    }

    @Override
    public void service() {
        System.out.println(model + " находится на обслуживании");
    }
    @Override
    public void windScreenCleaning() {
        System.out.println("У автомобиля " + model + " стекло очищено");
    }

    @Override
    public void headLightCleaning() {
        System.out.println("У автомобиля " + model + " фары очищены");
    }

    @Override
    public void mirrorCleaning() {
        System.out.println("У автомобиля " + model + " зеркала очищены");
    }
}
