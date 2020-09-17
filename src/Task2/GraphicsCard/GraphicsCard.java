package Task2.GraphicsCard;

public class GraphicsCard {
    private String manufactureGraphicsCard;
    private int vRam;
    private String typeMemoryGraphicsCard;
    private Context context;

    public GraphicsCard() {
        context = new Context();
        context.setStrategyCoolingGraphicsCard(new ActiveCoolingGraphicsCard());
    }

    public void setGraphicsCard() {
        context.coolingGraphicsCard();
    }

//    @Override
//    public String toString() {
//        return "Видеокарта: производитель - " + manufactureGraphicsCard + ", тип охлаждения - " + typeCooling + ", объем памяти - " + vRam + " Гб, тип памяти - " + typeMemoryGraphicsCard;
//    }

    public void setGraphicsCard(String manufactureGraphicsCard, int vRam, String typeMemoryGraphicsCard, String typeCooling) {
//        this.manufactureGraphicsCard = manufactureGraphicsCard;
//        this.vRam = vRam;
//        this.typeMemoryGraphicsCard = typeMemoryGraphicsCard;
//        this.typeCooling = typeCooling;

    }
}
