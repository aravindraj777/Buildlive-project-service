package com.buildlive.projectservice.dto.task;


import com.buildlive.projectservice.entity.ProjectStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectResponseDTO {

    private UUID id;
    private String projectName;
    private String address;
    private String city;
    private LocalDate start_date;
    private LocalDate end_date;
    private String project_value;
    private ProjectStatus status;
    private UUID creator;
    private UUID company;
}
