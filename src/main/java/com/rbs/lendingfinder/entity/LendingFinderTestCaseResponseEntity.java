package com.rbs.lendingfinder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "THS_LENF_TEST_TXN_TB")
public class LendingFinderTestCaseResponseEntity extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TEST_TXN_ID")
	private Integer testTransactionId;
	@Column(name = "TEST_SET_ID")
	private Integer testSetId;
	@Column(name = "TEST_TXN_NO")
	private String testTransactionNo;
	@Column(name = "APPL_IDENTITY")
	private Integer applicationIdentity;
	@Column(name = "BANK_DIVISION")
	private Integer bankDivision;
	@Column(name = "TEST_TXN_FLAG")
	private Character testTransactionFlag;
	@Column(name = "PURPOSE_TD")
	private Integer purpostId;
	@Column(name = "CURRENTACCT_FLAG")
	private Boolean currentAcctFlag;
	@Column(name = "OVERDRAFT_FLAG")
	private Boolean overdraftFlag;
	@Column(name = "EXPT_PRD_FAMILY")
	private String expectedProductFamily;
	@Column(name = "EXPT_PRD_NAME")
	private String expectedProductName;
	@Column(name = "ACT_PRD_FAMILY")
	private String actualProductFamily;
	@Column(name = "ACT_PRD_NAME")
	private String actualProductName;
	
	
	public Integer getTestTransactionId() {
		return testTransactionId;
	}
	public void setTestTransactionId(Integer testTransactionId) {
		this.testTransactionId = testTransactionId;
	}
	public Integer getTestSetId() {
		return testSetId;
	}
	public void setTestSetId(Integer testSetId) {
		this.testSetId = testSetId;
	}
	public String getTestTransactionNo() {
		return testTransactionNo;
	}
	public void setTestTransactionNo(String testTransactionNo) {
		this.testTransactionNo = testTransactionNo;
	}
	public Integer getApplicationIdentity() {
		return applicationIdentity;
	}
	public void setApplicationIdentity(Integer applicationIdentity) {
		this.applicationIdentity = applicationIdentity;
	}
	public Integer getBankDivision() {
		return bankDivision;
	}
	public void setBankDivision(Integer bankDivision) {
		this.bankDivision = bankDivision;
	}
	
	public Character getTestTransactionFlag() {
		return testTransactionFlag;
	}
	public void setTestTransactionFlag(Character testTransactionFlag) {
		this.testTransactionFlag = testTransactionFlag;
	}
	public Integer getPurpostId() {
		return purpostId;
	}
	public void setPurpostId(Integer purpostId) {
		this.purpostId = purpostId;
	}
	
	public Boolean getOverdraftFlag() {
		return overdraftFlag;
	}
	public void setOverdraftFlag(Boolean overdraftFlag) {
		this.overdraftFlag = overdraftFlag;
	}
	public String getExpectedProductFamily() {
		return expectedProductFamily;
	}
	public void setExpectedProductFamily(String expectedProductFamily) {
		this.expectedProductFamily = expectedProductFamily;
	}
	public String getExpectedProductName() {
		return expectedProductName;
	}
	public void setExpectedProductName(String expectedProductName) {
		this.expectedProductName = expectedProductName;
	}
	public String getActualProductFamily() {
		return actualProductFamily;
	}
	public void setActualProductFamily(String actualProductFamily) {
		this.actualProductFamily = actualProductFamily;
	}
	public String getActualProductName() {
		return actualProductName;
	}
	public void setActualProductName(String actualProductName) {
		this.actualProductName = actualProductName;
	}
	public Boolean getCurrentAcctFlag() {
		return currentAcctFlag;
	}
	public void setCurrentAcctFlag(Boolean currentAcctFlag) {
		this.currentAcctFlag = currentAcctFlag;
	}
}
