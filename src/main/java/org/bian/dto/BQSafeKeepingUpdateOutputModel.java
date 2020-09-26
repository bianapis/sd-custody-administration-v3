package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSafeKeepingUpdateOutputModel
 */
public class BQSafeKeepingUpdateOutputModel   {
  private String safeKeepingPreconditions = null;

  private String safeKeepingFeatureSchedule = null;

  private String securitiesSafeKeeping = null;

  private String safeKeepingPostconditions = null;

  private String safeKeepingSecuritiesSafeKeepingServiceType = null;

  private String safeKeepingSecuritiesSafeKeepingServiceDescription = null;

  private String safeKeepingSecuritiesSafeKeepingServiceInputsandOuputs = null;

  private String safeKeepingSecuritiesSafeKeepingServiceWorkProduct = null;

  private String safeKeepingSecuritiesSafeKeepingServiceName = null;

  private String safeKeepingUpdateActionTaskReference = null;

  private Object safeKeepingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the implementation of the feature 
   * @return safeKeepingPreconditions
  **/

  public String getSafeKeepingPreconditions() {
    return safeKeepingPreconditions;
  }

  public void setSafeKeepingPreconditions(String safeKeepingPreconditions) {
    this.safeKeepingPreconditions = safeKeepingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the fulfillment feature instance 
   * @return safeKeepingFeatureSchedule
  **/

  public String getSafeKeepingFeatureSchedule() {
    return safeKeepingFeatureSchedule;
  }

  public void setSafeKeepingFeatureSchedule(String safeKeepingFeatureSchedule) {
    this.safeKeepingFeatureSchedule = safeKeepingFeatureSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Custody Arrangement specific Business Service 
   * @return securitiesSafeKeeping
  **/

  public String getSecuritiesSafeKeeping() {
    return securitiesSafeKeeping;
  }

  public void setSecuritiesSafeKeeping(String securitiesSafeKeeping) {
    this.securitiesSafeKeeping = securitiesSafeKeeping;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the feature instance has been fulfilled 
   * @return safeKeepingPostconditions
  **/

  public String getSafeKeepingPostconditions() {
    return safeKeepingPostconditions;
  }

  public void setSafeKeepingPostconditions(String safeKeepingPostconditions) {
    this.safeKeepingPostconditions = safeKeepingPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return safeKeepingSecuritiesSafeKeepingServiceType
  **/

  public String getSafeKeepingSecuritiesSafeKeepingServiceType() {
    return safeKeepingSecuritiesSafeKeepingServiceType;
  }

  public void setSafeKeepingSecuritiesSafeKeepingServiceType(String safeKeepingSecuritiesSafeKeepingServiceType) {
    this.safeKeepingSecuritiesSafeKeepingServiceType = safeKeepingSecuritiesSafeKeepingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return safeKeepingSecuritiesSafeKeepingServiceDescription
  **/

  public String getSafeKeepingSecuritiesSafeKeepingServiceDescription() {
    return safeKeepingSecuritiesSafeKeepingServiceDescription;
  }

  public void setSafeKeepingSecuritiesSafeKeepingServiceDescription(String safeKeepingSecuritiesSafeKeepingServiceDescription) {
    this.safeKeepingSecuritiesSafeKeepingServiceDescription = safeKeepingSecuritiesSafeKeepingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return safeKeepingSecuritiesSafeKeepingServiceInputsandOuputs
  **/

  public String getSafeKeepingSecuritiesSafeKeepingServiceInputsandOuputs() {
    return safeKeepingSecuritiesSafeKeepingServiceInputsandOuputs;
  }

  public void setSafeKeepingSecuritiesSafeKeepingServiceInputsandOuputs(String safeKeepingSecuritiesSafeKeepingServiceInputsandOuputs) {
    this.safeKeepingSecuritiesSafeKeepingServiceInputsandOuputs = safeKeepingSecuritiesSafeKeepingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return safeKeepingSecuritiesSafeKeepingServiceWorkProduct
  **/

  public String getSafeKeepingSecuritiesSafeKeepingServiceWorkProduct() {
    return safeKeepingSecuritiesSafeKeepingServiceWorkProduct;
  }

  public void setSafeKeepingSecuritiesSafeKeepingServiceWorkProduct(String safeKeepingSecuritiesSafeKeepingServiceWorkProduct) {
    this.safeKeepingSecuritiesSafeKeepingServiceWorkProduct = safeKeepingSecuritiesSafeKeepingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return safeKeepingSecuritiesSafeKeepingServiceName
  **/

  public String getSafeKeepingSecuritiesSafeKeepingServiceName() {
    return safeKeepingSecuritiesSafeKeepingServiceName;
  }

  public void setSafeKeepingSecuritiesSafeKeepingServiceName(String safeKeepingSecuritiesSafeKeepingServiceName) {
    this.safeKeepingSecuritiesSafeKeepingServiceName = safeKeepingSecuritiesSafeKeepingServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return safeKeepingUpdateActionTaskReference
  **/

  public String getSafeKeepingUpdateActionTaskReference() {
    return safeKeepingUpdateActionTaskReference;
  }

  public void setSafeKeepingUpdateActionTaskReference(String safeKeepingUpdateActionTaskReference) {
    this.safeKeepingUpdateActionTaskReference = safeKeepingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return safeKeepingUpdateActionTaskRecord
  **/

  public Object getSafeKeepingUpdateActionTaskRecord() {
    return safeKeepingUpdateActionTaskRecord;
  }

  public void setSafeKeepingUpdateActionTaskRecord(Object safeKeepingUpdateActionTaskRecord) {
    this.safeKeepingUpdateActionTaskRecord = safeKeepingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

