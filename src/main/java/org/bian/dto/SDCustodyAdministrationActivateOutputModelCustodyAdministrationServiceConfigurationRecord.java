package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationActivateInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceConfigurationSetup;
import org.bian.dto.SDCustodyAdministrationActivateOutputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceAgreement;
import org.bian.dto.SDCustodyAdministrationActivateOutputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationActivateOutputModelCustodyAdministrationServiceConfigurationRecord
 */
public class SDCustodyAdministrationActivateOutputModelCustodyAdministrationServiceConfigurationRecord   {
  private String custodyAdministrationServiceConfigurationSettingReference = null;

  private String custodyAdministrationServiceConfigurationSettingDescription = null;

  private SDCustodyAdministrationActivateInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceConfigurationSetup custodyAdministrationServiceConfigurationSetup = null;

  private SDCustodyAdministrationActivateOutputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceSubscription custodyAdministrationServiceSubscription = null;

  private SDCustodyAdministrationActivateOutputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceAgreement custodyAdministrationServiceAgreement = null;

  private String custodyAdministrationServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return custodyAdministrationServiceConfigurationSettingDescription
  **/

  public String getCustodyAdministrationServiceConfigurationSettingDescription() {
    return custodyAdministrationServiceConfigurationSettingDescription;
  }

  public void setCustodyAdministrationServiceConfigurationSettingDescription(String custodyAdministrationServiceConfigurationSettingDescription) {
    this.custodyAdministrationServiceConfigurationSettingDescription = custodyAdministrationServiceConfigurationSettingDescription;
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


  /**
   * Get custodyAdministrationServiceSubscription
   * @return custodyAdministrationServiceSubscription
  **/

  public SDCustodyAdministrationActivateOutputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceSubscription getCustodyAdministrationServiceSubscription() {
    return custodyAdministrationServiceSubscription;
  }

  public void setCustodyAdministrationServiceSubscription(SDCustodyAdministrationActivateOutputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceSubscription custodyAdministrationServiceSubscription) {
    this.custodyAdministrationServiceSubscription = custodyAdministrationServiceSubscription;
  }


  /**
   * Get custodyAdministrationServiceAgreement
   * @return custodyAdministrationServiceAgreement
  **/

  public SDCustodyAdministrationActivateOutputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceAgreement getCustodyAdministrationServiceAgreement() {
    return custodyAdministrationServiceAgreement;
  }

  public void setCustodyAdministrationServiceAgreement(SDCustodyAdministrationActivateOutputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceAgreement custodyAdministrationServiceAgreement) {
    this.custodyAdministrationServiceAgreement = custodyAdministrationServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return custodyAdministrationServiceStatus
  **/

  public String getCustodyAdministrationServiceStatus() {
    return custodyAdministrationServiceStatus;
  }

  public void setCustodyAdministrationServiceStatus(String custodyAdministrationServiceStatus) {
    this.custodyAdministrationServiceStatus = custodyAdministrationServiceStatus;
  }


}

