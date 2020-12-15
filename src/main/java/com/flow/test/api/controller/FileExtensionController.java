package com.flow.test.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flow.test.api.dto.ExtensionRequest;

@RequestMapping("/api/v1")
@RestController
public class FileExtensionController {

	@PostMapping("/extension/fixed")
	public ResponseEntity<String> save(@RequestBody ExtensionRequest extensionRequest) {
		return ResponseEntity.ok().body(extensionRequest.getExtension());
	}
}
