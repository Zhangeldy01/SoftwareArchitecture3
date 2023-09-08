public class BMW extends Car{

    public BMW(String mark, String model, String color, String bodyType, String fuelType, String transmissionType, int numberOfWheels, double engineVolume) {
        super("BMW", model, color, bodyType, fuelType, transmissionType, numberOfWheels, engineVolume);
    }

    @Override
    protected void movement() {
        System.out.println("Легковой автомобиль" + model + " движется");
    }

    @Override
    protected void turnOnLights() {
        System.out.println("Включение фар автомобиля " + model);
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
    public void transportCargo() {
        System.out.println(model + " перевозит груз");
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
