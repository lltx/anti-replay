package online.inote.naruto.anti.replay.sample.entity;

import lombok.Data;
import lombok.experimental.FieldNameConstants;

import java.io.Serializable;

/**
 * @description 用户实体对象
 * @author XQF.Sui
 * @date 2021/07/30 01:55
 */
@Data
@FieldNameConstants
public class UserEntity implements Serializable {

  private static final long serialVersionUID = -5105665728771577022L;

  private String name;
  private Integer age;
}
