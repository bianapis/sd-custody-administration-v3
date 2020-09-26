package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceAgreement;
import org.bian.dto.SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceConfigurationSetup;
import org.bian.dto.SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationConfigureOutputModelCustodyAdministrationServiceConfigurationRecord
 */
public class SDCustodyAdministrationConfigureOutputModelCustodyAdministrationServiceConfigurationRecord   {
  private String custodyAdministrationServiceConfigurationSettingDescription = null;

  private SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceConfigurationSetup custodyAdministrationServiceConfigurationSetup = null;

  private SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceSubscription custodyAdministrationServiceSubscription = null;

  private SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceAgreement custodyAdministrationServiceAgreement = null;

  private String custodyAdministrationServiceStatus = null;


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

  public SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceConfigurationSetup getCustodyAdministrationServiceConfigurationSetup() {
    return custodyAdministrationServiceConfigurationSetup;
  }

  public void setCustodyAdministrationServiceConfigurationSetup(SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceConfigurationSetup custodyAdministrationServiceConfigurationSetup) {
    this.custodyAdministrationServiceConfigurationSetup = custodyAdministrationServiceConfigurationSetup;
  }


  /**
   * Get custodyAdministrationServiceSubscription
   * @return custodyAdministrationServiceSubscription
  **/

  public SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceSubscription getCustodyAdministrationServiceSubscription() {
    return custodyAdministrationServiceSubscription;
  }

  public void setCustodyAdministrationServiceSubscription(SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceSubscription custodyAdministrationServiceSubscription) {
    this.custodyAdministrationServiceSubscription = custodyAdministrationServiceSubscription;
  }


  /**
   * Get custodyAdministrationServiceAgreement
   * @return custodyAdministrationServiceAgreement
  **/

  public SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceAgreement getCustodyAdministrationServiceAgreement() {
    return custodyAdministrationServiceAgreement;
  }

  public void setCustodyAdministrationServiceAgreement(SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceAgreement custodyAdministrationServiceAgreement) {
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

