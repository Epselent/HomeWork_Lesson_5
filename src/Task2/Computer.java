package Task2;


import Task2.GraphicsCard.GraphicsCard;
import Task2.HardDrives.HardDrives;
import Task2.MemoryRam.MemoryRam;
import Task2.Monitor.Monitor;
import Task2.Processor.Processor;

public class Computer {
    private Processor processor;
    private MemoryRam memoryRam;
    private GraphicsCard graphicsCard;
    private HardDrives hardDrives;
    private Monitor monitor;

    public Computer() {
        this.processor = new Processor();
        this.memoryRam = new MemoryRam();
        this.graphicsCard = new GraphicsCard();
        this.hardDrives = new HardDrives();
        this.monitor = new Monitor();
    }

    public void setUp() {
        processor.setProcessor();
        memoryRam.setMemoryRam();
        graphicsCard.setGraphicsCard();
        hardDrives.setHardDrives();
        monitor.setMonitor();
    }
}
