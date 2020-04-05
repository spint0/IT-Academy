public class GreenHouse {

    private int temperature = 20;
    private int humidity = 10;
    private int plantsCount = 0;
    private int maxPlant;


    public GreenHouse(int maximumPlants) {
        this.maxPlant = maximumPlants;
        System.out.println("This greenHouse will have a maximum of " + maximumPlants + " plants.");


    }

    public void addPlants(int count) {
        if (plantsCount + count > maxPlant) {
            System.out.println("You cannot add so many plants.");
        } else {
            plantsCount += count;
            System.out.println("There are " + plantsCount + " in the GreenHouse.");
        }
    }

    public void increaseTemperature() {
        temperature += 2;
        if (temperature > 30) {
            plantsCount = 0;
            System.out.println("The temperature is too high! All plants died! :(");
        }
        System.out.println("The temperature in greenhouse is: " + temperature);

    }

    public void increaseHumidity() {
        humidity += 5;
        System.out.println("The humidity in greenhouse is: " + humidity);

    }

}
