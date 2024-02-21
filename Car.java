import java.util.ArrayList;
/**represents a car that stores information of passengers on board and  the capacity of the car
 * stores information about passenfers onboard and capacity of the car and be taken as a group, car, in the train file and responsible for adding and removing a passenger from the train.
 * provides passenger information for train file. 
 */
public class Car {
    static ArrayList<Passenger> passengers = new ArrayList();
    int max;
    public Car(int max, ArrayList<Passenger> passengers){
        this.max = max;
        this.passengers = passengers;
    }
    /**returns maximal number of passengers in this car
    @return max*/
    private int getCapacity(){
        return max;
    }
    /**returns seats remaining
     * @return capacity minus the number of passengers currently in this car
     */
    private int seatsRemaining(){
        int i = passengers.size();
        return max - i;
    }
    /**determine whether there can be one more passenger in the car and add one passenger if it does. 
     * @param p the passenger that needs to get on the car
     * @return whether there can be one more passenger
     */
        public boolean addPassenger(Passenger p){
            if (seatsRemaining() > 0){
                this.passengers.add(p);
                return true;
            }else{
                return false;}}
/**determine whther a specific passenger is in the car and remove the passenger if it does
 * 
 * @param p the passenger that needs to be removed. 
 * @return whether the passenger is in the car. 
 */
        public boolean removePassenger(Passenger p){
            if (passengers.contains(p)){
                passengers.remove(p);
                return true;
            }else{
                return false;
            }}
/**prints out the information about passengers onboard*/
        public void printManifest(){
            if (passengers.size() > 0 ){
                for (Passenger passenger:passengers){
                    System.out.println(passenger.name);
                }
            }else{
                System.out.println("This car is EMPTY.");
            }
        }
       }
            
        
