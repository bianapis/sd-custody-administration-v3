package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSafeKeepingRetrieveOutputModelSafeKeepingInstanceAnalysis
 */
public class BQSafeKeepingRetrieveOutputModelSafeKeepingInstanceAnalysis   {
  private Object safeKeepingInstanceAnalysisRecord = null;

  private String safeKeepingInstanceAnalysisReportType = null;

  private String safeKeepingInstanceAnalysisParameters = null;

  private Object safeKeepingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return safeKeepingInstanceAnalysisRecord
  **/

  public Object getSafeKeepingInstanceAnalysisRecord() {
    return safeKeepingInstanceAnalysisRecord;
  }

  public void setSafeKeepingInstanceAnalysisRecord(Object safeKeepingInstanceAnalysisRecord) {
    this.safeKeepingInstanceAnalysisRecord = safeKeepingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return safeKeepingInstanceAnalysisReportType
  **/

  public String getSafeKeepingInstanceAnalysisReportType() {
    return safeKeepingInstanceAnalysisReportType;
  }

  public void setSafeKeepingInstanceAnalysisReportType(String safeKeepingInstanceAnalysisReportType) {
    this.safeKeepingInstanceAnalysisReportType = safeKeepingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return safeKeepingInstanceAnalysisParameters
  **/

  public String getSafeKeepingInstanceAnalysisParameters() {
    return safeKeepingInstanceAnalysisParameters;
  }

  public void setSafeKeepingInstanceAnalysisParameters(String safeKeepingInstanceAnalysisParameters) {
    this.safeKeepingInstanceAnalysisParameters = safeKeepingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return safeKeepingInstanceAnalysisReport
  **/

  public Object getSafeKeepingInstanceAnalysisReport() {
    return safeKeepingInstanceAnalysisReport;
  }

  public void setSafeKeepingInstanceAnalysisReport(Object safeKeepingInstanceAnalysisReport) {
    this.safeKeepingInstanceAnalysisReport = safeKeepingInstanceAnalysisReport;
  }


}

