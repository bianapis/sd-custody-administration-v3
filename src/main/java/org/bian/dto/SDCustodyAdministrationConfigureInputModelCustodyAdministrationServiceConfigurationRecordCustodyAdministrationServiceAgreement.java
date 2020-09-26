package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceAgreement
 */
public class SDCustodyAdministrationConfigureInputModelCustodyAdministrationServiceConfigurationRecordCustodyAdministrationServiceAgreement   {
  private String custodyAdministrationServiceAgreementReference = null;

  private String custodyAdministrationServiceUserReference = null;

  private String custodyAdministrationServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return custodyAdministrationServiceAgreementReference
  **/

  public String getCustodyAdministrationServiceAgreementReference() {
    return custodyAdministrationServiceAgreementReference;
  }

  public void setCustodyAdministrationServiceAgreementReference(String custodyAdministrationServiceAgreementReference) {
    this.custodyAdministrationServiceAgreementReference = custodyAdministrationServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return custodyAdministrationServiceUserReference
  **/

  public String getCustodyAdministrationServiceUserReference() {
    return custodyAdministrationServiceUserReference;
  }

  public void setCustodyAdministrationServiceUserReference(String custodyAdministrationServiceUserReference) {
    this.custodyAdministrationServiceUserReference = custodyAdministrationServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return custodyAdministrationServiceAgreementTermsandConditions
  **/

  public String getCustodyAdministrationServiceAgreementTermsandConditions() {
    return custodyAdministrationServiceAgreementTermsandConditions;
  }

  public void setCustodyAdministrationServiceAgreementTermsandConditions(String custodyAdministrationServiceAgreementTermsandConditions) {
    this.custodyAdministrationServiceAgreementTermsandConditions = custodyAdministrationServiceAgreementTermsandConditions;
  }


}

