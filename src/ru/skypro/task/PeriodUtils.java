package ru.skypro.task;

import ru.skypro.exceptions.NotImplementedException;
import ru.skypro.task.Task;

public interface PeriodUtils {

    String whenNext(Task task) throws NotImplementedException;
}
