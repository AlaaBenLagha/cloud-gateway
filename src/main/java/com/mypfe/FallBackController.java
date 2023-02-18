//package com.mypfe;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import reactor.core.publisher.Mono;
//
//@RestController
//public class FallBackController {
//	
//	@RequestMapping("/checkFallBack")
//	public Mono<String> checkServiceFallBack(){
//		return Mono.just("Check Service is taking too long to respond or is down. Please try again later");
//	}
//	
//	
//	
//	@RequestMapping("/processingFallBack")
//	public Mono<String> processingServiceFallBack(){
//		return Mono.just("Processing Service is taking too long to respond or is down. Please try again later");
//	}
//	
//	
//
//}
