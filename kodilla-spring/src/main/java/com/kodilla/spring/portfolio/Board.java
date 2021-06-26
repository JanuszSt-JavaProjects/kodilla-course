package com.kodilla.spring.portfolio;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void addTask(TaskList selectedTaskList, String taskToAdd) {
        selectedTaskList.addTask(taskToAdd);
    }


    List<TaskList> getAllTasksList() {
        return new LinkedList<>(Arrays.asList(
                getToDoList(),
                getInProgressList(),
                getDoneList()));
    }
}
