package OOP_Advanced.telefono;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String ring() {
        
        System.out.println("\n-------------------------\nSonido de iOS!!!"+ this.getRingTone());

        return this.getRingTone();
    }
    @Override
    public String unlock() {
        System.out.println("Iphone desbloqueado *click*");
        return "unlocked iOS";
    }
    @Override
    public void displayInfo() {
        System.out.println("Caracteristicas de celu iOS: ");
        System.out.printf("Version Number: %s - Batery: %d %% - Carrier: %s - Ringtone: %s",this.getVersion(), this.getBatteryPercentage(), this.getCarrier(), this.getRingTone());
        
    }
}


