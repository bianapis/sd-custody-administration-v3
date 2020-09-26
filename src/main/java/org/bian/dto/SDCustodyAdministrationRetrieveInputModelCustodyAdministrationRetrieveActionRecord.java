package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis;
import org.bian.dto.SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationActivityAnalysis;
import org.bian.dto.SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationPerformanceAnalysis;

import javax.validation.Valid;
  
/**
 * SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecord
 */
public class SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecord   {
  private SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationActivityAnalysis custodyAdministrationActivityAnalysis = null;

  private SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationPerformanceAnalysis custodyAdministrationPerformanceAnalysis = null;

  private SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get custodyAdministrationActivityAnalysis
   * @return custodyAdministrationActivityAnalysis
  **/

  public SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationActivityAnalysis getCustodyAdministrationActivityAnalysis() {
    return custodyAdministrationActivityAnalysis;
  }

  public void setCustodyAdministrationActivityAnalysis(SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationActivityAnalysis custodyAdministrationActivityAnalysis) {
    this.custodyAdministrationActivityAnalysis = custodyAdministrationActivityAnalysis;
  }


  /**
   * Get custodyAdministrationPerformanceAnalysis
   * @return custodyAdministrationPerformanceAnalysis
  **/

  public SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationPerformanceAnalysis getCustodyAdministrationPerformanceAnalysis() {
    return custodyAdministrationPerformanceAnalysis;
  }

  public void setCustodyAdministrationPerformanceAnalysis(SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecordCustodyAdministrationPerformanceAnalysis custodyAdministrationPerformanceAnalysis) {
    this.custodyAdministrationPerformanceAnalysis = custodyAdministrationPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCustodyAdministrationRetrieveInputModelCustodyAdministrationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

