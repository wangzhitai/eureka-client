package com.study.api;

import com.study.dto.UserDTO;
import com.study.response.BaseResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/accountManag")
@FeignClient(name = "accountStudy")
public interface AccountService {
    @RequestMapping(value = "/addTest",method = RequestMethod.POST)
     BaseResponse addUser(UserDTO userdto);
}
