package com.demo.cloud_gatway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/orderfallback")
    public Mono<String> orderServiceFallBack(){
        return Mono.just("order service is taking too long to response or is down. please try again!");

    }
    @RequestMapping("/paymentfallback")
    public Mono<String> paymentServiceFallBack(){
        return Mono.just("payment service is taking too long to response or is down. please try again!");

    }
}
