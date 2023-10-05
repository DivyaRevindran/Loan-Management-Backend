package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan_officer")
public class LoanOfficer {
@Id // making as primary key
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "loanofficer_id")
private Integer loanOfficerId;

// loan officer name
@Column(name = "loanofficer_name", nullable = false, length = 60)
private String loanOfficerName;

//default constructor
public LoanOfficer() {

}

//getters and setters
public Integer getLoanOfficerId() {
return loanOfficerId;
}

public String getLoanOfficerName() {
return loanOfficerName;
}

public void setLoanOfficerId(Integer loanOfficerId) {
this.loanOfficerId = loanOfficerId;
}

public void setLoanOfficerName(String loanOfficerName) {
this.loanOfficerName = loanOfficerName;
}





}
