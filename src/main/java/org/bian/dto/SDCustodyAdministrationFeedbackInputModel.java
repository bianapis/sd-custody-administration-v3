package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationFeedbackInputModelCustodyAdministrationFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationFeedbackInputModel
 */
public class SDCustodyAdministrationFeedbackInputModel   {
  private Object custodyAdministrationFeedbackActionTaskRecord = null;

  private SDCustodyAdministrationFeedbackInputModelCustodyAdministrationFeedbackActionRecord custodyAdministrationFeedbackActionRecord = null;


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

  public SDCustodyAdministrationFeedbackInputModelCustodyAdministrationFeedbackActionRecord getCustodyAdministrationFeedbackActionRecord() {
    return custodyAdministrationFeedbackActionRecord;
  }

  public void setCustodyAdministrationFeedbackActionRecord(SDCustodyAdministrationFeedbackInputModelCustodyAdministrationFeedbackActionRecord custodyAdministrationFeedbackActionRecord) {
    this.custodyAdministrationFeedbackActionRecord = custodyAdministrationFeedbackActionRecord;
  }


}

