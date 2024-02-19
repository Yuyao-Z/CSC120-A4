public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
        }
        private boolean boardCar(Car c){
            if (c.addPassenger(this) == true){
                return true;
            }else{
                return false;
            }
            }
        private boolean getOffCar(Car c){
            if ( c.removePassenger(this) == true){
                return true;
            }else{
                return false;
            }
            
        }
}
        
        


        


