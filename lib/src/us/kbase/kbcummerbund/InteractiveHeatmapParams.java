
package us.kbase.kbcummerbund;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: interactiveHeatmapParams</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "workspace_name",
    "sample1",
    "sample2",
    "logMode",
    "removezeroes",
    "condition_select",
    "q_value_cutoff",
    "log2_fold_change_cutoff",
    "num_genes",
    "ws_cuffdiff_id",
    "ws_expression_matrix_id"
})
public class InteractiveHeatmapParams {

    @JsonProperty("workspace_name")
    private String workspaceName;
    @JsonProperty("sample1")
    private String sample1;
    @JsonProperty("sample2")
    private String sample2;
    @JsonProperty("logMode")
    private String logMode;
    @JsonProperty("removezeroes")
    private String removezeroes;
    @JsonProperty("condition_select")
    private String conditionSelect;
    @JsonProperty("q_value_cutoff")
    private Double qValueCutoff;
    @JsonProperty("log2_fold_change_cutoff")
    private Double log2FoldChangeCutoff;
    @JsonProperty("num_genes")
    private Long numGenes;
    @JsonProperty("ws_cuffdiff_id")
    private String wsCuffdiffId;
    @JsonProperty("ws_expression_matrix_id")
    private String wsExpressionMatrixId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("workspace_name")
    public String getWorkspaceName() {
        return workspaceName;
    }

    @JsonProperty("workspace_name")
    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public InteractiveHeatmapParams withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    @JsonProperty("sample1")
    public String getSample1() {
        return sample1;
    }

    @JsonProperty("sample1")
    public void setSample1(String sample1) {
        this.sample1 = sample1;
    }

    public InteractiveHeatmapParams withSample1(String sample1) {
        this.sample1 = sample1;
        return this;
    }

    @JsonProperty("sample2")
    public String getSample2() {
        return sample2;
    }

    @JsonProperty("sample2")
    public void setSample2(String sample2) {
        this.sample2 = sample2;
    }

    public InteractiveHeatmapParams withSample2(String sample2) {
        this.sample2 = sample2;
        return this;
    }

    @JsonProperty("logMode")
    public String getLogMode() {
        return logMode;
    }

    @JsonProperty("logMode")
    public void setLogMode(String logMode) {
        this.logMode = logMode;
    }

    public InteractiveHeatmapParams withLogMode(String logMode) {
        this.logMode = logMode;
        return this;
    }

    @JsonProperty("removezeroes")
    public String getRemovezeroes() {
        return removezeroes;
    }

    @JsonProperty("removezeroes")
    public void setRemovezeroes(String removezeroes) {
        this.removezeroes = removezeroes;
    }

    public InteractiveHeatmapParams withRemovezeroes(String removezeroes) {
        this.removezeroes = removezeroes;
        return this;
    }

    @JsonProperty("condition_select")
    public String getConditionSelect() {
        return conditionSelect;
    }

    @JsonProperty("condition_select")
    public void setConditionSelect(String conditionSelect) {
        this.conditionSelect = conditionSelect;
    }

    public InteractiveHeatmapParams withConditionSelect(String conditionSelect) {
        this.conditionSelect = conditionSelect;
        return this;
    }

    @JsonProperty("q_value_cutoff")
    public Double getQValueCutoff() {
        return qValueCutoff;
    }

    @JsonProperty("q_value_cutoff")
    public void setQValueCutoff(Double qValueCutoff) {
        this.qValueCutoff = qValueCutoff;
    }

    public InteractiveHeatmapParams withQValueCutoff(Double qValueCutoff) {
        this.qValueCutoff = qValueCutoff;
        return this;
    }

    @JsonProperty("log2_fold_change_cutoff")
    public Double getLog2FoldChangeCutoff() {
        return log2FoldChangeCutoff;
    }

    @JsonProperty("log2_fold_change_cutoff")
    public void setLog2FoldChangeCutoff(Double log2FoldChangeCutoff) {
        this.log2FoldChangeCutoff = log2FoldChangeCutoff;
    }

    public InteractiveHeatmapParams withLog2FoldChangeCutoff(Double log2FoldChangeCutoff) {
        this.log2FoldChangeCutoff = log2FoldChangeCutoff;
        return this;
    }

    @JsonProperty("num_genes")
    public Long getNumGenes() {
        return numGenes;
    }

    @JsonProperty("num_genes")
    public void setNumGenes(Long numGenes) {
        this.numGenes = numGenes;
    }

    public InteractiveHeatmapParams withNumGenes(Long numGenes) {
        this.numGenes = numGenes;
        return this;
    }

    @JsonProperty("ws_cuffdiff_id")
    public String getWsCuffdiffId() {
        return wsCuffdiffId;
    }

    @JsonProperty("ws_cuffdiff_id")
    public void setWsCuffdiffId(String wsCuffdiffId) {
        this.wsCuffdiffId = wsCuffdiffId;
    }

    public InteractiveHeatmapParams withWsCuffdiffId(String wsCuffdiffId) {
        this.wsCuffdiffId = wsCuffdiffId;
        return this;
    }

    @JsonProperty("ws_expression_matrix_id")
    public String getWsExpressionMatrixId() {
        return wsExpressionMatrixId;
    }

    @JsonProperty("ws_expression_matrix_id")
    public void setWsExpressionMatrixId(String wsExpressionMatrixId) {
        this.wsExpressionMatrixId = wsExpressionMatrixId;
    }

    public InteractiveHeatmapParams withWsExpressionMatrixId(String wsExpressionMatrixId) {
        this.wsExpressionMatrixId = wsExpressionMatrixId;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((((((((((((((((("InteractiveHeatmapParams"+" [workspaceName=")+ workspaceName)+", sample1=")+ sample1)+", sample2=")+ sample2)+", logMode=")+ logMode)+", removezeroes=")+ removezeroes)+", conditionSelect=")+ conditionSelect)+", qValueCutoff=")+ qValueCutoff)+", log2FoldChangeCutoff=")+ log2FoldChangeCutoff)+", numGenes=")+ numGenes)+", wsCuffdiffId=")+ wsCuffdiffId)+", wsExpressionMatrixId=")+ wsExpressionMatrixId)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
