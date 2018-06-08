package system.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import system.dto.WorkoutDTO;
import system.entities.Workout;
import system.service.WorkoutService;

import java.util.List;
@RestController
public class WorkoutRestController {
    private WorkoutService workoutService;

    @Autowired
    public void setWorkoutService(WorkoutService workoutService) {
        this.workoutService = workoutService;
    }

    @RequestMapping(value = "/createWorkout", method = RequestMethod.POST)
    public void createWorkout(@RequestBody WorkoutDTO workoutDTO) {
        workoutService.createWorkout(workoutDTO);
    }

    @RequestMapping(value = "/getAllWorkouts", method = RequestMethod.GET)
    public List<Workout> getWorkouts(){
        return workoutService.getAllWorkouts();
    }

    @RequestMapping(value = "/getT_Id", method = RequestMethod.GET)
    public int getT_Id(@RequestBody WorkoutDTO workoutDTO){
        return workoutService.getT_Id(workoutDTO);
    }


}
