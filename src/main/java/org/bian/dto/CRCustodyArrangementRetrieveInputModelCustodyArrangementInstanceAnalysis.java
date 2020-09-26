package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustodyArrangementRetrieveInputModelCustodyArrangementInstanceAnalysis
 */
public class CRCustodyArrangementRetrieveInputModelCustodyArrangementInstanceAnalysis   {
  private String custodyArrangementInstanceAnalysisReference = null;

  private String custodyArrangementInstanceAnalysisReportType = null;

  private String custodyArrangementInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return custodyArrangementInstanceAnalysisReference
  **/

  public String getCustodyArrangementInstanceAnalysisReference() {
    return custodyArrangementInstanceAnalysisReference;
  }

  public void setCustodyArrangementInstanceAnalysisReference(String custodyArrangementInstanceAnalysisReference) {
    this.custodyArrangementInstanceAnalysisReference = custodyArrangementInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return custodyArrangementInstanceAnalysisReportType
  **/

  public String getCustodyArrangementInstanceAnalysisReportType() {
    return custodyArrangementInstanceAnalysisReportType;
  }

  public void setCustodyArrangementInstanceAnalysisReportType(String custodyArrangementInstanceAnalysisReportType) {
    this.custodyArrangementInstanceAnalysisReportType = custodyArrangementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return custodyArrangementInstanceAnalysisParameters
  **/

  public String getCustodyArrangementInstanceAnalysisParameters() {
    return custodyArrangementInstanceAnalysisParameters;
  }

  public void setCustodyArrangementInstanceAnalysisParameters(String custodyArrangementInstanceAnalysisParameters) {
    this.custodyArrangementInstanceAnalysisParameters = custodyArrangementInstanceAnalysisParameters;
  }


}

