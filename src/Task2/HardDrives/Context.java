package Task2.HardDrives;

public class Context {
    private StrategyTypeHD strategyTypeHD;

    public void setStrategyTypeHD(StrategyTypeHD strategyTypeHD) {
        this.strategyTypeHD = strategyTypeHD;
    }

    public void typeHD() {
        strategyTypeHD.setTypeHD();
    }
}
