package cn.iocoder.yudao.module.iot.dal.redis;

import cn.iocoder.yudao.module.iot.dal.dataobject.device.IotDevicePropertyDO;

/**
 * Iot Redis Key 枚举类
 *
 * @author 芋道源码
 */
public interface RedisKeyConstants {

    /**
     * 设备属性的数据缓存，采用 HASH 结构
     * <p>
     * KEY 格式：device_property:{deviceKey}
     * HASH KEY：identifier 属性标识
     * VALUE 数据类型：String(JSON) {@link IotDevicePropertyDO}
     */
    String DEVICE_PROPERTY = "device_property:%s";

    /**
     * 设备的最后上报时间，采用 ZSET 结构
     *
     * KEY 格式：{deviceKey}
     * SCORE：上报时间
     */
    String DEVICE_REPORT_TIME = "device_report_time";

    /**
     * 设备信息的数据缓存，使用 Spring Cache 操作
     *
     * KEY 格式：device_${productKey}_${deviceKey}
     * VALUE 数据类型：String(JSON)
     */
    String DEVICE  = "device";

    /**
     * 物模型的数据缓存，使用 Spring Cache 操作
     *
     * KEY 格式：thing_model_${productKey}
     * VALUE 数据类型：String 数组(JSON)，即 {@link cn.iocoder.yudao.module.iot.dal.dataobject.thingmodel.IotThingModelDO} 列表
     */
    String THING_MODEL_LIST = "thing_model_list";

}
