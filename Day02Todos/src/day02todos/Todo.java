package day02todos;

import java.util.*;
import java.util.regex.*;

public class Todo {

    private String task;
    private GregorianCalendar dueDate;
    private int hoursOfWork;
    // private TaskStatus status;
    // enum TaskStaus {pending, Done};

    public Todo(String task, GregorianCalendar dueDate, int hoursOfWork) {
        setTask(task);
        setDueDate(dueDate);
        setHoursOfWork(hoursOfWork);
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) throws PatternSyntaxException {
        // to create pattern of characters to compare with task
        Pattern pattern = Pattern.compile("[^;|`]*");
        Matcher matcher = pattern.matcher(task);

        if (task.length() < 2 || task.length() > 50 || !matcher.matches()) {
            throw new IllegalArgumentException("Task should be between 2 and 50 characters long and does not include [ ; | `]");
        }

        this.task = task;
    }

    public GregorianCalendar getDueDate() {
        return dueDate;
    }

    public void setDueDate(GregorianCalendar dueDate) {

        if (dueDate.before(new GregorianCalendar(1900, 01, 01)) || dueDate.after(new GregorianCalendar(2100, 12, 31))) {
            throw new IllegalArgumentException("DueDate should be between 1900 and 2100");
        }
        this.dueDate = dueDate;
    }

    public int getHoursOfWork() {
        return hoursOfWork;
    }

    public void setHoursOfWork(int hoursOfWork) {
        if(hoursOfWork < 0){
           throw new IllegalArgumentException("Hours of work should be more or equal 0."); 
        }
        this.hoursOfWork = hoursOfWork;
    }

    @Override
    public String toString() {
        return "Todo{" + "task=" + task + ", dueDate=" + dueDate + ", hoursOfWork=" + hoursOfWork + '}';
    }

}
