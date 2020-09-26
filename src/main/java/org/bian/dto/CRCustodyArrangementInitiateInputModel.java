package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustodyArrangementInitiateInputModel
 */
public class CRCustodyArrangementInitiateInputModel   {
  private String custodyAdministrationServicingSessionReference = null;

  private Object custodyArrangementInitiateActionRecord = null;

  private String custodyArrangementInstanceStatus = null;

  private String custodyArrangementParameterType = null;

  private String custodyArrangementSelectedOption = null;

  private String custodyArrangementType = null;

  private String custodyArrangementReference = null;

  private String custodyArrangementSchedule = null;

  private String custodyArrangementStatus = null;

  private String custodyArrangementCurrency = null;

  private String custodyArrangementRegulationReference = null;

  private String custodyArrangementRegulationType = null;

  private String custodyArrangementJurisdiction = null;

  private String custodyArrangementBookingLocation = null;

  private String custodyArrangementAccountType = null;

  private String custodyArrangementAccountReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return custodyAdministrationServicingSessionReference
  **/

  public String getCustodyAdministrationServicingSessionReference() {
    return custodyAdministrationServicingSessionReference;
  }

  public void setCustodyAdministrationServicingSessionReference(String custodyAdministrationServicingSessionReference) {
    this.custodyAdministrationServicingSessionReference = custodyAdministrationServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return custodyArrangementInitiateActionRecord
  **/

  public Object getCustodyArrangementInitiateActionRecord() {
    return custodyArrangementInitiateActionRecord;
  }

  public void setCustodyArrangementInitiateActionRecord(Object custodyArrangementInitiateActionRecord) {
    this.custodyArrangementInitiateActionRecord = custodyArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Custody Arrangement instance (e.g. initialised, pending, active) 
   * @return custodyArrangementInstanceStatus
  **/

  public String getCustodyArrangementInstanceStatus() {
    return custodyArrangementInstanceStatus;
  }

  public void setCustodyArrangementInstanceStatus(String custodyArrangementInstanceStatus) {
    this.custodyArrangementInstanceStatus = custodyArrangementInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between arrangements according to the type of business services within Custody Arrangement 
   * @return custodyArrangementParameterType
  **/

  public String getCustodyArrangementParameterType() {
    return custodyArrangementParameterType;
  }

  public void setCustodyArrangementParameterType(String custodyArrangementParameterType) {
    this.custodyArrangementParameterType = custodyArrangementParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Custody Arrangement 
   * @return custodyArrangementSelectedOption
  **/

  public String getCustodyArrangementSelectedOption() {
    return custodyArrangementSelectedOption;
  }

  public void setCustodyArrangementSelectedOption(String custodyArrangementSelectedOption) {
    this.custodyArrangementSelectedOption = custodyArrangementSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of Custody Arrangement 
   * @return custodyArrangementType
  **/

  public String getCustodyArrangementType() {
    return custodyArrangementType;
  }

  public void setCustodyArrangementType(String custodyArrangementType) {
    this.custodyArrangementType = custodyArrangementType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to Custody Arrangement 
   * @return custodyArrangementReference
  **/

  public String getCustodyArrangementReference() {
    return custodyArrangementReference;
  }

  public void setCustodyArrangementReference(String custodyArrangementReference) {
    this.custodyArrangementReference = custodyArrangementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to fulfill Custody Arrangement 
   * @return custodyArrangementSchedule
  **/

  public String getCustodyArrangementSchedule() {
    return custodyArrangementSchedule;
  }

  public void setCustodyArrangementSchedule(String custodyArrangementSchedule) {
    this.custodyArrangementSchedule = custodyArrangementSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Custody Arrangement 
   * @return custodyArrangementStatus
  **/

  public String getCustodyArrangementStatus() {
    return custodyArrangementStatus;
  }

  public void setCustodyArrangementStatus(String custodyArrangementStatus) {
    this.custodyArrangementStatus = custodyArrangementStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The curreny which is arranged in Custody Arrangement 
   * @return custodyArrangementCurrency
  **/

  public String getCustodyArrangementCurrency() {
    return custodyArrangementCurrency;
  }

  public void setCustodyArrangementCurrency(String custodyArrangementCurrency) {
    this.custodyArrangementCurrency = custodyArrangementCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the regulation which is defined in Custody Arrangement 
   * @return custodyArrangementRegulationReference
  **/

  public String getCustodyArrangementRegulationReference() {
    return custodyArrangementRegulationReference;
  }

  public void setCustodyArrangementRegulationReference(String custodyArrangementRegulationReference) {
    this.custodyArrangementRegulationReference = custodyArrangementRegulationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification that distinguishes between the regularity domains of Custody Arrangement 
   * @return custodyArrangementRegulationType
  **/

  public String getCustodyArrangementRegulationType() {
    return custodyArrangementRegulationType;
  }

  public void setCustodyArrangementRegulationType(String custodyArrangementRegulationType) {
    this.custodyArrangementRegulationType = custodyArrangementRegulationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the jurisdiction that is assigned to Custody Arrangement in case of legal dispute. 
   * @return custodyArrangementJurisdiction
  **/

  public String getCustodyArrangementJurisdiction() {
    return custodyArrangementJurisdiction;
  }

  public void setCustodyArrangementJurisdiction(String custodyArrangementJurisdiction) {
    this.custodyArrangementJurisdiction = custodyArrangementJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Custody Arrangement, are entered. 
   * @return custodyArrangementBookingLocation
  **/

  public String getCustodyArrangementBookingLocation() {
    return custodyArrangementBookingLocation;
  }

  public void setCustodyArrangementBookingLocation(String custodyArrangementBookingLocation) {
    this.custodyArrangementBookingLocation = custodyArrangementBookingLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of account which is linked to Custody Arrangement 
   * @return custodyArrangementAccountType
  **/

  public String getCustodyArrangementAccountType() {
    return custodyArrangementAccountType;
  }

  public void setCustodyArrangementAccountType(String custodyArrangementAccountType) {
    this.custodyArrangementAccountType = custodyArrangementAccountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account which is linked to Custody Arrangement 
   * @return custodyArrangementAccountReference
  **/

  public String getCustodyArrangementAccountReference() {
    return custodyArrangementAccountReference;
  }

  public void setCustodyArrangementAccountReference(String custodyArrangementAccountReference) {
    this.custodyArrangementAccountReference = custodyArrangementAccountReference;
  }


}

