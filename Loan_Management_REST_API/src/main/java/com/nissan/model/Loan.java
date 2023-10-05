package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class Loan {
@Id //making as primary key
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="loan_id")
private Integer loanId;

@Column(name="loan_type",nullable=false,length=60)
private String loanType;

//private Integer customerId;
//@ManyToOne
//    @JoinColumn(name = "customerId",insertable=false,updatable=false)
//    private Customer customer;
   
    //default constructor
public Loan() {

}

public Integer getLoanId() {
return loanId;
}

public String getLoanType() {
return loanType;
}

//public Integer getCustomerId() {
//return customerId;
//}
//
//public Customer getCustomer() {
//return customer;
//}

public void setLoanId(Integer loanId) {
this.loanId = loanId;
}

public void setLoanType(String loanType) {
this.loanType = loanType;
}

//public void setCustomerId(Integer customerId) {
//this.customerId = customerId;
//}
//
//public void setCustomer(Customer customer) {
//this.customer = customer;
//}
//



   
   



}
