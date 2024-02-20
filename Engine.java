public class Engine {
    double fuellevel;
    private Engine.FuelType fuel;
    public enum FuelType {
        STEAM, INTERNAL_COMBUSTION, ELECTRIC, OTHER;
    }
    

   Engine(FuelType fuel, double fuellevel){
    this.fuel = fuel;
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
        return abovezero;}
        public static void main(String[] args) {
            Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
            while (myEngine.go()) {
                System.out.println("Choo choo!");
            }
            System.out.println("Out of fuel.");}
        
    }
    
   
   



     
    
