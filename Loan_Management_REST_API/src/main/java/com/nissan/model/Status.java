package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "status")
public class Status {
@Id // making as primary key
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "status_id")
private Integer statusId;

// status
@Column(name = "status", nullable = false, length = 60)
private String status;

public Integer getStatusId() {
return statusId;
}

public String getStatus() {
return status;
}

public void setStatusId(Integer statusId) {
this.statusId = statusId;
}

public void setStatus(String status) {
this.status = status;
}



}
