package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustodyArrangementExecuteOutputModel
 */
public class CRCustodyArrangementExecuteOutputModel   {
  private String custodyArrangementParameterType = null;

  private String custodyArrangementSelectedOption = null;

  private String custodyArrangementSchedule = null;

  private String custodyArrangementStatus = null;

  private String custodyArrangementExecuteActionTaskReference = null;

  private Object custodyArrangementExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Custody Arrangement instance execute service call 
   * @return custodyArrangementExecuteActionTaskReference
  **/

  public String getCustodyArrangementExecuteActionTaskReference() {
    return custodyArrangementExecuteActionTaskReference;
  }

  public void setCustodyArrangementExecuteActionTaskReference(String custodyArrangementExecuteActionTaskReference) {
    this.custodyArrangementExecuteActionTaskReference = custodyArrangementExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return custodyArrangementExecuteActionTaskRecord
  **/

  public Object getCustodyArrangementExecuteActionTaskRecord() {
    return custodyArrangementExecuteActionTaskRecord;
  }

  public void setCustodyArrangementExecuteActionTaskRecord(Object custodyArrangementExecuteActionTaskRecord) {
    this.custodyArrangementExecuteActionTaskRecord = custodyArrangementExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

