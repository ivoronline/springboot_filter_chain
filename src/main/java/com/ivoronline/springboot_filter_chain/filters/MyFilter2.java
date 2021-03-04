package com.ivoronline.springboot_filter_chain.filters;

import org.springframework.stereotype.Component;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

@Component
public class MyFilter2 implements Filter {

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
    throws IOException, ServletException {

    //THIS CODE IS EXECUTED DURING HTTP REQUEST
    System.out.println("MyFilter2 : Code for HTTP Request");

    //DIVIDES HTTP REQUEST AND RESPONSE CODE
    chain.doFilter(request, response);

    //THIS CODE IS EXECUTED DURING HTTP RESPONSE
    System.out.println("MyFilter2 : Code for HTTP Response");

  }

}
