package jp.co.seeds.view;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
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

    @PostConstruct
    public void init() {

        logger.info("==========SendView:init===========");

        workTypes = new HashMap<>();
        workTypes.put("OnePay障害", "bugInfo");
        workTypes.put( "SFTP遅延","delayInfo");
        workTypes.put("定期メンテナンス","maintenanceInfo");
        workTypes.put("OnePay案内","information");
        workTypes.put("カスタマイズ発信","customize");

        acqList = new ArrayList<>();
        acqList.add("JACCS");
        acqList.add("オリコ");
        acqList.add("オリックス");
        acqList.add("キャナルペイメントサービス");

    }

    public void onItemSelect(){
        logger.info("==========SendView:onItemSelect===========");
        String[] testacqs = {"オリックス","オリコ"};
        setSelectedAcq(testacqs);
    }

}
