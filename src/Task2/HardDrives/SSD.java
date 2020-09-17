package Task2.HardDrives;

public class SSD implements StrategyTypeHD {
    @Override
    public void setTypeHD() {
        System.out.println("Установлен твердотельный накопитель");
    }
}
