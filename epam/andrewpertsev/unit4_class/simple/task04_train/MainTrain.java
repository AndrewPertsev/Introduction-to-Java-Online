package epam.andrewpertsev.unit4_class.simple.task04_train;

import java.util.List;

//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
//номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

public class MainTrain {
    public static void main(String[] args) {
        List<Train> trainSchedule;

        DataBase db = new DataBase();

        trainSchedule = db.scheduleTrain();

        new View().menuConsole(trainSchedule);

    }
}
