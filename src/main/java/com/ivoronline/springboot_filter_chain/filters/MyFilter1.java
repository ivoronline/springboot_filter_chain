package com.ivoronline.springboot_filter_chain.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class MyFilter1 implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    throws IOException, ServletException {

    //THIS CODE IS EXECUTED DURING HTTP REQUEST
    System.out.println("MyFilter1 : Code for HTTP Request");

    //DIVIDES HTTP REQUEST AND RESPONSE CODE
    chain.doFilter(request, response);

    //THIS CODE IS EXECUTED DURING HTTP RESPONSE
    System.out.println("MyFilter1 : Code for HTTP Response");

  }

}
