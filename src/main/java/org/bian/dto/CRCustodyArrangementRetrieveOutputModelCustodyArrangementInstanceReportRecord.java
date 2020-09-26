package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustodyArrangementRetrieveOutputModelCustodyArrangementInstanceReportRecord
 */
public class CRCustodyArrangementRetrieveOutputModelCustodyArrangementInstanceReportRecord   {
  private String custodyArrangementInstanceReportData = null;

  private String custodyArrangementInstanceReportType = null;

  private Object custodyArrangementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return custodyArrangementInstanceReportData
  **/

  public String getCustodyArrangementInstanceReportData() {
    return custodyArrangementInstanceReportData;
  }

  public void setCustodyArrangementInstanceReportData(String custodyArrangementInstanceReportData) {
    this.custodyArrangementInstanceReportData = custodyArrangementInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return custodyArrangementInstanceReport
  **/

  public Object getCustodyArrangementInstanceReport() {
    return custodyArrangementInstanceReport;
  }

  public void setCustodyArrangementInstanceReport(Object custodyArrangementInstanceReport) {
    this.custodyArrangementInstanceReport = custodyArrangementInstanceReport;
  }


}

