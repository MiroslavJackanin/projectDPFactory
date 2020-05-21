public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Component component = factory.getComponent("RAM");
        component.print();

        component = factory.getComponent("SSD");
        component.print();

        component = factory.getComponent("CPU");
        component.print();

        component = factory.getComponent("MOTHERBOARD");
        if (component == null){
            System.out.println("component not found");
        }
    }
}
