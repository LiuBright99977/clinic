package cn.project.controller;

import cn.project.entity.Prescription_AdditionalFees;
import cn.project.service.additionalFeesService.AdditionalFeesService;
import cn.project.utils.Response;
import cn.project.utils.ResponseEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(tags = "附加费用控制器")
@RequestMapping("additionalFees")
public class AdditionalFeesController {
    @Resource
    AdditionalFeesService additionalFeesService;

    @GetMapping("/getAllAdditionalFees")
    @ApiOperation(value = "获取所有附加费用")
    public Response getAllAdditionalFees(){
        return new Response(ResponseEnum.SUCCESS).setResponseBody(additionalFeesService.getAllAdditionalFees());
    }

    @GetMapping("/addAdditionalFees")
    @ApiOperation(value = "新增附加费用")
    public Response getAllAdditionalFees(Prescription_AdditionalFees prescription_additionalFees){
        additionalFeesService.addAdditionalFees(prescription_additionalFees);
        return new Response(ResponseEnum.SUCCESS);
    }
}
