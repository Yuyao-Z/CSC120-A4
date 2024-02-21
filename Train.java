import java.util.ArrayList;
/**represents train in this project
 * uses methods, classes and variables from other files to creat an engine, gets information about train/a car in it, and prints out all the information.
 * the main file in this projects.
 */
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
    /**creat a new engine */
    public Engine getEngine;{
        Engine getEngine = new Engine(fuelType, fuelCapacity);
    }
    /**get a specific car according to its assigned number in the list */
    public Car getCar(int i){
        return cars.get(i);
    }
     /** return the maximum total capacity across all `Car`s
     * 
     * @return the sum of the number of maximum seats of all cars
     */
    public double getMaxCapacity(){
       double sum = 0;
        for (Car car:cars){
            sum += car.max;
       }
       return sum;
    /**finds out how many seats remaining in the train
     * @return the sum of remaining seats in each car
     */
    }public int seatsRemaining(){
        int sum = 0;
        for (Car car:cars){
            sum += car.max - car.passengers.size();
        }
        return sum;
    /**prints out the passenger information on the car
     */
    }public void printManifest(){
        for (Car car:cars){
            car.printManifest();
            }
        }
    

    }


