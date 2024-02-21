public class Passenger {
    
    public String name;

    public Passenger(String name) {
        this.name = name;
        }
        /**determines whether the passenger can get on the car
        *@param c the car the passengers wants to get in
        *@return whether the passenger can get one the car
        */
        private boolean boardCar(Car c){
            if (c.addPassenger(this) == true){
                return true;
            }else{
                return false;
            }
            }
        /**determines whether a passenger gets off the car
         * 
         * @param c the car the passenger gets off
         * @return whether the passenger can be removed from that car
         */
        private boolean getOffCar(Car c){
            if ( c.removePassenger(this) == true){
                return true;
            }else{
                return false;
            }
            
        }
}
        
        


        


