package com.buildlive.projectservice.service;

import com.buildlive.projectservice.dto.ProjectTaskDto;
import com.buildlive.projectservice.entity.ProjectTasks;

import java.util.List;
import java.util.UUID;

public interface IProjectTaskService {

    ProjectTasks createTask(ProjectTaskDto taskDto);


    List<ProjectTasks> getAllProjectTasks(UUID projectId, String partyEmail);
}
