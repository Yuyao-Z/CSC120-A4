public class Engine {
    double fuellevel;
    Engine.FuelType fuel;
    public enum FuelType {
        STEAM, INTERNAL_COMBUSTION, ELECTRIC, OTHER;
    }
    

   Engine(FuelType fuel, double fuellevel){
    this.fuel = fuel;
    this.fuellevel = fuellevel; 
   }
   /**reset the current fuel level to maximum
    * 
    * @param maxlevel the maximum fuel level for this engine
    * @return the current fuel level tha equeals to the maximum fuel level of the engine
    */
    public double refuel(double maxlevel){
        fuellevel = maxlevel;
        return fuellevel;}
    /**decrease the current fuel level, print some useful information, and print out whether there is fuel left after the decrement
     * 
     * @return whether there is fuel 
     */
    public boolean go(){
        int cost = 25;
        boolean abovezero = fuellevel > 0;
        while (abovezero == true){
            System.out.println("Your current fuellevel is:" + fuellevel);
            fuellevel -= cost;
            break;
        }
        return abovezero;}

        
    }