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
 * @TableName sending_record
 */
@TableName(value ="sending_record")
@Data
public class SendingRecord implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String title;

    /**
     * 
     */
    private Byte template;

    /**
     * 
     */
    private String sender;

    /**
     * 
     */
    private String receivers;

    /**
     * 
     */
    private String receiversCc;

    /**
     * 
     */
    private String receiversBb;

    /**
     * 
     */
    private String content;

    /**
     * 
     */
    private String appendedPath;

    /**
     * 
     */
    private Date sendDate;

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
    private Date cretateTime;

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
        SendingRecord other = (SendingRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getTemplate() == null ? other.getTemplate() == null : this.getTemplate().equals(other.getTemplate()))
            && (this.getSender() == null ? other.getSender() == null : this.getSender().equals(other.getSender()))
            && (this.getReceivers() == null ? other.getReceivers() == null : this.getReceivers().equals(other.getReceivers()))
            && (this.getReceiversCc() == null ? other.getReceiversCc() == null : this.getReceiversCc().equals(other.getReceiversCc()))
            && (this.getReceiversBb() == null ? other.getReceiversBb() == null : this.getReceiversBb().equals(other.getReceiversBb()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getAppendedPath() == null ? other.getAppendedPath() == null : this.getAppendedPath().equals(other.getAppendedPath()))
            && (this.getSendDate() == null ? other.getSendDate() == null : this.getSendDate().equals(other.getSendDate()))
            && (this.getDeleteFlg() == null ? other.getDeleteFlg() == null : this.getDeleteFlg().equals(other.getDeleteFlg()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getCretateTime() == null ? other.getCretateTime() == null : this.getCretateTime().equals(other.getCretateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getTemplate() == null) ? 0 : getTemplate().hashCode());
        result = prime * result + ((getSender() == null) ? 0 : getSender().hashCode());
        result = prime * result + ((getReceivers() == null) ? 0 : getReceivers().hashCode());
        result = prime * result + ((getReceiversCc() == null) ? 0 : getReceiversCc().hashCode());
        result = prime * result + ((getReceiversBb() == null) ? 0 : getReceiversBb().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getAppendedPath() == null) ? 0 : getAppendedPath().hashCode());
        result = prime * result + ((getSendDate() == null) ? 0 : getSendDate().hashCode());
        result = prime * result + ((getDeleteFlg() == null) ? 0 : getDeleteFlg().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getCretateTime() == null) ? 0 : getCretateTime().hashCode());
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
        sb.append(", type=").append(type);
        sb.append(", title=").append(title);
        sb.append(", template=").append(template);
        sb.append(", sender=").append(sender);
        sb.append(", receivers=").append(receivers);
        sb.append(", receiversCc=").append(receiversCc);
        sb.append(", receiversBb=").append(receiversBb);
        sb.append(", content=").append(content);
        sb.append(", appendedPath=").append(appendedPath);
        sb.append(", sendDate=").append(sendDate);
        sb.append(", deleteFlg=").append(deleteFlg);
        sb.append(", operator=").append(operator);
        sb.append(", cretateTime=").append(cretateTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}