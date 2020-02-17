package io.github.conanchen.taskproject.graphql.model;

import java.util.Collection;
import io.github.conanchen.event.graphql.model.DurationGQO;
import io.github.conanchen.personorg.graphql.model.PersonGQO;
import io.github.conanchen.zommon.graphql.model.NodeGQO;

public class TaskGQO implements NodeGQO{

    private ProjectGQO isPartOf;
    private String wbsNO;
    private String name;
    private String alternateName;
    private String description;
    private TaskPriorityGQO priority;
    private PersonGQO creator;
    private Collection<PersonGQO> watcher;
    private java.util.Date planStart;
    private java.util.Date planFinish;
    private DurationGQO duration;
    private Integer percentComplete;
    @javax.validation.constraints.NotNull
    private java.util.Date createdAt;
    @javax.validation.constraints.NotNull
    private java.util.Date updatedAt;
    private TaskGQO parentTask;
    private TaskGQO previousTask;
    private Collection<TaskGQO> subTasks;
    private Collection<TaskGQO> dependsOn;
    private Collection<TaskAssignmentGQO> assignmentHistory;
    private TaskAssignmentGQO latestAssignment;
    private TaskStatusGQO status;
    @javax.validation.constraints.NotNull
    private String id;

    public TaskGQO() {
    }

    public TaskGQO(ProjectGQO isPartOf, String wbsNO, String name, String alternateName, String description, TaskPriorityGQO priority, PersonGQO creator, Collection<PersonGQO> watcher, java.util.Date planStart, java.util.Date planFinish, DurationGQO duration, Integer percentComplete, java.util.Date createdAt, java.util.Date updatedAt, TaskGQO parentTask, TaskGQO previousTask, Collection<TaskGQO> subTasks, Collection<TaskGQO> dependsOn, Collection<TaskAssignmentGQO> assignmentHistory, TaskAssignmentGQO latestAssignment, TaskStatusGQO status, String id) {
        this.isPartOf = isPartOf;
        this.wbsNO = wbsNO;
        this.name = name;
        this.alternateName = alternateName;
        this.description = description;
        this.priority = priority;
        this.creator = creator;
        this.watcher = watcher;
        this.planStart = planStart;
        this.planFinish = planFinish;
        this.duration = duration;
        this.percentComplete = percentComplete;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.parentTask = parentTask;
        this.previousTask = previousTask;
        this.subTasks = subTasks;
        this.dependsOn = dependsOn;
        this.assignmentHistory = assignmentHistory;
        this.latestAssignment = latestAssignment;
        this.status = status;
        this.id = id;
    }

    public ProjectGQO getIsPartOf() {
        return isPartOf;
    }
    public void setIsPartOf(ProjectGQO isPartOf) {
        this.isPartOf = isPartOf;
    }

    public String getWbsNO() {
        return wbsNO;
    }
    public void setWbsNO(String wbsNO) {
        this.wbsNO = wbsNO;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAlternateName() {
        return alternateName;
    }
    public void setAlternateName(String alternateName) {
        this.alternateName = alternateName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public TaskPriorityGQO getPriority() {
        return priority;
    }
    public void setPriority(TaskPriorityGQO priority) {
        this.priority = priority;
    }

    public PersonGQO getCreator() {
        return creator;
    }
    public void setCreator(PersonGQO creator) {
        this.creator = creator;
    }

    public Collection<PersonGQO> getWatcher() {
        return watcher;
    }
    public void setWatcher(Collection<PersonGQO> watcher) {
        this.watcher = watcher;
    }

    public java.util.Date getPlanStart() {
        return planStart;
    }
    public void setPlanStart(java.util.Date planStart) {
        this.planStart = planStart;
    }

    public java.util.Date getPlanFinish() {
        return planFinish;
    }
    public void setPlanFinish(java.util.Date planFinish) {
        this.planFinish = planFinish;
    }

    public DurationGQO getDuration() {
        return duration;
    }
    public void setDuration(DurationGQO duration) {
        this.duration = duration;
    }

    public Integer getPercentComplete() {
        return percentComplete;
    }
    public void setPercentComplete(Integer percentComplete) {
        this.percentComplete = percentComplete;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public TaskGQO getParentTask() {
        return parentTask;
    }
    public void setParentTask(TaskGQO parentTask) {
        this.parentTask = parentTask;
    }

    public TaskGQO getPreviousTask() {
        return previousTask;
    }
    public void setPreviousTask(TaskGQO previousTask) {
        this.previousTask = previousTask;
    }

    public Collection<TaskGQO> getSubTasks() {
        return subTasks;
    }
    public void setSubTasks(Collection<TaskGQO> subTasks) {
        this.subTasks = subTasks;
    }

    public Collection<TaskGQO> getDependsOn() {
        return dependsOn;
    }
    public void setDependsOn(Collection<TaskGQO> dependsOn) {
        this.dependsOn = dependsOn;
    }

    public Collection<TaskAssignmentGQO> getAssignmentHistory() {
        return assignmentHistory;
    }
    public void setAssignmentHistory(Collection<TaskAssignmentGQO> assignmentHistory) {
        this.assignmentHistory = assignmentHistory;
    }

    public TaskAssignmentGQO getLatestAssignment() {
        return latestAssignment;
    }
    public void setLatestAssignment(TaskAssignmentGQO latestAssignment) {
        this.latestAssignment = latestAssignment;
    }

    public TaskStatusGQO getStatus() {
        return status;
    }
    public void setStatus(TaskStatusGQO status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

}