package com.lenovo.yangww4.springboot.websocket.web;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.lenovo.yangww4.springboot.websocket.domain.IvenMessage;
import com.lenovo.yangww4.springboot.websocket.domain.IvenResponse;

@Controller
public class IvenController {

	@MessageMapping("/welcome") // 当浏览器向服务器端发送请求时, 通过@MessageMapping映射到/welcome这个地址上, 类似于RequestMapping
	@SendTo("/topic/getResponse") // 当服务器端有消息时, 会对订阅了@SendTo中的路径的浏览器发送消息
	public IvenResponse say(IvenMessage message) throws InterruptedException {
		Thread.sleep(3000);
		return new IvenResponse(String.format("<br>Welcome, %s!", message.getName()));
	}
}
