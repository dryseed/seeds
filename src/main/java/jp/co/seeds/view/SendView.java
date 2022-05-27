package jp.co.seeds.view;

import jp.co.seeds.entities.AgentReport;
import jp.co.seeds.service.AgentReportService;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@RequestScoped
@ManagedBean
@Data
public class SendView {

    Logger logger = LoggerFactory.getLogger(getClass());

    private boolean showCustomerConditionFlg;
    private boolean showFixConditionFlg;
    private boolean showMsgSendAreaFlg;

    private String workType ;
    private String sendCategoriesChoice;
    private Map<String, String> workTypes = new HashMap<>();
    private Map<String, String> sendContentCategories = new HashMap<>();
    private List<AgentReport> selectedIssuer;
    private List<AgentReport> issuerList;
    private List<AgentReport> selectedInclude;
    private List<AgentReport> includeList;
    private List<AgentReport> selectedVendor;
    private List<AgentReport> vendorList;
    private List<AgentReport> selectedMerchant;
    private List<AgentReport> merchantList;
    private List<AgentReport> selectedOthers;
    private List<AgentReport>  othersList;
    private List<AgentReport> agentList;
    private List<AgentReport> agentListSelected ;
    private List<AgentReport> listAgentReport;

    @Resource
    private AgentReportService agentReportService;

    @PostConstruct
    public void init() {
        showCustomerConditionFlg = true;
        showFixConditionFlg = false;
        showMsgSendAreaFlg = false;

        issuerList = new ArrayList<>();
        includeList=new ArrayList<>();
        vendorList = new ArrayList<>();
        merchantList = new ArrayList<>();
        othersList = new ArrayList<>();
        agentList = new ArrayList<>();
        listAgentReport = agentReportService.list();

        workTypes = new HashMap<>();
        workTypes.put("OnePay障害", "bugInfo");
        workTypes.put( "SFTP遅延","delayInfo");
        workTypes.put("定期メンテナンス","maintenanceInfo");
        workTypes.put("OnePay案内","information");

        sendContentCategories = new HashMap<>();
        sendContentCategories.put("初回通知", "firstMsgInfo");
        sendContentCategories.put( "リカバリー完了通知","endMsgInfo");

        if(listAgentReport==null || listAgentReport.size() == 0) {
            logger.info("sendviewPage:データの取得処理が失敗しました");;
        }else {
            for(AgentReport ag : listAgentReport){
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("01")){
                    agentList.add(ag);
                }
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("02")){
                    issuerList.add(ag);
                }
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("03")){
                    includeList.add(ag);
                }
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("04")){
                    vendorList.add(ag);
                }
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("05")){
                    merchantList.add(ag);
                }
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("09")){
                    othersList.add(ag);
                }
            }
        }

    }

    public void onItemSelect(){
        logger.info("==========SendView:agentList =");
        agentListSelected= new ArrayList<>();
        selectedIssuer = new ArrayList<>();
        selectedInclude = new ArrayList<>();
        selectedVendor = new ArrayList<>();
        selectedMerchant = new ArrayList<>();
        selectedOthers = new ArrayList<>();

        showCustomerConditionFlg = false;
        showFixConditionFlg = true;
        showMsgSendAreaFlg = false;

        if("delayInfo".equals(workType)){
            for(AgentReport ag : listAgentReport){
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("01")){
                    agentListSelected.add(ag);
                }
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("02")){
                    selectedIssuer.add(ag);
                }
            }
        }
        else if("bugInfo".equals(workType)){
            for(AgentReport ag : listAgentReport){
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("03")){
                    selectedInclude.add(ag);
                }
            }
        }
        else if("maintenanceInfo".equals(workType)){
            for(AgentReport ag : listAgentReport){
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("04")){
                    selectedVendor.add(ag);
                }
            }
        }
        else if("information".equals(workType)){
            for(AgentReport ag : listAgentReport){
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("05")){
                    selectedMerchant.add(ag);
                }
            }
        }
        else{
            showCustomerConditionFlg = true;
            showFixConditionFlg = false;
        }

    }

    public  void searchTarget(){
        logger.info("==========SendView:searchTarget =");

        showMsgSendAreaFlg= true;
    }

    public void conditionReset(){
        selectedIssuer = null;
        selectedInclude = null;
        selectedVendor = null;
        selectedMerchant = null;
        selectedOthers = null;
        agentListSelected=null;
        showMsgSendAreaFlg = false;
    }
}
