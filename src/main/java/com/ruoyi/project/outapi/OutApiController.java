package com.ruoyi.project.outapi;

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.project.outapi.bo.SignInDTO;
import com.ruoyi.project.work.signIn.service.ISignInService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/outApi")
@Api(value = "对外接口汇总",tags = "对外接口")
public class OutApiController  extends BaseController {

    @Resource
    private ISignInService signInService;


    @PostMapping("/signIn")
    @ApiOperation(value = "签到接口")
    public AjaxResult signIn(@RequestBody SignInDTO signInDTO){
        return toAjax(signInService.insertSignIn(signInDTO.convertTo()));
    }
}
