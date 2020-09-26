package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDividendsandInterestInitiateOutputModel
 */
public class BQDividendsandInterestInitiateOutputModel   {
  private String dividendsandInterestInstanceReference = null;

  private String dividendsandInterestInitiateActionReference = null;

  private Object dividendsandInterestInitiateActionRecord = null;

  private String dividendsandInterestInstanceStatus = null;

  private String dividendsandInterestPreconditions = null;

  private String dividendsandInterestFeatureSchedule = null;

  private String custodyDividendsandInterest = null;

  private String dividendsandInterestPostconditions = null;

  private String dividendsandInterestCustodyDividendsandInterestServiceType = null;

  private String dividendsandInterestCustodyDividendsandInterestServiceDescription = null;

  private String dividendsandInterestCustodyDividendsandInterestServiceInputsandOuputs = null;

  private String dividendsandInterestCustodyDividendsandInterestServiceWorkProduct = null;

  private String dividendsandInterestCustodyDividendsandInterestServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Dividends and Interest instance 
   * @return dividendsandInterestInstanceReference
  **/

  public String getDividendsandInterestInstanceReference() {
    return dividendsandInterestInstanceReference;
  }

  public void setDividendsandInterestInstanceReference(String dividendsandInterestInstanceReference) {
    this.dividendsandInterestInstanceReference = dividendsandInterestInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return dividendsandInterestInitiateActionReference
  **/

  public String getDividendsandInterestInitiateActionReference() {
    return dividendsandInterestInitiateActionReference;
  }

  public void setDividendsandInterestInitiateActionReference(String dividendsandInterestInitiateActionReference) {
    this.dividendsandInterestInitiateActionReference = dividendsandInterestInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return dividendsandInterestInitiateActionRecord
  **/

  public Object getDividendsandInterestInitiateActionRecord() {
    return dividendsandInterestInitiateActionRecord;
  }

  public void setDividendsandInterestInitiateActionRecord(Object dividendsandInterestInitiateActionRecord) {
    this.dividendsandInterestInitiateActionRecord = dividendsandInterestInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Dividends and Interest instance (e.g. initialised, pending, active) 
   * @return dividendsandInterestInstanceStatus
  **/

  public String getDividendsandInterestInstanceStatus() {
    return dividendsandInterestInstanceStatus;
  }

  public void setDividendsandInterestInstanceStatus(String dividendsandInterestInstanceStatus) {
    this.dividendsandInterestInstanceStatus = dividendsandInterestInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return dividendsandInterestPreconditions
  **/

  public String getDividendsandInterestPreconditions() {
    return dividendsandInterestPreconditions;
  }

  public void setDividendsandInterestPreconditions(String dividendsandInterestPreconditions) {
    this.dividendsandInterestPreconditions = dividendsandInterestPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return dividendsandInterestFeatureSchedule
  **/

  public String getDividendsandInterestFeatureSchedule() {
    return dividendsandInterestFeatureSchedule;
  }

  public void setDividendsandInterestFeatureSchedule(String dividendsandInterestFeatureSchedule) {
    this.dividendsandInterestFeatureSchedule = dividendsandInterestFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Custody Arrangement specific Business Service 
   * @return custodyDividendsandInterest
  **/

  public String getCustodyDividendsandInterest() {
    return custodyDividendsandInterest;
  }

  public void setCustodyDividendsandInterest(String custodyDividendsandInterest) {
    this.custodyDividendsandInterest = custodyDividendsandInterest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return dividendsandInterestPostconditions
  **/

  public String getDividendsandInterestPostconditions() {
    return dividendsandInterestPostconditions;
  }

  public void setDividendsandInterestPostconditions(String dividendsandInterestPostconditions) {
    this.dividendsandInterestPostconditions = dividendsandInterestPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return dividendsandInterestCustodyDividendsandInterestServiceType
  **/

  public String getDividendsandInterestCustodyDividendsandInterestServiceType() {
    return dividendsandInterestCustodyDividendsandInterestServiceType;
  }

  public void setDividendsandInterestCustodyDividendsandInterestServiceType(String dividendsandInterestCustodyDividendsandInterestServiceType) {
    this.dividendsandInterestCustodyDividendsandInterestServiceType = dividendsandInterestCustodyDividendsandInterestServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return dividendsandInterestCustodyDividendsandInterestServiceDescription
  **/

  public String getDividendsandInterestCustodyDividendsandInterestServiceDescription() {
    return dividendsandInterestCustodyDividendsandInterestServiceDescription;
  }

  public void setDividendsandInterestCustodyDividendsandInterestServiceDescription(String dividendsandInterestCustodyDividendsandInterestServiceDescription) {
    this.dividendsandInterestCustodyDividendsandInterestServiceDescription = dividendsandInterestCustodyDividendsandInterestServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return dividendsandInterestCustodyDividendsandInterestServiceInputsandOuputs
  **/

  public String getDividendsandInterestCustodyDividendsandInterestServiceInputsandOuputs() {
    return dividendsandInterestCustodyDividendsandInterestServiceInputsandOuputs;
  }

  public void setDividendsandInterestCustodyDividendsandInterestServiceInputsandOuputs(String dividendsandInterestCustodyDividendsandInterestServiceInputsandOuputs) {
    this.dividendsandInterestCustodyDividendsandInterestServiceInputsandOuputs = dividendsandInterestCustodyDividendsandInterestServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return dividendsandInterestCustodyDividendsandInterestServiceWorkProduct
  **/

  public String getDividendsandInterestCustodyDividendsandInterestServiceWorkProduct() {
    return dividendsandInterestCustodyDividendsandInterestServiceWorkProduct;
  }

  public void setDividendsandInterestCustodyDividendsandInterestServiceWorkProduct(String dividendsandInterestCustodyDividendsandInterestServiceWorkProduct) {
    this.dividendsandInterestCustodyDividendsandInterestServiceWorkProduct = dividendsandInterestCustodyDividendsandInterestServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return dividendsandInterestCustodyDividendsandInterestServiceName
  **/

  public String getDividendsandInterestCustodyDividendsandInterestServiceName() {
    return dividendsandInterestCustodyDividendsandInterestServiceName;
  }

  public void setDividendsandInterestCustodyDividendsandInterestServiceName(String dividendsandInterestCustodyDividendsandInterestServiceName) {
    this.dividendsandInterestCustodyDividendsandInterestServiceName = dividendsandInterestCustodyDividendsandInterestServiceName;
  }


}

