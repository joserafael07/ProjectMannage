package com.projectmanager.ProjectMannage.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Member
{
    private String id;
    private String secret;
    private String name;
    private String email;
    private Boolean deleted;
    private List<Project> project;
}
