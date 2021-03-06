package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustodyArrangementExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQSecuritiesReportingExecuteInputModel
 */
public class BQSecuritiesReportingExecuteInputModel   {
  private String custodyArrangementInstanceReference = null;

  private String securitiesReportingInstanceReference = null;

  private String securitiesReportingPreconditions = null;

  private String securitiesReportingFeatureSchedule = null;

  private String custodySecuritiesReporting = null;

  private String securitiesReportingPostconditions = null;

  private String securitiesReportingCustodySecuritiesReportingServiceType = null;

  private String securitiesReportingCustodySecuritiesReportingServiceDescription = null;

  private String securitiesReportingCustodySecuritiesReportingServiceInputsandOuputs = null;

  private String securitiesReportingCustodySecuritiesReportingServiceWorkProduct = null;

  private String securitiesReportingCustodySecuritiesReportingServiceName = null;

  private Object securitiesReportingExecuteActionTaskRecord = null;

  private CRCustodyArrangementExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Custody Arrangement instance 
   * @return custodyArrangementInstanceReference
  **/

  public String getCustodyArrangementInstanceReference() {
    return custodyArrangementInstanceReference;
  }

  public void setCustodyArrangementInstanceReference(String custodyArrangementInstanceReference) {
    this.custodyArrangementInstanceReference = custodyArrangementInstanceReference;
  }


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return securitiesReportingExecuteActionTaskRecord
  **/

  public Object getSecuritiesReportingExecuteActionTaskRecord() {
    return securitiesReportingExecuteActionTaskRecord;
  }

  public void setSecuritiesReportingExecuteActionTaskRecord(Object securitiesReportingExecuteActionTaskRecord) {
    this.securitiesReportingExecuteActionTaskRecord = securitiesReportingExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCustodyArrangementExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCustodyArrangementExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

