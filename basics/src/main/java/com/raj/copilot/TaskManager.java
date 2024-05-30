package com.raj.copilot;

import java.util.ArrayList;
import java.util.List;



/**
 * The TaskManager class represents a manager for tasks.
 * It allows adding tasks, marking tasks as done, and retrieving the list of tasks.
 */
/**
 * The TaskManager class represents a manager for tasks.
 * It allows adding tasks, marking tasks as done, and retrieving the list of tasks.
 */
public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String description) {
        this.tasks.add(new Task(description));
    }

    public List<Task> getTasks() {
        return this.tasks;
    }

    public void markTaskAsDone(String description) {
        for (Task task : tasks) {
            if (task.getDescription().equals(description)) {
                task.setDone(true);
                break;
            }
        }
    }

    /**
     * Represents a task with a description and completion status.
     */
    public class Task {
        private String description;
        private boolean done;

        /**
         * Constructs a task with the given description.
         * The task is initially not done.
         *
         * @param description the description of the task
         */
        public Task(String description) {
            this.description = description;
            this.done = false;
        }

        /**
         * Returns the description of the task.
         *
         * @return the description of the task
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * Returns the completion status of the task.
         *
         * @return true if the task is done, false otherwise
         */
        public boolean isDone() {
            return this.done;
        }

        /**
         * Sets the completion status of the task.
         *
         * @param done the completion status of the task
         */
        public void setDone(boolean done) {
            this.done = done;
        }
    }
}