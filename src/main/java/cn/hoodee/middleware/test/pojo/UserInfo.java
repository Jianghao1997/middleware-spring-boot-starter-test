package cn.hoodee.middleware.test.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Package: com.hoodee.middleware.demo.pojo
 *
 * @Description：
 * @Author: 蒋豪
 * @Date: 2022.01.21 19:56
 * @Modified By:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {

    private String name;

    private Integer age;

    private String address;
}

