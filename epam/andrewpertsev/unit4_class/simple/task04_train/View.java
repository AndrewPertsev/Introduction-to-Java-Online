package epam.andrewpertsev.unit4_class.simple.task04_train;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import static epam.andrewpertsev.unit4_class.simple.task04_train.Logic.*;

public class View {
    public void menuConsole(List<Train> train) {
        Instant instant = Instant.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy HH:mm");
        String localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).format(formatter);

        String message = "\nPlease, select an action number : " +
                "\n1. Sort trains by number." +
                "\n2. Sort trains by destination." +
                "\n3. Have an information about your train" +
                "\n4. Exit" +
                "\nDate today : " + localDate;

        while (true) {
            int choice = enterIntFromConsole(message);
            switch (choice) {
                case 1: {
                    System.out.println("Trains sorted by number : " + sortTrainByNumber(train));
                    break;
                }
                case 2: {
                    System.out.println("Trains sorted by destination " + sortTrainByDestination(train));
                    break;
                }
                case 3: {
                    System.out.println("Your result : " + searchTrainFullInformation(train, enterIntFromConsole(" Please, enter train number : ")));
                    break;
                }
                case 4: {
                    System.exit(0);
                }
                default:
                    System.out.println("Please, select action 1-4.");
            }
        }

    }

    public static int enterIntFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println(message);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println(message);
        }
        value = scanner.nextInt();
        return value;
    }
}
