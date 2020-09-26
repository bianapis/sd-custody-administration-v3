package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationActivateOutputModelCustodyAdministrationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationActivateOutputModel
 */
public class SDCustodyAdministrationActivateOutputModel   {
  private String custodyAdministrationActivationActionTaskReference = null;

  private Object custodyAdministrationActivationActionTaskRecord = null;

  private String custodyAdministrationServicingSessionReference = null;

  private Object custodyAdministrationServicingSessionRecord = null;

  private SDCustodyAdministrationActivateOutputModelCustodyAdministrationServiceConfigurationRecord custodyAdministrationServiceConfigurationRecord = null;

  private String custodyAdministrationServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return custodyAdministrationActivationActionTaskReference
  **/

  public String getCustodyAdministrationActivationActionTaskReference() {
    return custodyAdministrationActivationActionTaskReference;
  }

  public void setCustodyAdministrationActivationActionTaskReference(String custodyAdministrationActivationActionTaskReference) {
    this.custodyAdministrationActivationActionTaskReference = custodyAdministrationActivationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return custodyAdministrationActivationActionTaskRecord
  **/

  public Object getCustodyAdministrationActivationActionTaskRecord() {
    return custodyAdministrationActivationActionTaskRecord;
  }

  public void setCustodyAdministrationActivationActionTaskRecord(Object custodyAdministrationActivationActionTaskRecord) {
    this.custodyAdministrationActivationActionTaskRecord = custodyAdministrationActivationActionTaskRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return custodyAdministrationServicingSessionRecord
  **/

  public Object getCustodyAdministrationServicingSessionRecord() {
    return custodyAdministrationServicingSessionRecord;
  }

  public void setCustodyAdministrationServicingSessionRecord(Object custodyAdministrationServicingSessionRecord) {
    this.custodyAdministrationServicingSessionRecord = custodyAdministrationServicingSessionRecord;
  }


  /**
   * Get custodyAdministrationServiceConfigurationRecord
   * @return custodyAdministrationServiceConfigurationRecord
  **/

  public SDCustodyAdministrationActivateOutputModelCustodyAdministrationServiceConfigurationRecord getCustodyAdministrationServiceConfigurationRecord() {
    return custodyAdministrationServiceConfigurationRecord;
  }

  public void setCustodyAdministrationServiceConfigurationRecord(SDCustodyAdministrationActivateOutputModelCustodyAdministrationServiceConfigurationRecord custodyAdministrationServiceConfigurationRecord) {
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

