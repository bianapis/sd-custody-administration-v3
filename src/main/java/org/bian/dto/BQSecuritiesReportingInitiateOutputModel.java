package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSecuritiesReportingInitiateOutputModel
 */
public class BQSecuritiesReportingInitiateOutputModel   {
  private String securitiesReportingInstanceReference = null;

  private String securitiesReportingInitiateActionReference = null;

  private Object securitiesReportingInitiateActionRecord = null;

  private String securitiesReportingInstanceStatus = null;

  private String securitiesReportingPreconditions = null;

  private String securitiesReportingFeatureSchedule = null;

  private String custodySecuritiesReporting = null;

  private String securitiesReportingPostconditions = null;

  private String securitiesReportingCustodySecuritiesReportingServiceType = null;

  private String securitiesReportingCustodySecuritiesReportingServiceDescription = null;

  private String securitiesReportingCustodySecuritiesReportingServiceInputsandOuputs = null;

  private String securitiesReportingCustodySecuritiesReportingServiceWorkProduct = null;

  private String securitiesReportingCustodySecuritiesReportingServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Securities Reporting instance 
   * @return securitiesReportingInstanceReference
  **/

  public String getSecuritiesReportingInstanceReference() {
    return securitiesReportingInstanceReference;
  }

  public void setSecuritiesReportingInstanceReference(String securitiesReportingInstanceReference) {
    this.securitiesReportingInstanceReference = securitiesReportingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return securitiesReportingInitiateActionReference
  **/

  public String getSecuritiesReportingInitiateActionReference() {
    return securitiesReportingInitiateActionReference;
  }

  public void setSecuritiesReportingInitiateActionReference(String securitiesReportingInitiateActionReference) {
    this.securitiesReportingInitiateActionReference = securitiesReportingInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return securitiesReportingInitiateActionRecord
  **/

  public Object getSecuritiesReportingInitiateActionRecord() {
    return securitiesReportingInitiateActionRecord;
  }

  public void setSecuritiesReportingInitiateActionRecord(Object securitiesReportingInitiateActionRecord) {
    this.securitiesReportingInitiateActionRecord = securitiesReportingInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Securities Reporting instance (e.g. initialised, pending, active) 
   * @return securitiesReportingInstanceStatus
  **/

  public String getSecuritiesReportingInstanceStatus() {
    return securitiesReportingInstanceStatus;
  }

  public void setSecuritiesReportingInstanceStatus(String securitiesReportingInstanceStatus) {
    this.securitiesReportingInstanceStatus = securitiesReportingInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return securitiesReportingPreconditions
  **/

  public String getSecuritiesReportingPreconditions() {
    return securitiesReportingPreconditions;
  }

  public void setSecuritiesReportingPreconditions(String securitiesReportingPreconditions) {
    this.securitiesReportingPreconditions = securitiesReportingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return securitiesReportingFeatureSchedule
  **/

  public String getSecuritiesReportingFeatureSchedule() {
    return securitiesReportingFeatureSchedule;
  }

  public void setSecuritiesReportingFeatureSchedule(String securitiesReportingFeatureSchedule) {
    this.securitiesReportingFeatureSchedule = securitiesReportingFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Custody Arrangement specific Business Service 
   * @return custodySecuritiesReporting
  **/

  public String getCustodySecuritiesReporting() {
    return custodySecuritiesReporting;
  }

  public void setCustodySecuritiesReporting(String custodySecuritiesReporting) {
    this.custodySecuritiesReporting = custodySecuritiesReporting;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return securitiesReportingPostconditions
  **/

  public String getSecuritiesReportingPostconditions() {
    return securitiesReportingPostconditions;
  }

  public void setSecuritiesReportingPostconditions(String securitiesReportingPostconditions) {
    this.securitiesReportingPostconditions = securitiesReportingPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return securitiesReportingCustodySecuritiesReportingServiceType
  **/

  public String getSecuritiesReportingCustodySecuritiesReportingServiceType() {
    return securitiesReportingCustodySecuritiesReportingServiceType;
  }

  public void setSecuritiesReportingCustodySecuritiesReportingServiceType(String securitiesReportingCustodySecuritiesReportingServiceType) {
    this.securitiesReportingCustodySecuritiesReportingServiceType = securitiesReportingCustodySecuritiesReportingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return securitiesReportingCustodySecuritiesReportingServiceDescription
  **/

  public String getSecuritiesReportingCustodySecuritiesReportingServiceDescription() {
    return securitiesReportingCustodySecuritiesReportingServiceDescription;
  }

  public void setSecuritiesReportingCustodySecuritiesReportingServiceDescription(String securitiesReportingCustodySecuritiesReportingServiceDescription) {
    this.securitiesReportingCustodySecuritiesReportingServiceDescription = securitiesReportingCustodySecuritiesReportingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return securitiesReportingCustodySecuritiesReportingServiceInputsandOuputs
  **/

  public String getSecuritiesReportingCustodySecuritiesReportingServiceInputsandOuputs() {
    return securitiesReportingCustodySecuritiesReportingServiceInputsandOuputs;
  }

  public void setSecuritiesReportingCustodySecuritiesReportingServiceInputsandOuputs(String securitiesReportingCustodySecuritiesReportingServiceInputsandOuputs) {
    this.securitiesReportingCustodySecuritiesReportingServiceInputsandOuputs = securitiesReportingCustodySecuritiesReportingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return securitiesReportingCustodySecuritiesReportingServiceWorkProduct
  **/

  public String getSecuritiesReportingCustodySecuritiesReportingServiceWorkProduct() {
    return securitiesReportingCustodySecuritiesReportingServiceWorkProduct;
  }

  public void setSecuritiesReportingCustodySecuritiesReportingServiceWorkProduct(String securitiesReportingCustodySecuritiesReportingServiceWorkProduct) {
    this.securitiesReportingCustodySecuritiesReportingServiceWorkProduct = securitiesReportingCustodySecuritiesReportingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return securitiesReportingCustodySecuritiesReportingServiceName
  **/

  public String getSecuritiesReportingCustodySecuritiesReportingServiceName() {
    return securitiesReportingCustodySecuritiesReportingServiceName;
  }

  public void setSecuritiesReportingCustodySecuritiesReportingServiceName(String securitiesReportingCustodySecuritiesReportingServiceName) {
    this.securitiesReportingCustodySecuritiesReportingServiceName = securitiesReportingCustodySecuritiesReportingServiceName;
  }


}

