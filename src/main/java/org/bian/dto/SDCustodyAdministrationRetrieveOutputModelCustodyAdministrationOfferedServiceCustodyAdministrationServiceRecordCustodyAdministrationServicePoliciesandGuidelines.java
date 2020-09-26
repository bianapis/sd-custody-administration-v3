package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecordCustodyAdministrationServicePoliciesandGuidelines
 */
public class SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecordCustodyAdministrationServicePoliciesandGuidelines   {
  private String custodyAdministrationServiceEligibility = null;

  private String custodyAdministrationServiceIntendedUses = null;

  private String custodyAdministrationServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return custodyAdministrationServiceEligibility
  **/

  public String getCustodyAdministrationServiceEligibility() {
    return custodyAdministrationServiceEligibility;
  }

  public void setCustodyAdministrationServiceEligibility(String custodyAdministrationServiceEligibility) {
    this.custodyAdministrationServiceEligibility = custodyAdministrationServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return custodyAdministrationServiceIntendedUses
  **/

  public String getCustodyAdministrationServiceIntendedUses() {
    return custodyAdministrationServiceIntendedUses;
  }

  public void setCustodyAdministrationServiceIntendedUses(String custodyAdministrationServiceIntendedUses) {
    this.custodyAdministrationServiceIntendedUses = custodyAdministrationServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return custodyAdministrationServicePricingandTerms
  **/

  public String getCustodyAdministrationServicePricingandTerms() {
    return custodyAdministrationServicePricingandTerms;
  }

  public void setCustodyAdministrationServicePricingandTerms(String custodyAdministrationServicePricingandTerms) {
    this.custodyAdministrationServicePricingandTerms = custodyAdministrationServicePricingandTerms;
  }


}

