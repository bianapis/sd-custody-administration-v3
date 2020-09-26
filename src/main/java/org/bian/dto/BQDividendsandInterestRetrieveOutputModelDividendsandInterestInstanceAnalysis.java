package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDividendsandInterestRetrieveOutputModelDividendsandInterestInstanceAnalysis
 */
public class BQDividendsandInterestRetrieveOutputModelDividendsandInterestInstanceAnalysis   {
  private Object dividendsandInterestInstanceAnalysisRecord = null;

  private String dividendsandInterestInstanceAnalysisReportType = null;

  private String dividendsandInterestInstanceAnalysisParameters = null;

  private Object dividendsandInterestInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return dividendsandInterestInstanceAnalysisRecord
  **/

  public Object getDividendsandInterestInstanceAnalysisRecord() {
    return dividendsandInterestInstanceAnalysisRecord;
  }

  public void setDividendsandInterestInstanceAnalysisRecord(Object dividendsandInterestInstanceAnalysisRecord) {
    this.dividendsandInterestInstanceAnalysisRecord = dividendsandInterestInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return dividendsandInterestInstanceAnalysisReportType
  **/

  public String getDividendsandInterestInstanceAnalysisReportType() {
    return dividendsandInterestInstanceAnalysisReportType;
  }

  public void setDividendsandInterestInstanceAnalysisReportType(String dividendsandInterestInstanceAnalysisReportType) {
    this.dividendsandInterestInstanceAnalysisReportType = dividendsandInterestInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return dividendsandInterestInstanceAnalysisParameters
  **/

  public String getDividendsandInterestInstanceAnalysisParameters() {
    return dividendsandInterestInstanceAnalysisParameters;
  }

  public void setDividendsandInterestInstanceAnalysisParameters(String dividendsandInterestInstanceAnalysisParameters) {
    this.dividendsandInterestInstanceAnalysisParameters = dividendsandInterestInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return dividendsandInterestInstanceAnalysisReport
  **/

  public Object getDividendsandInterestInstanceAnalysisReport() {
    return dividendsandInterestInstanceAnalysisReport;
  }

  public void setDividendsandInterestInstanceAnalysisReport(Object dividendsandInterestInstanceAnalysisReport) {
    this.dividendsandInterestInstanceAnalysisReport = dividendsandInterestInstanceAnalysisReport;
  }


}

