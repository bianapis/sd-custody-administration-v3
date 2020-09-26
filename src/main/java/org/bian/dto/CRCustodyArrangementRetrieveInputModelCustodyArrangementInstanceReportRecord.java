package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustodyArrangementRetrieveInputModelCustodyArrangementInstanceReportRecord
 */
public class CRCustodyArrangementRetrieveInputModelCustodyArrangementInstanceReportRecord   {
  private String custodyArrangementInstanceReportReference = null;

  private String custodyArrangementInstanceReportType = null;

  private String custodyArrangementInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return custodyArrangementInstanceReportReference
  **/

  public String getCustodyArrangementInstanceReportReference() {
    return custodyArrangementInstanceReportReference;
  }

  public void setCustodyArrangementInstanceReportReference(String custodyArrangementInstanceReportReference) {
    this.custodyArrangementInstanceReportReference = custodyArrangementInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return custodyArrangementInstanceReportType
  **/

  public String getCustodyArrangementInstanceReportType() {
    return custodyArrangementInstanceReportType;
  }

  public void setCustodyArrangementInstanceReportType(String custodyArrangementInstanceReportType) {
    this.custodyArrangementInstanceReportType = custodyArrangementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return custodyArrangementInstanceReportParameters
  **/

  public String getCustodyArrangementInstanceReportParameters() {
    return custodyArrangementInstanceReportParameters;
  }

  public void setCustodyArrangementInstanceReportParameters(String custodyArrangementInstanceReportParameters) {
    this.custodyArrangementInstanceReportParameters = custodyArrangementInstanceReportParameters;
  }


}

