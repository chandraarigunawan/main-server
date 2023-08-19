package com.main.app.web.controller;

import com.main.app.model.response.MenuDetail;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/menus")
public class MenuController {

  @RequestMapping(value = "/{menuId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public Response<MenuDetail> getMenu(@PathVariable("menuId") Long tableId) {

    return Response.ok(MenuDetail.builder().build());
  }
}
