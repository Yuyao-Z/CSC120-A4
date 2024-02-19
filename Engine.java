public class Engine {
   double fuellevel;
private Engine.FuelType fuelType;

   public enum FuelType {
    STEAM, INTERNAL_COMBUSTION, ELECTRIC, OTHER;
}

   Engine(FuelType fuelType, double fuellevel){
    this.fuelType = fuelType;
    this.fuellevel = fuellevel; 
   }
    public double refuel(double maxlevel){
        fuellevel = maxlevel;
        return fuellevel;}
    public boolean go(){
        int cost = 25;
        boolean abovezero = fuellevel > 0;
        while (abovezero == true){
            System.out.println("Your current fuellevel is:" + fuellevel);
            fuellevel -= cost;
            break;
        }
        return abovezero;
        
    }
    
   
   


}
     
    
