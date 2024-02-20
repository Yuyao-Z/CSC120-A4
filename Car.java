import java.util.ArrayList;
public class Car {
    static ArrayList<Passenger> passengers = new ArrayList();
    int max;
    public Car(int max, ArrayList<Passenger> passengers){
        this.max = max;
        this.passengers = passengers;
    }
    private int getCapacity(){
        return max;
    }
    private int seatsRemaining(){
        int i = passengers.size();
        return max - i;
    }
    
        public boolean addPassenger(Passenger p){
            if (seatsRemaining() > 0){
                this.passengers.add(p);
                return true;
            }else{
                return false;}}
        
        public boolean removePassenger(Passenger p){
            if (passengers.contains(p)){
                passengers.remove(p);
                return true;
            }else{
                return false;
            }}
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
            
        
