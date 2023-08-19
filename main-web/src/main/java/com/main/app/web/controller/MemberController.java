package com.main.app.web.controller;

import com.main.app.model.response.MemberDetail;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController {
  @RequestMapping(value = "/{memberId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
  public Response<MemberDetail> getMember(@PathVariable("memberId") Long memberId) {

    return Response.ok(MemberDetail.builder().build());
  }
}
