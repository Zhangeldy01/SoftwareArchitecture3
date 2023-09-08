/**
 * Расширенный класс автомобиль с тремя колёсами унаследованный от абстрактного класса Car
 */
public class Tricycle extends Car{
    public Tricycle(String mark, String model, String color, String bodyType, String fuelType, String transmissionType,
                    double engineVolume) {
        super(mark, model, color, bodyType, fuelType, transmissionType, 3, engineVolume);
    }

    @Override
    protected void movement() {
        System.out.println("Трехколесный мотоцикл" + model + " движется");
    }

    @Override
    protected void turnOnLights() {
        System.out.println("Включение фар трехколесного мотоцикла " + model);
    }
    @Override
    protected void changeGear() {
        System.out.println("Переключение передач у трехколесного мотоцикла " + model + " прошла успешно");
    }
    @Override
    public void transportCargo() {
        System.out.println("Перевозка грузов на трехколесном мотоцикле " + model);
    }

    @Override
    public void refueling() {
        System.out.println("Заправка " + fuelType + " прошла успешно");
    }

    @Override
    public void windScreenCleaning() {
        System.out.println("Включение дворников трехколесного мотоцикла " + model);
    }

    @Override
    public void headLightCleaning() {
        System.out.println("Фары очищены");
    }

    @Override
    public void mirrorCleaning() {
        System.out.println("Зеркала очищены");
    }
}
