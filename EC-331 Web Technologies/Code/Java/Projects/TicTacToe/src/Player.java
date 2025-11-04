public class Player {
    // Attributes
    private String name;
    private char symbol;

    // Constructor
    public Player() {}
    public Player(String name, char symbol)
    {
        setName(name);
        setSymbol(symbol);
    }

    // Setters
    public void setName(String name)
    {
        if (!name.isEmpty()) this.name = name;
    }

    public void setSymbol(char symbol)
    {
        if (Character.isAlphabetic(symbol)) this.symbol = Character.toUpperCase(symbol);
    }

    // Getters
    public String getName()
    {
        return name;
    }

    public char getSymbol()
    {
        return symbol;
    }

    // Method - Check names equality
    public static boolean areNamesEqual(String name1, String name2)
    {
        return name1.equalsIgnoreCase(name2);
    }

    // Method - Check symbols equality
    public static boolean areSymbolsEqual(char symbol1, char symbol2)
    {
        return Character.toUpperCase(symbol1) == Character.toUpperCase(symbol2);
    }
}
