import java.util.Scanner;
import java.io.IOException;

public class Game {
    // Attributes
    Player[] players;
    Board board;
    Scanner scanner;
    int turn;
    boolean game_over, draw;

    // Constructor
    public Game()
    {
        players = new Player[2];
        scanner = new Scanner(System.in);

        board = new Board();
        turn = 0;
        game_over = false;
        draw = false;
    }

    // Method - Clear Screen
    public static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                // Command for Windows (cmd.exe)
                new ProcessBuilder("cmd", "/c", "cls")
                        .inheritIO()
                        .start()
                        .waitFor();
            } else {
                // Command for Linux/macOS
                new ProcessBuilder("clear")
                        .inheritIO()
                        .start()
                        .waitFor();
            }
        } catch (final Exception e) {
            // Handle exceptions like IOException or InterruptedException
            System.out.println("Error attempting to clear console: " + e.getMessage());
        }
    }

    // Method - Take players names as input
    private void takeNamesInput()
    {
        for (int i = 0; i < 2; i++)
        {
            boolean valid = true;
            String name;

            players[i] = new Player();

            do {
                // Take input
                System.out.print("Enter name of the player " + (i + 1) + ": ");
                name = scanner.nextLine();

                if (!name.isEmpty())
                {
                    if (i == 1)
                    {
                        if (Player.areNamesEqual(name, players[0].getName()))
                        {
                            valid = false;
                            System.out.println("Name already exists!");
                            continue;
                        }
                    }
                    valid = true;
                }
                else
                {
                    valid = false;
                    System.out.println("Invalid name!");
                }

            } while (!valid);

            players[i].setName(name);
        }
    }

    // Methad - Take Symbol input
    private void takeSymbolsInput()
    {
        for (int i = 0; i < 2; i++)
        {
            boolean valid = true;
            char symbol;

            do {
                // Take input
                System.out.print("Enter symbol of the player " + (i + 1) + ": ");
                symbol = scanner.nextLine().charAt(0);

                if (Character.isAlphabetic(symbol))
                {
                    if (i == 1)
                    {
                        if (Player.areSymbolsEqual(symbol, players[0].getSymbol()))
                        {
                            valid = false;
                            System.out.println("Symbol already taken!");
                            continue;
                        }
                    }
                    valid = true;
                }
                else
                {
                    System.out.println("Invalid symbol!");
                    valid = false;
                }

            } while (!valid);

            players[i].setSymbol(symbol);
        }
    }

    // Method - Display turn
    private void displayTurn()
    {
        System.out.println("\nTurn of Player: " + players[turn].getName() + "\n");
    }

    // Method - Place symbol via input
    private void placeSymbol()
    {
        boolean valid = false;
        int r = 0, c = 0;

        do {
            // Take input
            System.out.print("Enter cell location to insert symbol: ");
            int location = scanner.nextInt();

            // Check validity
            if (location > 0 && location <= 9)
                valid = true;
            else
            {
                System.out.println("Invalid location!");
                continue;
            }

            // Calculate index for row and column
            location--;
            r = location / 3;
            c = location % 3;

            // Check if symbol is eligible to be placed at given location
            valid = board.isEmptyCell(r, c);

            // Message if not eligible
            if (!valid)
                System.out.println("The cell is already occupied!");

        } while (!valid);

        board.placeSymbol(players[turn].getSymbol(), r, c);
    }

    // Method - Check winner
    private void checkWinner()
    {
        for (int i = 0; i < 3; i++)
        {
            // Row
            if (!board.isEmptyCell(i, 1))
            {
                if (board.getCell(i, 0) == board.getCell(i, 1) && board.getCell(i, 1) == board.getCell(i, 2))
                    game_over = true;
            }

            // Column
            if (!board.isEmptyCell(1, i))
            {
                if (board.getCell(0, i) == board.getCell(1, i) && board.getCell(1, i) == board.getCell(2, i))
                    game_over = true;
            }
        }

        // Diagonal
        if (!board.isEmptyCell(1, 1))
        {
            if (board.getCell(0, 0) == board.getCell(1, 1) && board.getCell(1, 1) == board.getCell(2, 2))
                game_over = true;

            else if (board.getCell(0, 2) == board.getCell(1, 1) && board.getCell(1, 1) == board.getCell(2, 0))
                game_over = true;
        }

        // Draw check
        if (!game_over && board.isGridFull())
        {
            game_over = true;
            draw = true;
        }
    }

    // Method - Update game stats
    private void updateStats()
    {
        // Check winner
        checkWinner();

        // Update turn
        if (!game_over)
            turn ^= 1;
    }

    // Method - Announce result
    private void announceResult()
    {
        // Clear Screen
        clearConsole();

        // Display the board
        board.display();

        // Announce winner/draw
        if (draw)
            System.out.println("Game Draw!");
        else
            System.out.println("Winner is " + players[turn].getName());
    }

    // Method - Game loop
    public void start()
    {
        // Take players data
        takeNamesInput();
        takeSymbolsInput();

        // Game Loop
        while (!game_over)
        {
            // Clear Screen
            clearConsole();

            // Display the board
            board.display();

            // Display turn message
            displayTurn();

            // Take input to place symbol
            placeSymbol();

            // Update game stats
            updateStats();
        }

        // Close scanner
        scanner.close();

        // Result announce
        announceResult();
    }
}
