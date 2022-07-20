public class Car extends Vehicle implements Service {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " +getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку в автомобиле");
    }
    private void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля");
    }
}
