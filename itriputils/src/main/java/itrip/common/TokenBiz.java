package itrip.common;

import cn.itrip.pojo.ItripUser;
import cz.mallat.uasparser.UserAgentInfo;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TokenBiz {


    /***
     * @param agent Http头中的user-agent信息
     * @param user 用户信息
     * @return Token格式<br/>
     * 	PC：“前缀PC-USERCODE-USERID-CREATIONDATE-RONDEM[6位]”
     *  <br/>
     *  Android：“前缀ANDROID-USERCODE-USERID-CREATIONDATE-RONDEM[6位]”
     */
    public String generateToken(String agent, ItripUser user) {
        // TODO Auto-generated method stub
        try {
            UserAgentInfo userAgentInfo = UserAgentUtil.getUasParser().parse(
                    agent);
            StringBuilder sb = new StringBuilder();
            sb.append("token:");//统一前缀
            if (userAgentInfo.getDeviceType().equals(UserAgentInfo.UNKNOWN)) {
                if (UserAgentUtil.CheckAgent(agent)) {
                    sb.append("MOBILE-");
                } else {
                    sb.append("PC-");
                }
            } else if (userAgentInfo.getDeviceType()
                    .equals("Personal computer")) {
                sb.append("PC-");
            } else
                sb.append("MOBILE-");
//			sb.append(user.getUserCode() + "-");
            sb.append(MD5.getMd5(user.getUserCode(),32) + "-");//加密用户名称
            sb.append(user.getId() + "-");
            sb.append(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())
                    + "-");
            sb.append(MD5.getMd5(agent, 6));// 识别客户端的简化实现——6位MD5码

            return sb.toString();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
