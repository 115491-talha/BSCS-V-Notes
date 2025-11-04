public class Board {
    // Attributes
    private char[][] grid;

    // Constructor
    public Board()
    {
        initializeGrid();
    }

    // Getter
    public char getCell(int r, int c)
    {
        return grid[r][c];
    }

    // Method - Initialize Grid
    private void initializeGrid()
    {
        grid = new char[3][3];

        clearGrid();
    }

    // Method - Check if a cell is empty
    public boolean isEmptyCell(int r, int c)
    {
        return grid[r][c] == ' ';
    }

    // Method - Check if grid is full
    public boolean isGridFull()
    {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (isEmptyCell(i, j)) return false;

        return true;
    }

    // Method - Clear Board Grid
    public void clearGrid()
    {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                grid[i][j] = ' ';
    }

    // Method - Place Symbol
    public void placeSymbol(char symbol, int r, int c)
    {
        if (Character.isAlphabetic(symbol))
            grid[r][c] = symbol;
    }

    // Method - Display Grid
    public void display()
    {
        int count = 1;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                // Show cell
                if (isEmptyCell(i, j))
                    System.out.print(" " + count + " ");
                else
                    System.out.print(" " + grid[i][j] + " ");

                // Separator
                if (j < 2)
                    System.out.print('|');

                // Increment count
                count++;
            }
            // Separator
            if (i < 2)
                System.out.print("\n---+---+---");

            // Line-Break
            System.out.println();
        }
    }
}
