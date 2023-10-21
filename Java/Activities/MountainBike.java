package Activities.Activity7;

public class MountainBike extends Bicycle{
    int seatHeight;
    public MountainBike(int gears, int currentSpeed,int seatHeight) {
        super(gears, currentSpeed);
        this.seatHeight=seatHeight;
    }
    public void setHeight(int newHeight)
    {
        seatHeight=newHeight;
    }

    @Override
    public String bicycleDesc() {
        return (super.bicycleDesc()+ "\nseat height is: " +seatHeight);
    }

    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(4,200,20);
        System.out.println(mountainBike.bicycleDesc());
        mountainBike.speedUp(50);
        mountainBike.applyBrake(100);

    }
}
