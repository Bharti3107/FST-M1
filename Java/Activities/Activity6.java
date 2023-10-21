package Activities;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);
        //adding pasenger to the list
        plane.onboard("Ram");
        plane.onboard("Shyam");
        plane.onboard("Mohan");
        plane.onboard("Krishna");
        plane.onboard("Radha");
         //print takeoff time
        System.out.println("takeoff time is:"+plane.takeOff());
        //print passenger names
        System.out.println("Passengers are: "+plane.getPassesngers());
        //sleep() method to pause execution
        Thread.sleep(5000);
        plane.land();
        //print the time of landing
        System.out.println("Plane landing time is: "+plane.getLastTimeLanded());
        //No of passenger after landing
        System.out.println("No of passenger after landing are: "+plane.getPassesngers());

    }
}
