package jp.co.seeds.view;

import jp.co.seeds.entities.AgentReport;
import jp.co.seeds.service.AgentReportService;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import sun.awt.util.IdentityLinkedList;

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

    private String workType ;
    private Map<String, String> workTypes = new HashMap<>();

    private String[] selectedAcq;
    private List<String> acqList;

    private String[] selectedIssuer;
    private List<String> issuerList;

    private String[] selectedInclude;
    private List<String> includeList;

    private String[] selectedVendor;
    private List<String> vendorList;

    private String[] selectedMerchant;
    private List<String> merchantList;

    private String[] selectedOthers;
    private List<String> othersList;

    private List<String> agentListSelected;
    private List<AgentReport> agentList;

    @Resource
    private AgentReportService agentReportService;

    @PostConstruct
    public void init() {

        logger.info("==========SendView:init===========");
        workTypes = new HashMap<>();
        workTypes.put("OnePay障害", "bugInfo");
        workTypes.put( "SFTP遅延","delayInfo");
        workTypes.put("定期メンテナンス","maintenanceInfo");
        workTypes.put("OnePay案内","information");

        acqList = new ArrayList<>();
        issuerList = new ArrayList<>();
        includeList=new ArrayList<>();
        vendorList = new ArrayList<>();
        merchantList = new ArrayList<>();
        othersList = new ArrayList<>();
        agentList = new ArrayList<AgentReport>();


        List<AgentReport> listAgentReport = agentReportService.list();
        if(listAgentReport==null || listAgentReport.size() == 0) {
            logger.info("sendviewPage:データの取得処理が失敗しました");;
        }else {
            for(AgentReport ag : listAgentReport){
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("01")){
                    acqList.add(ag.getShortName());
                    agentList.add(ag);
                }
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("02")){
                    issuerList.add(ag.getShortName());
                }
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("03")){
                    includeList.add(ag.getShortName());
                }
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("04")){
                    vendorList.add(ag.getShortName());
                }
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("05")){
                    merchantList.add(ag.getShortName());
                }
                if(ag.getAgentType()!=null&&ag.getAgentType().equals("09")){
                    othersList.add(ag.getShortName());
                }
            }
        }






    }

    public void onItemSelect(){
        logger.info("==========SendView:onItemSelect===========");
        String[] testacqs = {"オリックス","オリコ"};
        setSelectedAcq(testacqs);
    }

}
