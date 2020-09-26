package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationActivateInputModelCustodyAdministrationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationActivateInputModel
 */
public class SDCustodyAdministrationActivateInputModel   {
  private Object custodyAdministrationActivationActionTaskRecord = null;

  private String custodyAdministrationCenterReference = null;

  private String custodyAdministrationServiceReference = null;

  private SDCustodyAdministrationActivateInputModelCustodyAdministrationServiceConfigurationRecord custodyAdministrationServiceConfigurationRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return custodyAdministrationCenterReference
  **/

  public String getCustodyAdministrationCenterReference() {
    return custodyAdministrationCenterReference;
  }

  public void setCustodyAdministrationCenterReference(String custodyAdministrationCenterReference) {
    this.custodyAdministrationCenterReference = custodyAdministrationCenterReference;
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

  public SDCustodyAdministrationActivateInputModelCustodyAdministrationServiceConfigurationRecord getCustodyAdministrationServiceConfigurationRecord() {
    return custodyAdministrationServiceConfigurationRecord;
  }

  public void setCustodyAdministrationServiceConfigurationRecord(SDCustodyAdministrationActivateInputModelCustodyAdministrationServiceConfigurationRecord custodyAdministrationServiceConfigurationRecord) {
    this.custodyAdministrationServiceConfigurationRecord = custodyAdministrationServiceConfigurationRecord;
  }


}

