package com.nissan.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
@Id // making as primary key
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "customer_id")
private Integer id;

// customer name
@Column(name = "customer_name", nullable = false, length = 60)
private String customerName;

// date of birth
@Column(name = "date_of_birth")
private LocalDate dateOfBirth;

// mobile number
@Column(name = "mobile_number", nullable = false, length = 60)
private String mobileNumber;

// email id
@Column(name = "email_id", nullable = false, length = 60)
private String emailId;

// address
@Column(name = "address", nullable = false, length = 60)
private String address;

// check status of customer
private boolean isActive = true;

// mapping
// private Integer loanId;
// @OneToMany
// @JoinColumn(name = "loan_id", insertable = false, updatable = false)
// private Loan loan;

// mapping to loan
// @OneToMany(mappedBy = "customer")
// private List<Loan> loans;

// mapping to loan
private Integer loanId;
@OneToOne
@JoinColumn(name = "loanId", insertable = false, updatable = false)
private Loan loan;

// mapping to loan officer
private Integer loanOfficerId;
@OneToOne
@JoinColumn(name = "loanOfficerId", insertable = false, updatable = false)
private LoanOfficer loanOfficer;

// mapping to Status
private Integer statusId;
@OneToOne
@JoinColumn(name = "statusId", insertable = false, updatable = false)
private Status status;

// default constructor
public Customer() {

}

// getters and setters
public Integer getId() {
return id;
}

public String getCustomerName() {
return customerName;
}

public LocalDate getDateOfBirth() {
return dateOfBirth;
}

public String getMobileNumber() {
return mobileNumber;
}

public String getEmailId() {
return emailId;
}

public String getAddress() {
return address;
}

public boolean isActive() {
return isActive;
}

// public List<Loan> getLoans() {
// return loans;
// }

public Integer getLoanOfficerId() {
return loanOfficerId;
}

public LoanOfficer getLoanOfficer() {
return loanOfficer;
}

public Integer getStatusId() {
return statusId;
}

public Status getStatus() {
return status;
}

public void setId(Integer id) {
this.id = id;
}

public void setCustomerName(String customerName) {
this.customerName = customerName;
}

public void setDateOfBirth(LocalDate dateOfBirth) {
this.dateOfBirth = dateOfBirth;
}

public void setMobileNumber(String mobileNumber) {
this.mobileNumber = mobileNumber;
}

public void setEmailId(String emailId) {
this.emailId = emailId;
}

public void setAddress(String address) {
this.address = address;
}

public void setActive(boolean isActive) {
this.isActive = isActive;
}

// public void setLoans(List<Loan> loans) {
// this.loans = loans;
// }

public void setLoanOfficerId(Integer loanOfficerId) {
this.loanOfficerId = loanOfficerId;
}

public void setLoanOfficer(LoanOfficer loanOfficer) {
this.loanOfficer = loanOfficer;
}

public void setStatusId(Integer statusId) {
this.statusId = statusId;
}

public void setStatus(Status status) {
this.status = status;
}


public Integer getLoanId() {
return loanId;
}

public Loan getLoan() {
return loan;
}

public void setLoanId(Integer loanId) {
this.loanId = loanId;
}

public void setLoan(Loan loan) {
this.loan = loan;
}

@Override
public String toString() {
return "Customer [id=" + id + ", customerName=" + customerName + ", dateOfBirth=" + dateOfBirth
+ ", mobileNumber=" + mobileNumber + ", emailId=" + emailId + ", address=" + address + ", isActive="
+ isActive + ", loanId=" + loanId + ", loan=" + loan + ", loanOfficerId=" + loanOfficerId
+ ", loanOfficer=" + loanOfficer + ", statusId=" + statusId + ", status=" + status + "]";
}




}
