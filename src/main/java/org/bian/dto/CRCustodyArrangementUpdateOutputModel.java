package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustodyArrangementUpdateOutputModel
 */
public class CRCustodyArrangementUpdateOutputModel   {
  private String custodyArrangementParameterType = null;

  private String custodyArrangementSelectedOption = null;

  private String custodyArrangementSchedule = null;

  private String custodyArrangementStatus = null;

  private String custodyArrangementUpdateActionTaskReference = null;

  private Object custodyArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return custodyArrangementUpdateActionTaskReference
  **/

  public String getCustodyArrangementUpdateActionTaskReference() {
    return custodyArrangementUpdateActionTaskReference;
  }

  public void setCustodyArrangementUpdateActionTaskReference(String custodyArrangementUpdateActionTaskReference) {
    this.custodyArrangementUpdateActionTaskReference = custodyArrangementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return custodyArrangementUpdateActionTaskRecord
  **/

  public Object getCustodyArrangementUpdateActionTaskRecord() {
    return custodyArrangementUpdateActionTaskRecord;
  }

  public void setCustodyArrangementUpdateActionTaskRecord(Object custodyArrangementUpdateActionTaskRecord) {
    this.custodyArrangementUpdateActionTaskRecord = custodyArrangementUpdateActionTaskRecord;
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

