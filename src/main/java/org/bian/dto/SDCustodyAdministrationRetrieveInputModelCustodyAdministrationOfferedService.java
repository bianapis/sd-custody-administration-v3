package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationRetrieveInputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecord;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationRetrieveInputModelCustodyAdministrationOfferedService
 */
public class SDCustodyAdministrationRetrieveInputModelCustodyAdministrationOfferedService   {
  private String custodyAdministrationServiceReference = null;

  private SDCustodyAdministrationRetrieveInputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecord custodyAdministrationServiceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return custodyAdministrationServiceReference
  **/

  public String getCustodyAdministrationServiceReference() {
    return custodyAdministrationServiceReference;
  }

  public void setCustodyAdministrationServiceReference(String custodyAdministrationServiceReference) {
    this.custodyAdministrationServiceReference = custodyAdministrationServiceReference;
  }


  /**
   * Get custodyAdministrationServiceRecord
   * @return custodyAdministrationServiceRecord
  **/

  public SDCustodyAdministrationRetrieveInputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecord getCustodyAdministrationServiceRecord() {
    return custodyAdministrationServiceRecord;
  }

  public void setCustodyAdministrationServiceRecord(SDCustodyAdministrationRetrieveInputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecord custodyAdministrationServiceRecord) {
    this.custodyAdministrationServiceRecord = custodyAdministrationServiceRecord;
  }


}

