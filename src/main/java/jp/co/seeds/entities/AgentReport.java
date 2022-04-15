package jp.co.seeds.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName agent_report
 */
@TableName(value ="agent_report")
@Data
public class AgentReport implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 
     */
    private String code;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String shortName;

    /**
     * 
     */
    private String nameKana;

    /**
     * 1:acq 
2:issuer
3:merchant 
4:merchant onus
5:vender
9:other

     */
    private String agentType;

    /**
     * 1:A部署
2:B部署
     */
    private String partment;

    /**
     * 
     */
    private Byte vip;

    /**
     * 01:b2b
02:b2c
09:other
     */
    private String connectType;

    /**
     * 1:cpm
2:mpm

     */
    private String payType;

    /**
     * 
     */
    private String accessSftpTime;

    /**
     * 
     */
    private String cooperationAgent;

    /**
     * 
     */
    private String cooperationMerchant;

    /**
     * 
     */
    private String remarks;

    /**
     * 1:deleted
0:use
     */
    private Integer deleteFlg;

    /**
     * 
     */
    private String operator;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AgentReport other = (AgentReport) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getShortName() == null ? other.getShortName() == null : this.getShortName().equals(other.getShortName()))
            && (this.getNameKana() == null ? other.getNameKana() == null : this.getNameKana().equals(other.getNameKana()))
            && (this.getAgentType() == null ? other.getAgentType() == null : this.getAgentType().equals(other.getAgentType()))
            && (this.getPartment() == null ? other.getPartment() == null : this.getPartment().equals(other.getPartment()))
            && (this.getVip() == null ? other.getVip() == null : this.getVip().equals(other.getVip()))
            && (this.getConnectType() == null ? other.getConnectType() == null : this.getConnectType().equals(other.getConnectType()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getAccessSftpTime() == null ? other.getAccessSftpTime() == null : this.getAccessSftpTime().equals(other.getAccessSftpTime()))
            && (this.getCooperationAgent() == null ? other.getCooperationAgent() == null : this.getCooperationAgent().equals(other.getCooperationAgent()))
            && (this.getCooperationMerchant() == null ? other.getCooperationMerchant() == null : this.getCooperationMerchant().equals(other.getCooperationMerchant()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
            && (this.getDeleteFlg() == null ? other.getDeleteFlg() == null : this.getDeleteFlg().equals(other.getDeleteFlg()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getShortName() == null) ? 0 : getShortName().hashCode());
        result = prime * result + ((getNameKana() == null) ? 0 : getNameKana().hashCode());
        result = prime * result + ((getAgentType() == null) ? 0 : getAgentType().hashCode());
        result = prime * result + ((getPartment() == null) ? 0 : getPartment().hashCode());
        result = prime * result + ((getVip() == null) ? 0 : getVip().hashCode());
        result = prime * result + ((getConnectType() == null) ? 0 : getConnectType().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getAccessSftpTime() == null) ? 0 : getAccessSftpTime().hashCode());
        result = prime * result + ((getCooperationAgent() == null) ? 0 : getCooperationAgent().hashCode());
        result = prime * result + ((getCooperationMerchant() == null) ? 0 : getCooperationMerchant().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
        result = prime * result + ((getDeleteFlg() == null) ? 0 : getDeleteFlg().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", shortName=").append(shortName);
        sb.append(", nameKana=").append(nameKana);
        sb.append(", agentType=").append(agentType);
        sb.append(", partment=").append(partment);
        sb.append(", vip=").append(vip);
        sb.append(", connectType=").append(connectType);
        sb.append(", payType=").append(payType);
        sb.append(", accessSftpTime=").append(accessSftpTime);
        sb.append(", cooperationAgent=").append(cooperationAgent);
        sb.append(", cooperationMerchant=").append(cooperationMerchant);
        sb.append(", remarks=").append(remarks);
        sb.append(", deleteFlg=").append(deleteFlg);
        sb.append(", operator=").append(operator);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}