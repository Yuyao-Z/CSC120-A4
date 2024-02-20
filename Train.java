import java.util.ArrayList;
import java.util.Collections;
// import Car;
public class Train {
    Engine myengine;
    ArrayList<Car> cars = new ArrayList<>();
    int nCars;
    int passengerCapacity;
    Engine.FuelType fuelType;
    double fuelCapacity;
    Car car;
    int max;
    private Train(Engine.FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.nCars = cars.size();
        this.passengerCapacity = passengerCapacity;
        for (int i=0; i < nCars; i++){
            ArrayList p = new ArrayList<Passenger>();
            car = new Car(passengerCapacity/nCars, p);
            this.cars.add(car);}
    }
    public Engine getEngine;{
        Engine getEngine = new Engine(fuelType, fuelCapacity);
    }public Car getCar(int i){
        return cars.get(i);
    }public int getMaxCapacity(){
       ArrayList<Integer> numbers = new ArrayList<>();
        for (Car car:cars){
            numbers.add(car.max);
       }
       return Collections.max(numbers);
    }public int seatsRemaining(){
        int sum = 0;
        for (Car car:cars){
            sum += car.max - car.passengers.size();
        }
        return sum;
    }public void printManifest(){
        for (Car car:cars){
            car.printManifest();
            }
        }
    
    public static void main(String[] args) {
        Train mytrain = new Train(Engine.FuelType.STEAM, 90, 1, 70);
        Passenger maria = new Passenger("Maria");
        Passenger mike = new Passenger("Mike");
        mytrain.getCar(0).addPassenger(maria);  
        mytrain.getCar(0).addPassenger(mike);  
        mytrain.printManifest();
    }}


