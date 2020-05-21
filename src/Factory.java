public class Factory {
    public Component getComponent(String component){
        if (component.equalsIgnoreCase("CPU")){
            return new CPU();
        }
        if (component.equalsIgnoreCase("RAM")){
            return new RAM();
        }
        if (component.equalsIgnoreCase("SSD")){
            return new SSD();
        }
        return null;
    }
}
