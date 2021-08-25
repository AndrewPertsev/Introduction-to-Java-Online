package epam.andrewpertsev.unit4_class.simple.task04_train;

import java.util.List;

public class Logic {

    public static List<Train> sortTrainByNumber(List<Train> train) {
        boolean needIteration = true;   //train.sort(comparing(Train::getNumberTrain));
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < train.size() - 1; i++) {
                if (train.get(i).getNumberTrain() > train.get(i + 1).getNumberTrain()) {
                    Train temp = train.get(i + 1);
                    train.set(i + 1, train.get(i));
                    train.set(i, temp);
                    needIteration = true;
                }
            }
        }
        return train;
    }

    public static List<Train> sortTrainByDestination(List<Train> train) {
        boolean needIteration = true;                   //train.sort(comparing(Train::getDestination));
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < train.size() - 1; i++) {
                if (train.get(i).getDestination().compareTo(train.get(i + 1).getDestination()) > 0) {
                    Train temp = train.get(i + 1);
                    train.set(i + 1, train.get(i));
                    train.set(i, temp);
                    needIteration = true;
                } else if (train.get(i).getDestination().compareTo(train.get(i + 1).getDestination()) == 0) {
                    if (train.get(i).getTimeDeparture().compareTo(train.get(i + 1).getTimeDeparture()) > 0 ) {
                        Train temp = train.get(i + 1);
                        train.set(i + 1, train.get(i));
                        train.set(i, temp);
                        needIteration = true;

                    }
                }
            }
        }
        return train;
    }

    public static Train searchTrainFullInformation(List<Train> train, int numberTrain) {

        boolean isNumber = false;
        for (int i = 0; i < train.size(); i++) {
            if (numberTrain == train.get(i).getNumberTrain()) {
                isNumber = true;
                return train.get(i);
            }
        }
        if (!isNumber) {
            System.out.println("Such train number has not found");
        }
        return null;
    }
}
