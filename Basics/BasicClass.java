class Bicycle{
    int speed = 0;
    int gear = 1;

    void speedUp(int increment){
        speed += increment;
    }

    void applyBreak(int decrement){
        speed -= decrement;
    }

    void changeGear(int newGear){
        gear = newGear;
    }

    void printStates(){
        System.out.println("Current speed : " + speed + " gear : " + gear);
    }
}

public class BasicClass{
    public static void main(String[] args){
        Bicycle redBus = new Bicycle();
        redBus.speedUp(30);
        redBus.changeGear(3);

        redBus.printStates();

        redBus.speedUp(60);
        redBus.changeGear(5);

        redBus.printStates();
    }
    
}