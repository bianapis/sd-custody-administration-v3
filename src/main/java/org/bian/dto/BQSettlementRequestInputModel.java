package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustodyArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQSettlementRequestInputModel
 */
public class BQSettlementRequestInputModel   {
  private String custodyArrangementInstanceReference = null;

  private String settlementInstanceReference = null;

  private String settlementPreconditions = null;

  private String settlementFeatureSchedule = null;

  private String businessService = null;

  private String settlementPostconditions = null;

  private String settlementServiceType = null;

  private String settlementServiceDescription = null;

  private String settlementServiceInputsandOuputs = null;

  private String settlementServiceWorkProduct = null;

  private Object settlementRequestActionTaskRecord = null;

  private CRCustodyArrangementRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Settlement instance 
   * @return settlementInstanceReference
  **/

  public String getSettlementInstanceReference() {
    return settlementInstanceReference;
  }

  public void setSettlementInstanceReference(String settlementInstanceReference) {
    this.settlementInstanceReference = settlementInstanceReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return settlementRequestActionTaskRecord
  **/

  public Object getSettlementRequestActionTaskRecord() {
    return settlementRequestActionTaskRecord;
  }

  public void setSettlementRequestActionTaskRecord(Object settlementRequestActionTaskRecord) {
    this.settlementRequestActionTaskRecord = settlementRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustodyArrangementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustodyArrangementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

