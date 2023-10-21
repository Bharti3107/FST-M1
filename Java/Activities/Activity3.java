package Activities;

public class Activity3 {
    public static void main(String[] args) {
        double seconds = 1000000000;
        double earthAgeSec = 31557600;
        double mercuryAgeSec = 0.2408467;
        double venusAgeSec = 0.61519726;
        double marsAgeSec = 1.8808158;
        double jupiterAgeSec = 11.862615;
        double saturnAgeSec = 29.447498;
        double uranusAgeSec = 84.016846;
        double neptuneAgeSec = 164.79132;

        System.out.println("Age on Earth is:"+seconds/earthAgeSec);
        System.out.println("Age on Mercury is:"+seconds/earthAgeSec/mercuryAgeSec);
        System.out.println("Age on Venus is:"+seconds/earthAgeSec/venusAgeSec);
        System.out.println("Age on Mars is:"+seconds/earthAgeSec/marsAgeSec);
        System.out.println("Age on Jupiter is:"+seconds/earthAgeSec/jupiterAgeSec);
        System.out.println("Age on Saturn is:"+seconds/earthAgeSec/saturnAgeSec);
        System.out.println("Age on Uranus is:"+seconds/earthAgeSec/uranusAgeSec);
        System.out.println("Age on Naptune is:"+seconds/earthAgeSec/neptuneAgeSec);

        System.out.println();
        System.out.println("age with round value");
        System.out.println();


        //With round value
        System.out.println("Age on Earth is:"+Math.round(seconds/earthAgeSec));
        System.out.println("Age on Mercury is:"+Math.round(seconds/earthAgeSec/mercuryAgeSec));
        System.out.println("Age on Venus is:"+Math.round(seconds/earthAgeSec/venusAgeSec));
        System.out.println("Age on Mars is:"+Math.round(seconds/earthAgeSec/marsAgeSec));
        System.out.println("Age on Jupiter is:"+Math.round(seconds/earthAgeSec/jupiterAgeSec));
        System.out.println("Age on Saturn is:"+Math.round(seconds/earthAgeSec/saturnAgeSec));
        System.out.println("Age on Uranus is:"+Math.round(seconds/earthAgeSec/uranusAgeSec));
        System.out.println("Age on Naptune is:"+Math.round(seconds/earthAgeSec/neptuneAgeSec));
    }
}
