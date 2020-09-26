package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceSubscription
 */
public class SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceSubscription   {
  private String custodyAdministrationServiceSubscriberReference = null;

  private String custodyAdministrationServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return custodyAdministrationServiceSubscriberReference
  **/

  public String getCustodyAdministrationServiceSubscriberReference() {
    return custodyAdministrationServiceSubscriberReference;
  }

  public void setCustodyAdministrationServiceSubscriberReference(String custodyAdministrationServiceSubscriberReference) {
    this.custodyAdministrationServiceSubscriberReference = custodyAdministrationServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return custodyAdministrationServiceSubscriberAccessProfile
  **/

  public String getCustodyAdministrationServiceSubscriberAccessProfile() {
    return custodyAdministrationServiceSubscriberAccessProfile;
  }

  public void setCustodyAdministrationServiceSubscriberAccessProfile(String custodyAdministrationServiceSubscriberAccessProfile) {
    this.custodyAdministrationServiceSubscriberAccessProfile = custodyAdministrationServiceSubscriberAccessProfile;
  }


}

