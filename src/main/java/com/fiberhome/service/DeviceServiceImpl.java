package com.fiberhome.service;

import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl  implements IDeviceService{


    @Override
    public Long getCpuUsage() {
        // 调用设备接口。。。
        return 50L;
}
}
