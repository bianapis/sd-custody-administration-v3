package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationActivateInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationActivateInputModelCustodyAdministrationServiceConfigurationRecord
 */
public class SDCustodyAdministrationActivateInputModelCustodyAdministrationServiceConfigurationRecord   {
  private String custodyAdministrationServiceConfigurationSettingReference = null;

  private String custodyAdministrationServiceConfigurationSettingType = null;

  private SDCustodyAdministrationActivateInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceConfigurationSetup custodyAdministrationServiceConfigurationSetup = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return custodyAdministrationServiceConfigurationSettingReference
  **/

  public String getCustodyAdministrationServiceConfigurationSettingReference() {
    return custodyAdministrationServiceConfigurationSettingReference;
  }

  public void setCustodyAdministrationServiceConfigurationSettingReference(String custodyAdministrationServiceConfigurationSettingReference) {
    this.custodyAdministrationServiceConfigurationSettingReference = custodyAdministrationServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return custodyAdministrationServiceConfigurationSettingType
  **/

  public String getCustodyAdministrationServiceConfigurationSettingType() {
    return custodyAdministrationServiceConfigurationSettingType;
  }

  public void setCustodyAdministrationServiceConfigurationSettingType(String custodyAdministrationServiceConfigurationSettingType) {
    this.custodyAdministrationServiceConfigurationSettingType = custodyAdministrationServiceConfigurationSettingType;
  }


  /**
   * Get custodyAdministrationServiceConfigurationSetup
   * @return custodyAdministrationServiceConfigurationSetup
  **/

  public SDCustodyAdministrationActivateInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceConfigurationSetup getCustodyAdministrationServiceConfigurationSetup() {
    return custodyAdministrationServiceConfigurationSetup;
  }

  public void setCustodyAdministrationServiceConfigurationSetup(SDCustodyAdministrationActivateInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceConfigurationSetup custodyAdministrationServiceConfigurationSetup) {
    this.custodyAdministrationServiceConfigurationSetup = custodyAdministrationServiceConfigurationSetup;
  }


}

