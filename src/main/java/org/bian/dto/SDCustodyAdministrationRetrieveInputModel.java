package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationRetrieveInputModelCustodyAdministrationOfferedService;
import org.bian.dto.SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationRetrieveInputModel
 */
public class SDCustodyAdministrationRetrieveInputModel   {
  private Object custodyAdministrationRetrieveActionTaskRecord = null;

  private String custodyAdministrationRetrieveActionRequest = null;

  private SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecord custodyAdministrationRetrieveActionRecord = null;

  private SDCustodyAdministrationRetrieveInputModelCustodyAdministrationOfferedService custodyAdministrationOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return custodyAdministrationRetrieveActionTaskRecord
  **/

  public Object getCustodyAdministrationRetrieveActionTaskRecord() {
    return custodyAdministrationRetrieveActionTaskRecord;
  }

  public void setCustodyAdministrationRetrieveActionTaskRecord(Object custodyAdministrationRetrieveActionTaskRecord) {
    this.custodyAdministrationRetrieveActionTaskRecord = custodyAdministrationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return custodyAdministrationRetrieveActionRequest
  **/

  public String getCustodyAdministrationRetrieveActionRequest() {
    return custodyAdministrationRetrieveActionRequest;
  }

  public void setCustodyAdministrationRetrieveActionRequest(String custodyAdministrationRetrieveActionRequest) {
    this.custodyAdministrationRetrieveActionRequest = custodyAdministrationRetrieveActionRequest;
  }


  /**
   * Get custodyAdministrationRetrieveActionRecord
   * @return custodyAdministrationRetrieveActionRecord
  **/

  public SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecord getCustodyAdministrationRetrieveActionRecord() {
    return custodyAdministrationRetrieveActionRecord;
  }

  public void setCustodyAdministrationRetrieveActionRecord(SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecord custodyAdministrationRetrieveActionRecord) {
    this.custodyAdministrationRetrieveActionRecord = custodyAdministrationRetrieveActionRecord;
  }


  /**
   * Get custodyAdministrationOfferedService
   * @return custodyAdministrationOfferedService
  **/

  public SDCustodyAdministrationRetrieveInputModelCustodyAdministrationOfferedService getCustodyAdministrationOfferedService() {
    return custodyAdministrationOfferedService;
  }

  public void setCustodyAdministrationOfferedService(SDCustodyAdministrationRetrieveInputModelCustodyAdministrationOfferedService custodyAdministrationOfferedService) {
    this.custodyAdministrationOfferedService = custodyAdministrationOfferedService;
  }


}

