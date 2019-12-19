package org.tmdrk.toturial.io.nio.netty.performancetuning;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @ClassName MyClient
 * @Description TODO
 * @Author zhoujie
 * @Date 2019/8/9 12:46
 * @Version 1.0
 **/
public class MyClient {
    public static void main(String[] args) throws Exception {
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();
        try{
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(eventLoopGroup)
                    .channel(NioSocketChannel.class)
                    .option(ChannelOption.SO_REUSEADDR,true)
                    .handler(new MyClientInitializer());

            for(int i=0;i<1000;i++){
                ChannelFuture channelFuture = bootstrap.connect("localhost", 8899).sync();
                channelFuture.addListener(future -> {
                    if (!future.isSuccess()) {
                        System.out.println("connect failed,exit!");
                        System.exit(0);
                    }
                });
            }
        }finally {
            eventLoopGroup.shutdownGracefully();
        }
    }
}
