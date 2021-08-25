package epam.andrewpertsev.unit4_class.simple.task04_train;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public List<Train> scheduleTrain() {

        List<Train> train = new ArrayList<>();
        train.add(new Train("Vienna", 27, "20:00"));
        train.add(new Train("Praga", 28, "16:30"));
        train.add(new Train("Vienna", 29, "12:00"));
        train.add(new Train("Praga", 20, "09:00"));
        train.add(new Train("Praga", 22, "11:00"));
        train.add(new Train("Vienna", 37, "20:00"));
        train.add(new Train("Praga", 38, "16:30"));
        train.add(new Train("Vienna", 39, "12:00"));
        train.add(new Train("Berlin", 30, "09:00"));
        train.add(new Train("Praga", 32, "11:00"));
        return train;
    }
}
