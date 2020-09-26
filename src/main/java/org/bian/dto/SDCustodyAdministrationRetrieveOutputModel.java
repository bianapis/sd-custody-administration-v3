package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedService;
import org.bian.dto.SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationRetrieveOutputModel
 */
public class SDCustodyAdministrationRetrieveOutputModel   {
  private String custodyAdministrationRetrieveActionTaskReference = null;

  private Object custodyAdministrationRetrieveActionTaskRecord = null;

  private String custodyAdministrationRetrieveActionResponse = null;

  private SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecord custodyAdministrationRetrieveActionRecord = null;

  private SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedService custodyAdministrationOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return custodyAdministrationRetrieveActionTaskReference
  **/

  public String getCustodyAdministrationRetrieveActionTaskReference() {
    return custodyAdministrationRetrieveActionTaskReference;
  }

  public void setCustodyAdministrationRetrieveActionTaskReference(String custodyAdministrationRetrieveActionTaskReference) {
    this.custodyAdministrationRetrieveActionTaskReference = custodyAdministrationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return custodyAdministrationRetrieveActionResponse
  **/

  public String getCustodyAdministrationRetrieveActionResponse() {
    return custodyAdministrationRetrieveActionResponse;
  }

  public void setCustodyAdministrationRetrieveActionResponse(String custodyAdministrationRetrieveActionResponse) {
    this.custodyAdministrationRetrieveActionResponse = custodyAdministrationRetrieveActionResponse;
  }


  /**
   * Get custodyAdministrationRetrieveActionRecord
   * @return custodyAdministrationRetrieveActionRecord
  **/

  public SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecord getCustodyAdministrationRetrieveActionRecord() {
    return custodyAdministrationRetrieveActionRecord;
  }

  public void setCustodyAdministrationRetrieveActionRecord(SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecord custodyAdministrationRetrieveActionRecord) {
    this.custodyAdministrationRetrieveActionRecord = custodyAdministrationRetrieveActionRecord;
  }


  /**
   * Get custodyAdministrationOfferedService
   * @return custodyAdministrationOfferedService
  **/

  public SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedService getCustodyAdministrationOfferedService() {
    return custodyAdministrationOfferedService;
  }

  public void setCustodyAdministrationOfferedService(SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedService custodyAdministrationOfferedService) {
    this.custodyAdministrationOfferedService = custodyAdministrationOfferedService;
  }


}

