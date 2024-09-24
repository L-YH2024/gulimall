package com.atguigu.gulimall.gateway.serverconfig;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioChannelOption;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class NettyServerConfig implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        ServerBootstrap bootstrap = new ServerBootstrap();
        NioEventLoopGroup bossGroup = new NioEventLoopGroup();
        NioEventLoopGroup workerGroup = new NioEventLoopGroup();

        bootstrap.group(bossGroup, workerGroup);
        bootstrap.channel(NioServerSocketChannel.class);
        bootstrap.childOption(NioChannelOption.TCP_NODELAY, true);
        bootstrap.childOption(NioChannelOption.SO_REUSEADDR, true);
        bootstrap.childOption(NioChannelOption.SO_KEEPALIVE, false);
        bootstrap.childOption(NioChannelOption.SO_RCVBUF, 2048);
        bootstrap.childOption(NioChannelOption.SO_SNDBUF, 2048);

        bootstrap.childHandler(new ChannelInitializer<SocketChannel>() {
            @Override
            public void initChannel(SocketChannel ch) throws Exception {
                ChannelPipeline p = ch.pipeline();
                p.addLast("codec",new HttpServerCodec());
                p.addLast("aggregator",new HttpObject)
                p.addLast("",)
                p.addLast("",)
                p.addLast("",)
            }
        });

    }
}
