package com.main.app.web.controller;

import com.main.app.model.response.CategoryDetail;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
  @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public Response<List<CategoryDetail>> getTables() {

    return Response.ok(Collections.singletonList(CategoryDetail.builder().build()));
  }
}
