package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationConfigureInputModel
 */
public class SDCustodyAdministrationConfigureInputModel   {
  private Object custodyAdministrationConfigurationActionTaskRecord = null;

  private String custodyAdministrationServicingSessionReference = null;

  private String custodyAdministrationServiceReference = null;

  private SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecord custodyAdministrationServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return custodyAdministrationServicingSessionReference
  **/

  public String getCustodyAdministrationServicingSessionReference() {
    return custodyAdministrationServicingSessionReference;
  }

  public void setCustodyAdministrationServicingSessionReference(String custodyAdministrationServicingSessionReference) {
    this.custodyAdministrationServicingSessionReference = custodyAdministrationServicingSessionReference;
  }


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
   * Get custodyAdministrationServiceConfigurationRecord
   * @return custodyAdministrationServiceConfigurationRecord
  **/

  public SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecord getCustodyAdministrationServiceConfigurationRecord() {
    return custodyAdministrationServiceConfigurationRecord;
  }

  public void setCustodyAdministrationServiceConfigurationRecord(SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecord custodyAdministrationServiceConfigurationRecord) {
    this.custodyAdministrationServiceConfigurationRecord = custodyAdministrationServiceConfigurationRecord;
  }


}

