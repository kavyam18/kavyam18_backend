//package com.excel.demo.controller;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class BaseController {
//
//	@GetMapping("/home")
//    public ResponseEntity<String> homeGetReq() {
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Hello");
//    	
//    }
//	@PostMapping("/home/{str}")
//    public ResponseEntity<String> homePostReq(@PathVariable String str, @RequestParam String name,@RequestParam String age) {
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(str + " " + " " +name + " " + age);
//    	
//    }
//	@PutMapping("/home/{str}")
//    public ResponseEntity<String> homePutReq(@PathVariable String str, @RequestParam String name,@RequestParam int age) {
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(str + " " + " " +name + " " + age);
//    	
//    }
//	@DeleteMapping("/home/{str}")
//    public ResponseEntity<String> homeDeleteReq(@PathVariable String str, @RequestParam String name,@RequestParam String age) {
//		return ResponseEntity.ok(null);
//    	
//    }
//}
