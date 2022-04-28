package jp.co.seeds.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jp.co.seeds.entities.Email;
import jp.co.seeds.service.EmailService;
import jp.co.seeds.mapper.EmailMapper;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class EmailServiceImpl extends ServiceImpl<EmailMapper, Email>
    implements EmailService{

}




