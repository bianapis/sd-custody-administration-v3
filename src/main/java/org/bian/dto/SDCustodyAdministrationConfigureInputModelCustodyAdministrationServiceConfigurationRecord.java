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
 * SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecord
 */
public class SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecord   {
  private String custodyAdministrationServiceConfigurationSettingReference = null;

  private String custodyAdministrationServiceConfigurationSettingType = null;

  private SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceConfigurationSetup custodyAdministrationServiceConfigurationSetup = null;

  private SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceSubscription custodyAdministrationServiceSubscription = null;

  private SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceAgreement custodyAdministrationServiceAgreement = null;


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


}

