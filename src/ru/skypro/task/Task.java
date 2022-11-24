package ru.skypro.task;

import ru.skypro.exceptions.DataInvalidException;
import ru.skypro.exceptions.NotImplementedException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Task implements PeriodUtils {
    private static int counter;
    private final Integer id;
    private String header;
    private String description;
    private TaskType type;
    private LocalDateTime dateTime;
    private TaskPeriod taskPeriod;

    public Task(String header, String description, int type, int taskPeriod, String date, String time) throws DataInvalidException {
        try {
            this.id = counter++;
            this.header = header;
            this.description = description;
            this.type = TaskType.values()[type-1];
            this.taskPeriod = TaskPeriod.values()[taskPeriod-1];
            this.dateTime = LocalDateTime.parse(date+" "+time, DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        } catch (DateTimeParseException | ArrayIndexOutOfBoundsException e){
            throw new DataInvalidException(e.getMessage());
        }
    }

    public Integer getId() {
        return id;
    }

    public String getHeader() {
        return header;
    }

    public String getDescription() {
        return description;
    }

    public TaskType getType() {
        return type;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public TaskPeriod getTaskPeriod() {
        return taskPeriod;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setTaskPeriod(TaskPeriod taskPeriod) {
        this.taskPeriod = taskPeriod;
    }

    @Override
    public String whenNext(Task task) throws NotImplementedException {
        switch (taskPeriod) {
            case ONE_OFF -> {
                return "asd";
            }
            case DAILY -> {
                return "as2d";
            }
            case WEEKLY -> {
                return "asd3";
            }
            case MONTHLY -> {
                return "a4sd";
            }
            case YEARLY -> {
                return "a5sd";
            }
        }
        throw new NotImplementedException("taskPeriod");
    }

    @Override
    public String toString() {
        return "Task{" +
                "header='" + header + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", dateTime=" + dateTime +
                ", taskPeriod=" + taskPeriod +
                '}';
    }
}
