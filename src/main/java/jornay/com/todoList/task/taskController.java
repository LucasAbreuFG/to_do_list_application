package jornay.com.todoList.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class taskController {
    
    @Autowired
    private ITaskRepository taskRepository;

    @PostMapping("/")
    public TaskModal create(@RequestBody TaskModal taskModal){
        var task = this.taskRepository.save(taskModal);

        return task;
    }
}
