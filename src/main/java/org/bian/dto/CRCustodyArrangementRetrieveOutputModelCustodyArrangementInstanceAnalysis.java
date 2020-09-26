package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustodyArrangementRetrieveOutputModelCustodyArrangementInstanceAnalysis
 */
public class CRCustodyArrangementRetrieveOutputModelCustodyArrangementInstanceAnalysis   {
  private String custodyArrangementInstanceAnalysisData = null;

  private String custodyArrangementInstanceAnalysisReportType = null;

  private Object custodyArrangementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return custodyArrangementInstanceAnalysisData
  **/

  public String getCustodyArrangementInstanceAnalysisData() {
    return custodyArrangementInstanceAnalysisData;
  }

  public void setCustodyArrangementInstanceAnalysisData(String custodyArrangementInstanceAnalysisData) {
    this.custodyArrangementInstanceAnalysisData = custodyArrangementInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return custodyArrangementInstanceAnalysisReport
  **/

  public Object getCustodyArrangementInstanceAnalysisReport() {
    return custodyArrangementInstanceAnalysisReport;
  }

  public void setCustodyArrangementInstanceAnalysisReport(Object custodyArrangementInstanceAnalysisReport) {
    this.custodyArrangementInstanceAnalysisReport = custodyArrangementInstanceAnalysisReport;
  }


}

