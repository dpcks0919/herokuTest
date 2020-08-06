package com.sample.springboot;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sample.springboot.dao.SimpleMessageDAO;
@RestController
public class TestController {
  @Autowired SimpleMessageDAO smd;
  
  @RequestMapping("/select")
  public List<Map<String, ?>> getMessages() {
    return smd.selectAll();
  }
}