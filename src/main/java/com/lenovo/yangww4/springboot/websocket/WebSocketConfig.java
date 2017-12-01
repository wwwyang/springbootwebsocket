package com.lenovo.yangww4.springboot.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * 配置开启WebSocket支持
 * 
 * @author yangww
 *
 */
@Configuration
@EnableWebSocketMessageBroker //通过@EnableWebSocketMessageBroker 注解  开启使用STOMP 协议 来传输基于代理(message broker)的消息.这时控制器支持使用@MessageMapping
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

	@Override
	public void registerStompEndpoints(StompEndpointRegistry registry) {//注册 STOMP协议的节点, 并映射指定的URL
		registry.addEndpoint("/endpointIven").withSockJS(); //注册一个 STOMP的endpoint, 并指定使用 SockJS协议
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) { //配置消息代理 Message Broker
		registry.enableSimpleBroker("/topic"); //广播式应配置一个/topic 消息代理
	}

}
