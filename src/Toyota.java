
/*
 2. Создать конкретный автомобиль путём наследования класса «Car».
 */
public class Toyota extends Car {
    public Toyota(String mark, String model, String color, String bodyType, String fuelType, String transmissionType, int numberOfWheels, double engineVolume) {
        super("Toyota", model, color, bodyType, fuelType, transmissionType, numberOfWheels, engineVolume);
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
