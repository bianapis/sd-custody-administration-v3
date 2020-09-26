package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustodyArrangementRequestOutputModel
 */
public class CRCustodyArrangementRequestOutputModel   {
  private String custodyArrangementParameterType = null;

  private String custodyArrangementSelectedOption = null;

  private String custodyArrangementSchedule = null;

  private String custodyArrangementStatus = null;

  private String custodyArrangementRequestActionTaskReference = null;

  private Object custodyArrangementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Custody Arrangement instance request service call 
   * @return custodyArrangementRequestActionTaskReference
  **/

  public String getCustodyArrangementRequestActionTaskReference() {
    return custodyArrangementRequestActionTaskReference;
  }

  public void setCustodyArrangementRequestActionTaskReference(String custodyArrangementRequestActionTaskReference) {
    this.custodyArrangementRequestActionTaskReference = custodyArrangementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return custodyArrangementRequestActionTaskRecord
  **/

  public Object getCustodyArrangementRequestActionTaskRecord() {
    return custodyArrangementRequestActionTaskRecord;
  }

  public void setCustodyArrangementRequestActionTaskRecord(Object custodyArrangementRequestActionTaskRecord) {
    this.custodyArrangementRequestActionTaskRecord = custodyArrangementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

