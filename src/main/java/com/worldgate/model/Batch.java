package com.worldgate.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Batch")

public class Batch {

    @Id
    @GeneratedValue

    @Column(name="BATCH_ID")
    private int batchId;

    @Column(name="NAME")
    private String name;

    @Column(name="CURRICULUM")
    private String curriculum;

    @Column(name="TRAINER")
    private String trainer;

    @Column(name="LOCATION")
    private String location;

    @Column(name="BUILDING")
    private String building;

    @Column(name="ROOM")
    private int room;

    @Column(name="START_DATE")
    private Date startDate;

    @Column(name="END_DATE")
    private Date endDate;

    public Batch(String name, String curriculum, String trainer, String location, String building, int room, Date startDate, Date endDate) {
        this.name = name;
        this.curriculum = curriculum;
        this.trainer = trainer;
        this.location = location;
        this.building = building;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Batch)) return false;

        Batch batch = (Batch) o;

        if (batchId != batch.batchId) return false;
        if (room != batch.room) return false;
        if (name != null ? !name.equals(batch.name) : batch.name != null) return false;
        if (curriculum != null ? !curriculum.equals(batch.curriculum) : batch.curriculum != null) return false;
        if (trainer != null ? !trainer.equals(batch.trainer) : batch.trainer != null) return false;
        if (location != null ? !location.equals(batch.location) : batch.location != null) return false;
        if (building != null ? !building.equals(batch.building) : batch.building != null) return false;
        if (startDate != null ? !startDate.equals(batch.startDate) : batch.startDate != null) return false;
        return endDate != null ? endDate.equals(batch.endDate) : batch.endDate == null;
    }

    @Override
    public int hashCode() {
        int result = batchId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (curriculum != null ? curriculum.hashCode() : 0);
        result = 31 * result + (trainer != null ? trainer.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (building != null ? building.hashCode() : 0);
        result = 31 * result + room;
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchId=" + batchId +
                ", name='" + name + '\'' +
                ", curriculum='" + curriculum + '\'' +
                ", trainer='" + trainer + '\'' +
                ", location='" + location + '\'' +
                ", building='" + building + '\'' +
                ", room=" + room +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
