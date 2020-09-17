package Task2.GraphicsCard;

public class Context {
    private StrategyCoolingGraphicsCard strategyCoolingGraphicsCard;

    public void setStrategyCoolingGraphicsCard(StrategyCoolingGraphicsCard strategyCoolingGraphicsCard) {
        this.strategyCoolingGraphicsCard = strategyCoolingGraphicsCard;
    }

    public void coolingGraphicsCard() {
        strategyCoolingGraphicsCard.setTypeCoolingGraphicsCard();
    }
}
