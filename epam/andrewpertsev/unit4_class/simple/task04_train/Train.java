package epam.andrewpertsev.unit4_class.simple.task04_train;

//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

import java.text.SimpleDateFormat;
import java.util.Objects;

public class Train {
    private String destination;
    private int numberTrain;
    String timeDeparture;

    public Train() {
    }

    public Train(String destination, int numberTrain, String departureTime) {
        this.destination = destination;
        this.numberTrain = numberTrain;
        this.timeDeparture = departureTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Train)) return false;
        Train train = (Train) o;
        return getNumberTrain() == train.getNumberTrain() &&
                Objects.equals(getDestination(), train.getDestination()) &&
                Objects.equals(getTimeDeparture(), train.getTimeDeparture());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDestination(), getNumberTrain(), getTimeDeparture());
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    public String getTimeDeparture() {
        return timeDeparture;
    }

    public void setTimeDeparture(String timeDeparture) {
        this.timeDeparture = timeDeparture;
    }

    @Override
    public String toString() {
        return "\n "+getClass().getSimpleName()+
                " [destination='" + destination + '\'' +
                ", numberTrain=" + numberTrain +
                ", Departure Time=" + timeDeparture+
                ']';
    }
}
