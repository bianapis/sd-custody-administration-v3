package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSecuritiesReportingRetrieveOutputModelSecuritiesReportingInstanceAnalysis
 */
public class BQSecuritiesReportingRetrieveOutputModelSecuritiesReportingInstanceAnalysis   {
  private Object securitiesReportingInstanceAnalysisRecord = null;

  private String securitiesReportingInstanceAnalysisReportType = null;

  private String securitiesReportingInstanceAnalysisParameters = null;

  private Object securitiesReportingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return securitiesReportingInstanceAnalysisRecord
  **/

  public Object getSecuritiesReportingInstanceAnalysisRecord() {
    return securitiesReportingInstanceAnalysisRecord;
  }

  public void setSecuritiesReportingInstanceAnalysisRecord(Object securitiesReportingInstanceAnalysisRecord) {
    this.securitiesReportingInstanceAnalysisRecord = securitiesReportingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return securitiesReportingInstanceAnalysisReportType
  **/

  public String getSecuritiesReportingInstanceAnalysisReportType() {
    return securitiesReportingInstanceAnalysisReportType;
  }

  public void setSecuritiesReportingInstanceAnalysisReportType(String securitiesReportingInstanceAnalysisReportType) {
    this.securitiesReportingInstanceAnalysisReportType = securitiesReportingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return securitiesReportingInstanceAnalysisParameters
  **/

  public String getSecuritiesReportingInstanceAnalysisParameters() {
    return securitiesReportingInstanceAnalysisParameters;
  }

  public void setSecuritiesReportingInstanceAnalysisParameters(String securitiesReportingInstanceAnalysisParameters) {
    this.securitiesReportingInstanceAnalysisParameters = securitiesReportingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return securitiesReportingInstanceAnalysisReport
  **/

  public Object getSecuritiesReportingInstanceAnalysisReport() {
    return securitiesReportingInstanceAnalysisReport;
  }

  public void setSecuritiesReportingInstanceAnalysisReport(Object securitiesReportingInstanceAnalysisReport) {
    this.securitiesReportingInstanceAnalysisReport = securitiesReportingInstanceAnalysisReport;
  }


}

