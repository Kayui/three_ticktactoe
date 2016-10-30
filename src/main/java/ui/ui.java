public abstract class ui {
    public abstract void msgBox(String message);
    public abstract boolean yesNoBox(String message);
    public abstract int optionBox(String message, String[] options);
    public abstract MapPoint pickOption(Map[] map);
    public abstract void displayMap(Map map);
    public abstract void displayMaps(Map[] map);
}
