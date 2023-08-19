package com.main.app.web.controller;

import com.main.app.model.response.TableDetail;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/tables")
public class TableController {

  @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public Response<List<TableDetail>> getTables() {

    return Response.ok(Collections.singletonList(TableDetail.builder().build()));
  }

  @RequestMapping(value = "/{tableId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public Response<TableDetail> getTable(@PathVariable("tableId") Long tableId) {

    return Response.ok(TableDetail.builder().build());
  }
}
