package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSettlementRetrieveOutputModelSettlementInstanceAnalysis;
import org.bian.dto.BQSettlementRetrieveOutputModelSettlementInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSettlementRetrieveOutputModel
 */
public class BQSettlementRetrieveOutputModel   {
  private String settlementPreconditions = null;

  private String settlementFeatureSchedule = null;

  private String businessService = null;

  private String settlementPostconditions = null;

  private String settlementServiceType = null;

  private String settlementServiceDescription = null;

  private String settlementServiceInputsandOuputs = null;

  private String settlementServiceWorkProduct = null;

  private String settlementRetrieveActionTaskReference = null;

  private Object settlementRetrieveActionTaskRecord = null;

  private String settlementRetrieveActionResponse = null;

  private BQSettlementRetrieveOutputModelSettlementInstanceReport settlementInstanceReport = null;

  private BQSettlementRetrieveOutputModelSettlementInstanceAnalysis settlementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return settlementPreconditions
  **/

  public String getSettlementPreconditions() {
    return settlementPreconditions;
  }

  public void setSettlementPreconditions(String settlementPreconditions) {
    this.settlementPreconditions = settlementPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return settlementFeatureSchedule
  **/

  public String getSettlementFeatureSchedule() {
    return settlementFeatureSchedule;
  }

  public void setSettlementFeatureSchedule(String settlementFeatureSchedule) {
    this.settlementFeatureSchedule = settlementFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Custody Arrangement specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return settlementPostconditions
  **/

  public String getSettlementPostconditions() {
    return settlementPostconditions;
  }

  public void setSettlementPostconditions(String settlementPostconditions) {
    this.settlementPostconditions = settlementPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return settlementServiceType
  **/

  public String getSettlementServiceType() {
    return settlementServiceType;
  }

  public void setSettlementServiceType(String settlementServiceType) {
    this.settlementServiceType = settlementServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return settlementServiceDescription
  **/

  public String getSettlementServiceDescription() {
    return settlementServiceDescription;
  }

  public void setSettlementServiceDescription(String settlementServiceDescription) {
    this.settlementServiceDescription = settlementServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return settlementServiceInputsandOuputs
  **/

  public String getSettlementServiceInputsandOuputs() {
    return settlementServiceInputsandOuputs;
  }

  public void setSettlementServiceInputsandOuputs(String settlementServiceInputsandOuputs) {
    this.settlementServiceInputsandOuputs = settlementServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return settlementServiceWorkProduct
  **/

  public String getSettlementServiceWorkProduct() {
    return settlementServiceWorkProduct;
  }

  public void setSettlementServiceWorkProduct(String settlementServiceWorkProduct) {
    this.settlementServiceWorkProduct = settlementServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Settlement instance retrieve service call 
   * @return settlementRetrieveActionTaskReference
  **/

  public String getSettlementRetrieveActionTaskReference() {
    return settlementRetrieveActionTaskReference;
  }

  public void setSettlementRetrieveActionTaskReference(String settlementRetrieveActionTaskReference) {
    this.settlementRetrieveActionTaskReference = settlementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return settlementRetrieveActionTaskRecord
  **/

  public Object getSettlementRetrieveActionTaskRecord() {
    return settlementRetrieveActionTaskRecord;
  }

  public void setSettlementRetrieveActionTaskRecord(Object settlementRetrieveActionTaskRecord) {
    this.settlementRetrieveActionTaskRecord = settlementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return settlementRetrieveActionResponse
  **/

  public String getSettlementRetrieveActionResponse() {
    return settlementRetrieveActionResponse;
  }

  public void setSettlementRetrieveActionResponse(String settlementRetrieveActionResponse) {
    this.settlementRetrieveActionResponse = settlementRetrieveActionResponse;
  }


  /**
   * Get settlementInstanceReport
   * @return settlementInstanceReport
  **/

  public BQSettlementRetrieveOutputModelSettlementInstanceReport getSettlementInstanceReport() {
    return settlementInstanceReport;
  }

  public void setSettlementInstanceReport(BQSettlementRetrieveOutputModelSettlementInstanceReport settlementInstanceReport) {
    this.settlementInstanceReport = settlementInstanceReport;
  }


  /**
   * Get settlementInstanceAnalysis
   * @return settlementInstanceAnalysis
  **/

  public BQSettlementRetrieveOutputModelSettlementInstanceAnalysis getSettlementInstanceAnalysis() {
    return settlementInstanceAnalysis;
  }

  public void setSettlementInstanceAnalysis(BQSettlementRetrieveOutputModelSettlementInstanceAnalysis settlementInstanceAnalysis) {
    this.settlementInstanceAnalysis = settlementInstanceAnalysis;
  }


}

