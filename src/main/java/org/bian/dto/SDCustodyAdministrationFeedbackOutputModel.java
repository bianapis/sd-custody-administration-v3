package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationFeedbackOutputModelCustodyAdministrationFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationFeedbackOutputModel
 */
public class SDCustodyAdministrationFeedbackOutputModel   {
  private String custodyAdministrationFeedbackActionTaskReference = null;

  private Object custodyAdministrationFeedbackActionTaskRecord = null;

  private SDCustodyAdministrationFeedbackOutputModelCustodyAdministrationFeedbackActionRecord custodyAdministrationFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return custodyAdministrationFeedbackActionTaskReference
  **/

  public String getCustodyAdministrationFeedbackActionTaskReference() {
    return custodyAdministrationFeedbackActionTaskReference;
  }

  public void setCustodyAdministrationFeedbackActionTaskReference(String custodyAdministrationFeedbackActionTaskReference) {
    this.custodyAdministrationFeedbackActionTaskReference = custodyAdministrationFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return custodyAdministrationFeedbackActionTaskRecord
  **/

  public Object getCustodyAdministrationFeedbackActionTaskRecord() {
    return custodyAdministrationFeedbackActionTaskRecord;
  }

  public void setCustodyAdministrationFeedbackActionTaskRecord(Object custodyAdministrationFeedbackActionTaskRecord) {
    this.custodyAdministrationFeedbackActionTaskRecord = custodyAdministrationFeedbackActionTaskRecord;
  }


  /**
   * Get custodyAdministrationFeedbackActionRecord
   * @return custodyAdministrationFeedbackActionRecord
  **/

  public SDCustodyAdministrationFeedbackOutputModelCustodyAdministrationFeedbackActionRecord getCustodyAdministrationFeedbackActionRecord() {
    return custodyAdministrationFeedbackActionRecord;
  }

  public void setCustodyAdministrationFeedbackActionRecord(SDCustodyAdministrationFeedbackOutputModelCustodyAdministrationFeedbackActionRecord custodyAdministrationFeedbackActionRecord) {
    this.custodyAdministrationFeedbackActionRecord = custodyAdministrationFeedbackActionRecord;
  }


}

