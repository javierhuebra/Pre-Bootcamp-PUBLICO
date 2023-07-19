package OOP_Advanced.telefono;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        System.out.println("\n-------------------------\nSonido de Android!!!"+ this.getRingTone());

        return this.getRingTone();
    }
    @Override
    public String unlock() {
        System.out.println("Android desbloqueado *click*");
        return "unlocked Android";
    }
    @Override
    public void displayInfo() {
        System.out.println("\nCaracteristicas de celu Android:");
        System.out.printf("Version Number: %s - Batery: %d %% - Carrier: %s - Ringtone: %s",this.getVersion(), this.getBatteryPercentage(), this.getCarrier(), this.getRingTone());
    }
}


