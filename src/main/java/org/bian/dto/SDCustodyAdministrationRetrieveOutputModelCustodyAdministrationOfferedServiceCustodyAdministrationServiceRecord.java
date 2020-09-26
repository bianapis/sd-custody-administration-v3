package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecordCustodyAdministrationServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecord
 */
public class SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecord   {
  private String custodyAdministrationServiceType = null;

  private String custodyAdministrationServiceVersion = null;

  private String custodyAdministrationServiceDescription = null;

  private SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecordCustodyAdministrationServicePoliciesandGuidelines custodyAdministrationServicePoliciesandGuidelines = null;

  private String custodyAdministrationServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return custodyAdministrationServiceType
  **/

  public String getCustodyAdministrationServiceType() {
    return custodyAdministrationServiceType;
  }

  public void setCustodyAdministrationServiceType(String custodyAdministrationServiceType) {
    this.custodyAdministrationServiceType = custodyAdministrationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return custodyAdministrationServiceVersion
  **/

  public String getCustodyAdministrationServiceVersion() {
    return custodyAdministrationServiceVersion;
  }

  public void setCustodyAdministrationServiceVersion(String custodyAdministrationServiceVersion) {
    this.custodyAdministrationServiceVersion = custodyAdministrationServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return custodyAdministrationServiceDescription
  **/

  public String getCustodyAdministrationServiceDescription() {
    return custodyAdministrationServiceDescription;
  }

  public void setCustodyAdministrationServiceDescription(String custodyAdministrationServiceDescription) {
    this.custodyAdministrationServiceDescription = custodyAdministrationServiceDescription;
  }


  /**
   * Get custodyAdministrationServicePoliciesandGuidelines
   * @return custodyAdministrationServicePoliciesandGuidelines
  **/

  public SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecordCustodyAdministrationServicePoliciesandGuidelines getCustodyAdministrationServicePoliciesandGuidelines() {
    return custodyAdministrationServicePoliciesandGuidelines;
  }

  public void setCustodyAdministrationServicePoliciesandGuidelines(SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationOfferedServiceCustodyAdministrationServiceRecordCustodyAdministrationServicePoliciesandGuidelines custodyAdministrationServicePoliciesandGuidelines) {
    this.custodyAdministrationServicePoliciesandGuidelines = custodyAdministrationServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return custodyAdministrationServiceSchedule
  **/

  public String getCustodyAdministrationServiceSchedule() {
    return custodyAdministrationServiceSchedule;
  }

  public void setCustodyAdministrationServiceSchedule(String custodyAdministrationServiceSchedule) {
    this.custodyAdministrationServiceSchedule = custodyAdministrationServiceSchedule;
  }


}

