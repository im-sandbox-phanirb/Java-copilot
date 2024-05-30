package com.raj.copilot;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {

    @Test
    void testMarkTaskAsDone() {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Test task");
        taskManager.markTaskAsDone("Test task");
        assertTrue(taskManager.getTasks().get(0).isDone(), "Task should be marked as done");
    }

    @Test
    void testTaskIsDone() {
        TaskManager taskManager = new TaskManager();
        TaskManager.Task task = taskManager.new Task("Test task");
        assertFalse(task.isDone(), "Task should not be done initially");
        task.setDone(true);
        assertTrue(task.isDone(), "Task should be done after setDone(true)");
    }

    @Test
    void testTaskSetDone() {
        TaskManager taskManager = new TaskManager();
        TaskManager.Task task = taskManager.new Task("Test task");
        task.setDone(true);
        assertTrue(task.isDone(), "Task should be done after setDone(true)");
        task.setDone(false);
        assertFalse(task.isDone(), "Task should not be done after setDone(false)");
    }
}