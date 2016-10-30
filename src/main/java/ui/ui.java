public abstract class ui {
    public abstract void msgbox(String message);
    public abstract boolean yesnobox(String message);
    public abstract int optionbox(String message, String[] options);
    public abstract MapPoint pickOption(Map[] map);
    public abstract void displayMap(Map map);
    public abstract void displayMaps(Map[] map);
}
