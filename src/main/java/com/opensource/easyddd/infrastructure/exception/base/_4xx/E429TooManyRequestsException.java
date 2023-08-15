package com.opensource.easyddd.infrastructure.exception.base._4xx;

import com.opensource.easyddd.infrastructure.exception.ModuleCode;
import com.opensource.easyddd.infrastructure.exception.base._5xx.ExceptionCodeError;

/**
 * 包名：com.maxhub.os.infrastructure.exception.base
 * 文件名：UnauthorizedExecption.class
 * 版权：Copyright by CVTE 公司
 * 描述：
 * 修改人：陈旭(chenxu9741@cvte.com)
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 *
 * @author 陈旭
 * @group [][] xx
 * @date 2023-03-06 18:40
 **/
public class E429TooManyRequestsException extends BaseClientException {

    public E429TooManyRequestsException(ModuleCode serverMode, int customerErrorCode, String message) throws ExceptionCodeError {
        super(serverMode, customerErrorCode,message);
    }


    /**
     * {@code 429 Too Many Requests}.
     * @see <a href="https://tools.ietf.org/html/rfc6585#section-4">Additional HTTP Status Codes</a>
      */
    @Override
    protected int getHttpErrorCode() {
        return 29;
    }
}
