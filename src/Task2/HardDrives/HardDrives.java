package Task2.HardDrives;

public class HardDrives {
    private String manufactureHardDrives;
    private int capacityHardDrives;
    private Context context;
    private String formFactor;

    public HardDrives() {
        context = new Context();
        context.setStrategyTypeHD(new HDD());
    }

    public void setHardDrives() {
        context.typeHD();
    }
}
