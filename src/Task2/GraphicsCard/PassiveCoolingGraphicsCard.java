package Task2.GraphicsCard;

public class PassiveCoolingGraphicsCard implements StrategyCoolingGraphicsCard {

    @Override
    public void setTypeCoolingGraphicsCard() {
        System.out.println("Установлена видеокарта с пасивным охлаждением");
    }
}
