package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationActivityAnalysis;
import org.bian.dto.SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecord
 */
public class SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecord   {
  private SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationActivityAnalysis custodyAdministrationActivityAnalysis = null;

  private SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationPerformanceAnalysis custodyAdministrationPerformanceAnalysis = null;

  private SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get custodyAdministrationActivityAnalysis
   * @return custodyAdministrationActivityAnalysis
  **/

  public SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationActivityAnalysis getCustodyAdministrationActivityAnalysis() {
    return custodyAdministrationActivityAnalysis;
  }

  public void setCustodyAdministrationActivityAnalysis(SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationActivityAnalysis custodyAdministrationActivityAnalysis) {
    this.custodyAdministrationActivityAnalysis = custodyAdministrationActivityAnalysis;
  }


  /**
   * Get custodyAdministrationPerformanceAnalysis
   * @return custodyAdministrationPerformanceAnalysis
  **/

  public SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationPerformanceAnalysis getCustodyAdministrationPerformanceAnalysis() {
    return custodyAdministrationPerformanceAnalysis;
  }

  public void setCustodyAdministrationPerformanceAnalysis(SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationPerformanceAnalysis custodyAdministrationPerformanceAnalysis) {
    this.custodyAdministrationPerformanceAnalysis = custodyAdministrationPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCustodyAdministrationRetrieveOutputModelCustodyAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

