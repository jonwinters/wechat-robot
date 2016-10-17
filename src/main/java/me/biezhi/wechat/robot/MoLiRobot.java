package me.biezhi.wechat.robot;

import com.blade.kit.StringKit;
import com.blade.kit.http.HttpRequest;

import com.sun.istack.internal.logging.Logger;
import me.biezhi.wechat.Constant;
import me.biezhi.wechat.service.WechatService;
import org.slf4j.LoggerFactory;

public class MoLiRobot implements Robot {

	private String apiUrl;
	private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(WechatService.class);
	public MoLiRobot() {
		String api_key = Constant.config.get("itpk.api_key");
		String api_secret = Constant.config.get("itpk.api_secret");
		if(StringKit.isNotBlank(api_key) && StringKit.isNotBlank(api_secret)){
			this.apiUrl = Constant.ITPK_API + "?api_key=" + api_key + "&api_secret=" + api_secret;
		}
	}

	@Override
	public String talk(String msg) {
//		if(null == this.apiUrl){
//			return "机器人正在工作";
//		}
		//String url = apiUrl + "&question=" + msg;
		LOGGER.info(msg);
		//String result = HttpRequest.get(url).connectTimeout(3000).body();
		return msg;
	}

}
