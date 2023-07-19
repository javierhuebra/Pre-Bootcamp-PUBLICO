package OOP_Advanced.telefono;

public abstract class Phone {
    private String versionNumber;
    private int batteryPercentage;
    private String carrier;
    private String ringTone;
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // Método abstracto. Este método será implementado por las subclases
    public abstract void displayInfo();
    
    // getters y setters removidos para resumir. Por favor implementarlos por usted mismo.
    public String getVersion(){
        return versionNumber;
    }
    public int getBatteryPercentage(){
        return batteryPercentage;
    }

    public String getCarrier(){
        return carrier;
    }
    
    public String getRingTone(){
        return ringTone;
    }
}


