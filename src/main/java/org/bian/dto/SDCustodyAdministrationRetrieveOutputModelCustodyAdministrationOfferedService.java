package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecord;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedService
 */
public class SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedService   {
  private String custodyAdministrationServiceReference = null;

  private SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecord custodyAdministrationServiceRecord = null;


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

  public SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecord getCustodyAdministrationServiceRecord() {
    return custodyAdministrationServiceRecord;
  }

  public void setCustodyAdministrationServiceRecord(SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecord custodyAdministrationServiceRecord) {
    this.custodyAdministrationServiceRecord = custodyAdministrationServiceRecord;
  }


}

