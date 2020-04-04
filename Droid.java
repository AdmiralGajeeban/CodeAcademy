//Creating a new droid and giving it properties and methods!
//Gajeeban Thavendran 04/04/2020

public class Droid {

    //Two characteristics
    String name;
    int batteryLevel;

    //Constructor
    public Droid(String name) {
        this.name = name;
        batteryLevel = 100;
    }

    //Performing a task
    public void performTask(String name, String task){
        System.out.println(name+ " is performing task: "+task);
    }

    //Updating the battery after a task
    public void updateBattery(int Level){
        batteryLevel = Level - 10;
    }

    //Transfering battery power from one droid to another

    public int energyTransfer (int x, int y){
        int a = x + y;
        return a;
    }

    public int energyLoss (int x, int y){
        int a = x - y;
        return a;
    }

    public String toString(){
        return "Hello, I'm the droid: "+name;
    }

    //Main Method
    public static void main(String[] args) {

        Droid droid = new Droid("Codey");

        System.out.println(droid.toString());
        droid.performTask(droid.name, "singing");
        droid.updateBattery(droid.batteryLevel);;
        droid.performTask(droid.name, "dancing");
        droid.updateBattery(droid.batteryLevel);;
        System.out.println("Updated battery level for " +droid.name+ " is now " +droid.batteryLevel);


        Droid droid2 = new Droid ("Hisoka");
        System.out.println(droid2.toString());

        int update = droid.energyTransfer(droid.batteryLevel, droid2.batteryLevel);
        int update2 = droid2.energyLoss(droid2.batteryLevel, 10);
        System.out.println("Energy transferred to " + droid.name + " from " + droid2.name +". " + droid.name +" now has " + droid.batteryLevel +" and " + droid2.name+" has " +droid2.batteryLevel);



    }

    }


