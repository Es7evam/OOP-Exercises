public class Motorcycle{
    private int speed;
    private int gear;
    private int id;
    private static int numberOfMotorcycles = 1000;
    private int maxSpeed;
    private int minSpeed;
    
    
    public Motorcycle(){ //construtor default
        gear = 1;
        speed = 0;
        maxSpeed = 8;
        id = ++numberOfMotorcycles;
    }
    
    public Motorcycle(int speed, int gear){
        this.gear = gear;
        this.speed = speed;
        id = ++numberOfMotorcycles;
    }
    
    //getGear, gearUp, getSpeed, speedUp, applyBreak, getID
    public int getGear(){
        return gear;
    }
    public void gearUp(){
        gear++;
        maxSpeed = gear * 8;
    }
    public int getSpeed(){
        return speed;
    }
    public void speedUp(int acrescimo){
        speed += acrescimo;
            
        if(speed > maxSpeed){
            gearUp();
            speedUp(0);
        }
    }
    public void applyBreak(int decrescimo){
        speed += decrescimo;
        if(speed < 0)
            speed = 0;
    }
    public int getID(){
        return id;
    }
}

