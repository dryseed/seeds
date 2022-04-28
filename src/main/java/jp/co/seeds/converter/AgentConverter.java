package jp.co.seeds.converter;
import jp.co.seeds.entities.AgentReport;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "agentConverter")
public class AgentConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext facesContext, UIComponent uiComponent, String s) {
        return null;
    }

    @Override
    public String getAsString(FacesContext facesContext, UIComponent uiComponent, Object o) {
        if(o==null){
            return "";
        }
        if(o instanceof AgentReport){
            AgentReport ag =(AgentReport) o;
            return ag.getShortName();
        }else{
            throw new ConverterException(new FacesMessage(o+ "is not a valid agent report"));
        }

    }
}
