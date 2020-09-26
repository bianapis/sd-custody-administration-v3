package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationConfigureOutputModelCustodyAdministrationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationConfigureOutputModel
 */
public class SDCustodyAdministrationConfigureOutputModel   {
  private String custodyAdministrationConfigurationActionTaskReference = null;

  private Object custodyAdministrationConfigurationActionTaskRecord = null;

  private SDCustodyAdministrationConfigureOutputModelCustodyAdministrationServiceConfigurationRecord custodyAdministrationServiceConfigurationRecord = null;

  private String custodyAdministrationServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return custodyAdministrationConfigurationActionTaskReference
  **/

  public String getCustodyAdministrationConfigurationActionTaskReference() {
    return custodyAdministrationConfigurationActionTaskReference;
  }

  public void setCustodyAdministrationConfigurationActionTaskReference(String custodyAdministrationConfigurationActionTaskReference) {
    this.custodyAdministrationConfigurationActionTaskReference = custodyAdministrationConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return custodyAdministrationConfigurationActionTaskRecord
  **/

  public Object getCustodyAdministrationConfigurationActionTaskRecord() {
    return custodyAdministrationConfigurationActionTaskRecord;
  }

  public void setCustodyAdministrationConfigurationActionTaskRecord(Object custodyAdministrationConfigurationActionTaskRecord) {
    this.custodyAdministrationConfigurationActionTaskRecord = custodyAdministrationConfigurationActionTaskRecord;
  }


  /**
   * Get custodyAdministrationServiceConfigurationRecord
   * @return custodyAdministrationServiceConfigurationRecord
  **/

  public SDCustodyAdministrationConfigureOutputModelCustodyAdministrationServiceConfigurationRecord getCustodyAdministrationServiceConfigurationRecord() {
    return custodyAdministrationServiceConfigurationRecord;
  }

  public void setCustodyAdministrationServiceConfigurationRecord(SDCustodyAdministrationConfigureOutputModelCustodyAdministrationServiceConfigurationRecord custodyAdministrationServiceConfigurationRecord) {
    this.custodyAdministrationServiceConfigurationRecord = custodyAdministrationServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return custodyAdministrationServicingSessionStatus
  **/

  public String getCustodyAdministrationServicingSessionStatus() {
    return custodyAdministrationServicingSessionStatus;
  }

  public void setCustodyAdministrationServicingSessionStatus(String custodyAdministrationServicingSessionStatus) {
    this.custodyAdministrationServicingSessionStatus = custodyAdministrationServicingSessionStatus;
  }


}

