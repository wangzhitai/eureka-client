package com.study.service;

import com.study.api.AccountService;
import com.study.dao.UserTestDAO;
import com.study.dataobject.UserTestDO;
import com.study.dto.UserDTO;
import com.study.enums.AccountErrorEnum;
import com.study.exception.AccountException;
import com.study.response.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@Api(tags = "用户相关操作")
public class AccountServiceImpl implements AccountService {

    @Resource
    private UserTestDAO userTestDAO;


    @ApiOperation("添加用户")
    @Override
    public BaseResponse addUser(@RequestBody  @Valid UserDTO userdto) {
        UserTestDO userTestDO=new UserTestDO();
        if ("Common".equals(userdto.getUserType())){
            throw new AccountException(AccountErrorEnum.EMAIL_FORMAT_ERROR);
        }
        BeanUtils.copyProperties(userdto,userTestDO);
        userTestDAO.insert(userTestDO);
        return BaseResponse.sendSuccessData(userTestDO);

    }
}
