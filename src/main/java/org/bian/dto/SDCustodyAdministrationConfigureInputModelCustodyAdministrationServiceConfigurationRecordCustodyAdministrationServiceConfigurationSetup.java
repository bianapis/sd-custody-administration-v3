package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceConfigurationSetup
 */
public class SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceConfigurationSetup   {
  private String custodyAdministrationServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return custodyAdministrationServiceConfigurationParameter
  **/

  public String getCustodyAdministrationServiceConfigurationParameter() {
    return custodyAdministrationServiceConfigurationParameter;
  }

  public void setCustodyAdministrationServiceConfigurationParameter(String custodyAdministrationServiceConfigurationParameter) {
    this.custodyAdministrationServiceConfigurationParameter = custodyAdministrationServiceConfigurationParameter;
  }


}

