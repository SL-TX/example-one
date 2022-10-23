package ru.skypro.transport;

import java.util.LinkedList;
import java.util.Queue;

public class TechStantion <T extends Transport>{
    private Queue<T> queue = new LinkedList<>();

    public void addToQueue(T car){
        queue.offer(car);
    }

    public void doTechOsmotr(){
        Transport car = queue.poll();
        if (car != null)
            System.out.println("Проведен техосмотр: "+ car.toString());
        else
            System.out.println("В очереди нет машин");
    }
}
