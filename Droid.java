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

    public String toString(){
        return "Hello, I'm the droid: "+name;
    }

    //Main Method
    public static void main(String[] args) {

        Droid droid = new Droid("Codey");

        System.out.println(droid.toString());
        droid.performTask(droid.name, "singing");
        droid.updateBattery(droid.batteryLevel);;
        System.out.println("Updated battery level is now " +droid.batteryLevel);
    }

    }


