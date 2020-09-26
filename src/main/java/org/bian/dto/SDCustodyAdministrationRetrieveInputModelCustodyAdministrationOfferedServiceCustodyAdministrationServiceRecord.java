package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationRetrieveInputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecord
 */
public class SDCustodyAdministrationRetrieveInputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecord   {
  private String custodyAdministrationServiceVersion = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return custodyAdministrationServiceVersion
  **/

  public String getCustodyAdministrationServiceVersion() {
    return custodyAdministrationServiceVersion;
  }

  public void setCustodyAdministrationServiceVersion(String custodyAdministrationServiceVersion) {
    this.custodyAdministrationServiceVersion = custodyAdministrationServiceVersion;
  }


}

